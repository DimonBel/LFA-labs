package org.example.lab3;

import java.util.List;

public final class Main {

    public static void main(String[] args) {
        final String input2 = "(GOLDEN_RATIO + 2) * #f";
        final List<Token> tokens = new Lexer(input2).tokenize();
        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}