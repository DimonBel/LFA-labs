# Parser & Building an Abstract Syntax Tree

### Course: Formal Languages & Finite Automata
### Author: Belih Dmitrii

----

## Overview
&ensp;&ensp;&ensp; The process of gathering syntactical meaning or doing a syntactical analysis over some text can also be called parsing. It usually results in a parse tree which can also contain semantic information that could be used in subsequent stages of compilation, for example.

&ensp;&ensp;&ensp; Similarly to a parse tree, in order to represent the structure of an input text one could create an Abstract Syntax Tree (AST). This is a data structure that is organized hierarchically in abstraction layers that represent the constructs or entities that form up the initial text. These can come in handy also in the analysis of programs or some processes involved in compilation.


## Objectives:
1. Get familiar with parsing, what it is and how it can be programmed [1].
2. Get familiar with the concept of AST [2].
3. In addition to what has been done in the 3rd lab work do the following:
    1. In case you didn't have a type that denotes the possible types of tokens you need to:
        1. Have a type __*TokenType*__ (like an enum) that can be used in the lexical analysis to categorize the tokens.
        2. Please use regular expressions to identify the type of the token.
    2. Implement the necessary data structures for an AST that could be used for the text you have processed in the 3rd lab work.
    3. Implement a simple parser program that could extract the syntactic information from the input text.



## AST Parser Implementation Description

### Overview

The code implements a parser for a simple programming language, which parses expressions and assignment statements, builds an Abstract Syntax Tree (AST), and evaluates the expressions. The implementation includes lexical analysis (tokenization), parsing, and AST traversal and evaluation. We've added a tree visualization component to help understand the structure of the parsed code.

## Core Components

### Lexical Analysis

The `Lexer` class is responsible for breaking down the input string into tokens. It scans the input character by character, identifying different token types like numbers, words (identifiers), and operators.

```java
public List<Token> tokenize() {
    while (pos < length) {
        final char current = peek(0);
        if (Character.isDigit(current)) tokenizeNumber();
        else if (Character.isLetter(current)) tokenizeWord();
        else if (current == '#') {
            next();
            tokenizeHexNumber();
        }
        else if (OPERATOR_CHARS.indexOf(current) != -1) {
            tokenizeOperator();
        } else {
            // whitespaces
            next();
        }
    }
    return tokens;
}
```

This method iterates through the input string. For each character, it determines the type of token it represents (number, word, hexadecimal number, or operator) and calls the corresponding tokenization method. If the character is a whitespace, it simply moves to the next character.

### Parsing

The `Parser` class takes the tokens from the lexer and constructs an AST. It implements a recursive descent parser with methods for parsing different grammar rules.

```java
public List<Statement> parse() {
    final List<Statement> result = new ArrayList<>();
    while (!match(TokenType.EOF)) {
        result.add(statement());
    }
    return result;
}
```

This method parses a sequence of statements until it reaches the end of the token stream. Each statement is parsed and added to the result list.

The parser follows the grammar rules of the language, using methods like `expression()`, `additive()`, `multiplicative()`, `unary()`, and `primary()` to handle different expression types based on precedence.

```java
private Expression additive() {
    Expression result = multiplicative();

    while (true) {
        if (match(TokenType.PLUS)) {
            result = new BinaryExpression('+', result, multiplicative());
            continue;
        }
        if (match(TokenType.MINUS)) {
            result = new BinaryExpression('-', result, multiplicative());
            continue;
        }
        break;
    }

    return result;
}
```

This method handles additive expressions (addition and subtraction). It first parses a multiplicative expression, then checks if the next token is a plus or minus. If it is, it creates a binary expression with the operator and parses another multiplicative expression. This continues until no more addition or subtraction operators are found.

### Abstract Syntax Tree (AST)

The AST represents the structure of the parsed code. It consists of different node types:
- `Statement` interface: represents a statement in the language
- `Expression` interface: represents an expression in the language
- Various implementations like `AssignmentStatement`, `BinaryExpression`, `UnaryExpression`, `NumberExpression`, and `VariabletExpression`

```java
public final class AssignmentStatement implements Statement {
    private final String variable;
    private final Expression expression;

    public AssignmentStatement(String variable, Expression expression) {
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public void execute() {
        final double result = expression.eval();
        Variables.set(variable, result);
    }
    // ...
}
```

The `AssignmentStatement` class represents an assignment statement (e.g., `x = 5`). It holds the variable name and the expression being assigned. When executed, it evaluates the expression and sets the variable to the resulting value.

