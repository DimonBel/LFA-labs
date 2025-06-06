package org.example.lab6.parser.ast;

public final class UnaryExpression implements Expression {

    private final Expression expr1;
    private final char operation;

    public UnaryExpression(char operation, Expression expr1) {
        this.operation = operation;
        this.expr1 = expr1;
    }

    @Override
    public double eval() {
        switch (operation) {
            case '-': return -expr1.eval();
            case '+':
            default:
                return expr1.eval();
        }
    }

    // Add getters
    public char getOperation() {
        return operation;
    }

    public Expression getExpression() {
        return expr1;
    }

    @Override
    public String toString() {
        return String.format("%c %s", operation, expr1);
    }
}

