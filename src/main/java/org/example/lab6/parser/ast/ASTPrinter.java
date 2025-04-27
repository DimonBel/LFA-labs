package org.example.lab6.parser.ast;

import java.util.List;

public class ASTPrinter {
    private static final String INDENT = "  "; // Two spaces for each level

    public static void print(List<Statement> statements) {
        System.out.println("AST Tree:");
        for (Statement statement : statements) {
            printStatement(statement, 0);
        }
    }

    private static void printStatement(Statement statement, int depth) {
        String indent = getIndent(depth);

        if (statement instanceof AssignmentStatement) {
            AssignmentStatement assignment = (AssignmentStatement) statement;
            System.out.println(indent + "Assignment:");
            System.out.println(indent + INDENT + "Variable: " + assignment.getVariable());
            System.out.println(indent + INDENT + "Expression:");
            printExpression(getExpressionFromAssignment(assignment), depth + 2);
        } else {
            System.out.println(indent + "Unknown Statement: " + statement.getClass().getSimpleName());
        }
    }

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

    private static String getIndent(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append(INDENT);
        }
        return sb.toString();
    }

    // Helper method to extract the expression from an assignment statement
    // We need this because the original AssignmentStatement doesn't have a getter
    private static Expression getExpressionFromAssignment(AssignmentStatement statement) {
        // This is a workaround since we don't have direct access to the expression field
        // Using reflection would be another option, but I'll avoid that approach
        try {
            java.lang.reflect.Field field = AssignmentStatement.class.getDeclaredField("expression");
            field.setAccessible(true);
            return (Expression) field.get(statement);
        } catch (Exception e) {
            System.err.println("Unable to access expression field: " + e.getMessage());
            return null;
        }
    }
}