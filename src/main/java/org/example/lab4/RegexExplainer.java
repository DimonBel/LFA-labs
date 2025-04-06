package org.example.lab4;

public class RegexExplainer {

    public void explainRegexProcessing(String regex) {
        System.out.println("Step-by-Step Processing:");
        if (regex.equals("M?N{2}(0|P){3}Q*R*")) {
            System.out.println("  1. Handle optional 'M'.");
            System.out.println("  2. Add exactly two 'N's.");
            System.out.println("  3. Add three occurrences of '0' or 'P'.");
            System.out.println("  4. Add zero to five 'Q's.");
            System.out.println("  5. Add zero to five 'R's.");
        } else if (regex.equals("(X|Y|Z){3}8+(9|0)^2")) {
            System.out.println("  1. Add three occurrences of 'X', 'Y', or 'Z'.");
            System.out.println("  2. Add one to five '8's.");
            System.out.println("  3. Add two occurrences of '9' or '0'.");
        } else if (regex.equals("(H|i)(J|K)L*N?")) {
            System.out.println("  1. Add either 'H' or 'i'.");
            System.out.println("  2. Add either 'J' or 'K'.");
            System.out.println("  3. Add zero to five 'L's.");
            System.out.println("  4. Add optional 'N'.");
        }
        System.out.println();
    }
}
