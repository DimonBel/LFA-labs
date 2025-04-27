package org.example.lab6.parser.ast;
import org.example.lab6.lib.Variables;

public final class VariabletExpression implements Expression {

    private final String name;

    public VariabletExpression(String name) {
        this.name = name;
    }

    @Override
    public double eval() {
        if (!Variables.isExists(name)) throw new RuntimeException("Constant does not exists");
        return Variables.get(name);
    }

    // Add getter
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