```java
public final class BinaryExpression implements Expression {
    private final Expression expr1, expr2;
    private final char operation;
    
    // Constructor and getters...

    @Override
    public double eval() {
        switch (operation) {
            case '-': return expr1.eval() - expr2.eval();
            case '*': return expr1.eval() * expr2.eval();
            case '/': return expr1.eval() / expr2.eval();
            case '+':
            default:
                return expr1.eval() + expr2.eval();
        }
    }
    // ...
}
```

The `BinaryExpression` class represents a binary operation (e.g., `2 + 3`). It holds the left and right operands as expressions, and the operation to perform. When evaluated, it evaluates both operands and combines them according to the operation.

### AST Visualization

The new `ASTPrinter` class provides a way to visualize the structure of the AST:

```java
public static void print(List<Statement> statements) {
    System.out.println("AST Tree:");
    for (Statement statement : statements) {
        printStatement(statement, 0);
    }
}
```

This method prints the AST starting from the list of statements. It calls `printStatement` for each statement.

```java
private static void printStatement(Statement statement, int depth) {
    String indent = getIndent(depth);
    
    if (statement instanceof AssignmentStatement) {
        AssignmentStatement assignment = (AssignmentStatement) statement;
        System.out.println(indent + "Assignment:");
        System.out.println(indent + INDENT + "Variable: " + assignment.getVariable());
        System.out.println(indent + INDENT + "Expression:");
        printExpression(assignment.getExpression(), depth + 2);
    } else {
        System.out.println(indent + "Unknown Statement: " + statement.getClass().getSimpleName());
    }
}
```

This method prints a statement with the appropriate indentation. If the statement is an assignment, it prints the variable name and calls `printExpression` to print the expression being assigned. The `depth` parameter controls the level of indentation.

```java
private static void printExpression(Expression expression, int depth) {
    String indent = getIndent(depth);
    
    if (expression instanceof NumberExpression) {
        NumberExpression num = (NumberExpression) expression;
        System.out.println(indent + "Number: " + num.getValue());
    } else if (expression instanceof VariabletExpression) {
        VariabletExpression var = (VariabletExpression) expression;
        System.out.println(indent + "Variable: " + var.getName());
    } else if (expression instanceof BinaryExpression) {
        BinaryExpression binary = (BinaryExpression) expression;
        System.out.println(indent + "Binary Operation: " + binary.getOperation());
        System.out.println(indent + INDENT + "Left:");
        printExpression(binary.getLeftExpression(), depth + 2);
        System.out.println(indent + INDENT + "Right:");
        printExpression(binary.getRightExpression(), depth + 2);
    } else if (expression instanceof UnaryExpression) {
        UnaryExpression unary = (UnaryExpression) expression;
        System.out.println(indent + "Unary Operation: " + unary.getOperation());
        System.out.println(indent + INDENT + "Expression:");
        printExpression(unary.getExpression(), depth + 2);
    } else {
        System.out.println(indent + "Unknown Expression: " + expression.getClass().getSimpleName());
    }
}
```

This method prints an expression with the appropriate indentation. Depending on the type of expression, it prints different information:
- For number expressions, it prints the value
- For variable expressions, it prints the variable name
- For binary expressions, it prints the operation and recursively prints the left and right operands
- For unary expressions, it prints the operation and recursively prints the operand

The recursive nature of these methods allows the printer to represent the hierarchical structure of the AST, making it easier to understand the relationships between nodes.

## Main Application

The `Main` class ties everything together:

```java
public static void main(String[] args) {
    final String input1 = "word = 2 + 2\nword2 = PI + word";
    
    final List<Token> tokens = new Lexer(input1).tokenize();
    // Print tokens
    
    final List<Statement> statements = new Parser(tokens).parse();
    // Print statements
    
    // Print the AST tree
    ASTPrinter.print(statements);
    
    // Execute statements
    for (Statement statement : statements) {
        statement.execute();
    }
    // Print results
}
```

This method:
1. Creates a lexer with the input string and tokenizes it
2. Creates a parser with the tokens and parses them into statements
3. Prints the tokens, statements, and AST tree
4. Executes the statements
5. Prints the results

## Conclusion

The implementation follows a classic compiler structure:
1. Lexical analysis: Breaking the input into tokens
2. Parsing: Organizing the tokens into a structured representation (AST)
3. Execution: Traversing the AST to evaluate expressions and execute statements

The addition of the AST printer enhances the tool by providing a visual representation of the parsed code structure, which is valuable for debugging and understanding the language.


## References:
[1] [Parsing Wiki](https://en.wikipedia.org/wiki/Parsing)

[2] [Abstract Syntax Tree Wiki](https://en.wikipedia.org/wiki/Abstract_syntax_tree)
 







