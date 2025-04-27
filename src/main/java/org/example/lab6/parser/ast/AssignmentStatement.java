package org.example.lab6.parser.ast;

import org.example.lab6.lib.Variables;

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

    // Add getters
    public String getVariable() {
        return variable;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return String.format("%s = %s", variable, expression);
    }
}

