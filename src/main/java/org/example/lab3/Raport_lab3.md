# Lexer & Scanner

### Course: Formal Languages & Finite Automata
### Author: Belih Dmitrii

----

## Theory

A **Lexer**, also known as a lexical analyzer, is a fundamental component of a compiler or interpreter that processes input text and converts it into a sequence of tokens. A token is a structured representation of meaningful elements in a programming language, such as keywords, identifiers, literals, operators, and punctuation. The lexer plays a crucial role in breaking down the raw input into a form that is easier for subsequent stages, like parsing, to process.

- A lexer operates using a set of predefined rules, often specified using regular expressions or finite automata, to recognize and classify different tokens. It scans the input sequentially, grouping characters into meaningful units.
- The concept of lexical analysis can be related to finite automata, as a lexer can be implemented using **Deterministic Finite Automata (DFA)** or **Nondeterministic Finite Automata (NFA)** to efficiently recognize token patterns.

A **Deterministic Lexer** follows a strict rule where, given a current state and an input character, there is only one possible next state. This approach ensures predictability and efficiency. On the other hand, a **Nondeterministic Lexer** may have multiple possible transitions for a given input, requiring additional steps to resolve ambiguity, such as backtracking or lookahead techniques.

Lexers can be categorized based on their complexity and functionality:
- **Simple Lexers** work with a basic set of rules and operate in a single pass, making them efficient for straightforward tokenization tasks.
- **Complex Lexers** may involve multiple passes, require symbol tables, and handle context-sensitive lexical analysis, such as resolving reserved keywords from identifiers.

Despite its role as a separate phase in many compiler architectures, lexical analysis is closely tied to syntax analysis, as the output of the lexer serves as the input for the parser. Optimizing the lexer for efficiency ensures faster and more reliable language processing.


## Objectives:

- Understand what lexical analysis [1] is.

- Get familiar with the inner workings of a lexer/scanner/tokenizer.

- Implement a sample lexer and show how it works.

Note: Just because too many students were showing me the same idea of lexer for a calculator, I've decided to specify requirements for such case. Try to make it at least a little more complex. Like, being able to pass integers and floats, also to be able to perform trigonometric operations (cos and sin). But it does not mean that you need to do the calculator, you can pick anything interesting you want

## Implementation Description

The **Lexer** class is responsible for tokenizing an input string into meaningful components, which can then be used for parsing. The lexer scans the input, identifies tokens based on predefined rules, and classifies them into categories such as **keywords**, **identifiers**, **numbers**, **strings**, **operators**.

# **Core Functionalities**

## **Lexer Class**

The **Lexer** class is the core of this lexical analysis implementation. It processes the input string and generates tokens based on predefined rules. Below, we'll delve into each component with more details to provide a comprehensive understanding of how the lexer works.

### **Key Components of the Lexer**

#### **Constants**
- **OPERATOR_CHARS**: A string that contains all valid operator characters (`+-*/()`). These characters are used for recognizing operators in the input string.

- **OPERATOR_TOKENS**: An array of `TokenType` enums corresponding to the operator characters. This mapping ensures that when an operator character is encountered, it can be associated with its respective token type (e.g., `+` maps to `TokenType.PLUS`, `(` maps to `TokenType.LPAREN`, etc.).

### **Fields**
- **input**: The input string to be tokenized. This is the raw source code or data that the lexer will process.

- **length**: The length of the input string. This helps in iterating through the entire input without going out of bounds.

- **tokens**: A list that stores all the generated tokens. Each token represents a meaningful piece of information extracted from the input string (e.g., numbers, words, operators).

- **pos**: The current position in the input string being processed. This pointer moves forward as the lexer scans the input.

### **Constructor**
The constructor initializes the lexer with the input string and sets up the `tokens` list. The `pos` field is initialized to `0`, indicating that the lexer starts scanning from the beginning of the input string.

### **Main Method: `tokenize()`**
This method is responsible for iterating through the input string character by character. Based on the type of character encountered, it calls the appropriate helper method to handle tokenization:

- **Digits**: If a digit is encountered, the lexer calls `tokenizeNumber()` to handle integer or floating-point numbers.

- **Letters**: If a letter is encountered, the lexer calls `tokenizeWord()` to handle identifiers or keywords.

