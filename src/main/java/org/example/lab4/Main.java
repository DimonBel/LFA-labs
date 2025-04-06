package org.example.lab4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define the regex patterns
        String[] regexPatterns = {
                "M?N{2}(0|P){3}Q*R*",
                "(X|Y|Z){3}8+(9|0)^2",
                "(H|i)(J|K)L*N?"
        };

        // Initialize helper classes
        RegexGenerator generator = new RegexGenerator();
        RegexExplainer explainer = new RegexExplainer();
        OutputFormatter formatter = new OutputFormatter();

        System.out.println("=== REGEX STRING GENERATOR ===\n");

        // Generate valid strings for each regex
        for (String regex : regexPatterns) {
            System.out.println(formatter.formatHeader("Processing Regex: " + regex));
            explainer.explainRegexProcessing(regex); // Explain the processing steps
            System.out.println(formatter.formatSubheader("Generated Valid Strings:"));

            List<String> validStrings = generator.generateValidStrings(regex);

            // Print valid strings in a pretty format
            System.out.println(formatter.formatList(validStrings));
            System.out.println(formatter.formatSeparator());
        }
    }
}