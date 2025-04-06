package org.example.lab4;

import java.util.List;

public class OutputFormatter {

    public String formatHeader(String text) {
        return "\n=== " + text + " ===\n";
    }

    public String formatSubheader(String text) {
        return "\n--- " + text + " ---\n";
    }

    public String formatSeparator() {
        return "\n" + "-".repeat(50) + "\n";
    }

    public String formatList(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%2d. %s%n", i + 1, list.get(i)));
        }
        return sb.toString();
    }
}