- **Hash (#)**: If a hash symbol (`#`) is encountered, the lexer calls `tokenizeHexNumber()` to handle hexadecimal numbers.

- **Operators**: If an operator character (from `OPERATOR_CHARS`) is found, the lexer calls `tokenizeOperator()` to map the operator to its corresponding token type.

- **Whitespace**: Whitespace characters (spaces, tabs, etc.) are skipped, as they do not contribute to the token stream.

Once the entire input string has been processed, the method returns the list of tokens.

### **Helper Methods**

#### **`tokenizeNumber()`**
This method handles the tokenization of both integer and floating-point numbers. It uses a `StringBuilder` to accumulate digits and optionally a single decimal point. If multiple decimal points are encountered, the method throws an exception, as this would indicate an invalid floating-point number.

#### **`tokenizeHexNumber()`**
This method processes hexadecimal numbers, which start with the `#` symbol. After encountering `#`, the lexer accumulates valid hexadecimal digits (`0-9`, `a-f`, `A-F`). Once all valid characters are collected, the method adds a `HEX_NUMBER` token to the list.

#### **`tokenizeOperator()`**
This method maps operator characters (e.g., `+`, `-`, `*`, `/`, `(`, `)`) to their corresponding `TokenType`. For example, if the lexer encounters `+`, it will add a `PLUS` token to the list. The `OPERATOR_CHARS` string and `OPERATOR_TOKENS` array are used to perform this mapping.

#### **`tokenizeWord()`**
This method processes words or identifiers. It accumulates letters, digits, underscores (`_`), and dollar signs (`$`). These characters are commonly allowed in variable names or identifiers in many programming languages. Once the entire word is collected, a `WORD` token is added to the list.

#### **`next()`**
This method advances the `pos` pointer to the next character in the input string and returns the character at the new position. It effectively moves the lexer forward in the input.

#### **`peek(int relativePosition)`**
This method allows the lexer to "look ahead" or "look behind" in the input string without advancing the `pos` pointer. This is useful for checking upcoming characters without consuming them.

#### **`addToken(TokenType type, String text)`**
This method adds a new token to the `tokens` list. It takes a `TokenType` and the actual text of the token (e.g., `"123"` for a number, `"hello"` for a word). If no text is provided, it defaults to an empty string.

---

## **Token Class**

The **Token** class represents a single token generated by the lexer. Each token has two main fields:

- **type**: The type of the token (e.g., `NUMBER`, `WORD`, `PLUS`, etc.). This indicates what kind of syntactic element the token represents.

- **text**: The actual text of the token (e.g., `"123"`, `"hello"`, `"+"`). This is the substring from the input that corresponds to the token.

### **Methods**
- **Constructor**: Initializes a token with a type and text.

- **Getters and Setters**: Provide access to the `type` and `text` fields.

- **`toString()`**: Returns a string representation of the token in the format "`TYPE text`". For example, a token representing the number `123` would be printed as `NUMBER 123`.

---

## **TokenType Enum**

The **TokenType** enum defines all possible types of tokens that the lexer can generate. These include:

- **NUMBER**: Represents integer or floating-point numbers.

- **HEX_NUMBER**: Represents hexadecimal numbers.

- **WORD**: Represents words or identifiers.

- **PLUS**, **MINUS**, **STAR**, **SLASH**: Represent arithmetic operators (`+`, `-`, `*`, `/`).

- **LPAREN**, **RPAREN**: Represent parentheses (`(`, `)`).

- **EOF**: Represents the end of the input (not used in this implementation).

---

## **Main Class**

The **Main** class demonstrates how to use the lexer. It provides a simple example of how to tokenize an input string and print the resulting tokens.

### **Example Input**
```java
final String input2 = "(GOLDEN_RATIO + 2) * #f";
```
# Steps

1. Creates an instance of the `Lexer` with the input string.
2. Calls the `tokenize()` method to generate tokens.
3. Prints each token to the console.

# Output

For the input `"(GOLDEN_RATIO + 2) * #f"`, the output will be:

```aiignore
LPAREN 
WORD GOLDEN_RATIO
PLUS 
NUMBER 2
RPAREN 
STAR 
HEX_NUMBER f
```
# Explanation of the Code

## **Lexer Logic**

The lexer operates by iterating over each character in the input string and determining the type of token it represents. Here's a breakdown of how the lexer processes different types of input:

### **Numbers**
When a digit is encountered, the lexer enters the `tokenizeNumber()` method. It continues to accumulate digits until a non-digit character is found. If a decimal point is encountered, the lexer checks whether it has already processed a decimal point. If so, it throws an exception because multiple decimal points in a number are invalid.

### **Hexadecimal Numbers**
When a `#` is encountered, the lexer assumes that the following characters represent a hexadecimal number. It collects valid hexadecimal digits (`0-9`, `a-f`, `A-F`) and adds a `HEX_NUMBER` token to the list.

### **Words/Identifiers**
When a letter is encountered, the lexer enters the `tokenizeWord()` method. It collects letters, digits, underscores (`_`), and dollar signs (`$`) until a non-valid character is found. The collected substring is then added as a `WORD` token.

### **Operators**
When an operator character is encountered, the lexer looks it up in the `OPERATOR_CHARS` string and maps it to the corresponding `TokenType` using the `OPERATOR_TOKENS` array. The operator token is then added to the list.

### **Whitespace**
Whitespace characters are ignored, as they do not contribute to the token stream.

---

## **Error Handling**
The lexer includes basic error handling for invalid floating-point numbers (i.e., numbers with multiple decimal points). If such an issue is detected, the lexer throws a `RuntimeException`.

---

## **Peek and Next**
The `peek()` and `next()` methods allow the lexer to look ahead or advance through the input string efficiently. This is crucial for correctly identifying multi-character tokens like numbers, words, and hexadecimal values.

---

## **Summary**
This implementation demonstrates the fundamental operation of a lexer, which is a key component in compilers and interpreters. The lexer scans the input string character by character, identifies patterns (e.g., numbers, words, operators), and generates tokens based on these patterns.

Future enhancements could include:
- Support for more complex token types (e.g., strings, comments).
- Improved error handling for invalid input.
- Integration with a parser to build a complete compiler or interpreter.

This implementation demonstrates how a lexer works by:

- Scanning the input string character by character.
- Identifying patterns (e.g., numbers, words, operators).
- Generating tokens based on these patterns.

The lexer is a fundamental component of compilers and interpreters, and this lab provides a basic understanding of how it operates. Future enhancements could include support for more complex token types, error handling, and integration with a parser.
## References
- [Wikipedia](https://en.wikipedia.org/wiki/Lexical_analysis)
- [A sample of lexical analyzer](https://llvm.org/docs/tutorial/MyFirstLanguageFrontend/LangImpl01.html)