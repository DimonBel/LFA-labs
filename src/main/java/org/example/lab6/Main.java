package org.example.lab6;

import org.example.lab6.lib.Variables;
import org.example.lab6.parser.Lexer;
import org.example.lab6.parser.Parser;
import org.example.lab6.parser.Token;
import org.example.lab6.parser.ast.ASTPrinter;
import org.example.lab6.parser.ast.Statement;

import java.util.List;

public final class Main {

    public static void main(String[] args) {
        final String input1 = "word = 2 + 2\nword2 = PI + word";
        final String input2 = "GOLDEN_RATIO";

        final List<Token> tokens = new Lexer(input1).tokenize();
        System.out.println("Tokens:");
        for (Token token : tokens) {
            System.out.println(token);
        }
        System.out.println();

        final List<Statement> statements = new Parser(tokens).parse();
        System.out.println("Statements:");
        for (Statement statement : statements) {
            System.out.println(statement);
        }
        System.out.println();

        // Print the AST tree
        ASTPrinter.print(statements);
        System.out.println();

        // Execute statements
        System.out.println("Execution results:");
        for (Statement statement : statements) {
            statement.execute();
        }
        System.out.printf("%s = %f\n", "word", Variables.get("word"));
        System.out.printf("%s = %f\n", "word2", Variables.get("word2"));
    }
}
