package org.example.lab5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> VN = new HashSet<>(Arrays.asList("S", "A", "B", "C", "D"));
        Set<String> VT = new HashSet<>(Arrays.asList("a", "b"));
        String S = "S";

        Map<String, Set<List<String>>> P = new HashMap<>();
        P.put("S", new HashSet<>(Arrays.asList(Arrays.asList("a", "B"), Arrays.asList("b", "A"))));
        P.put("A", new HashSet<>(Arrays.asList(
                Arrays.asList("B"), Arrays.asList("b"), Arrays.asList("a", "D"),
                Arrays.asList("A", "S"), Arrays.asList("B", "A", "A", "B"), Collections.emptyList()
        )));
        P.put("B", new HashSet<>(Arrays.asList(Arrays.asList("b"), Arrays.asList("b", "S"))));
        P.put("C", new HashSet<>(Collections.singletonList(Arrays.asList("A", "B"))));
        P.put("D", new HashSet<>(Collections.singletonList(Arrays.asList("B", "B"))));

        Grammar grammar = new Grammar(VN, VT, P, S);
        System.out.println("Original Grammar:");
        grammar.printGrammar();

        GrammarNormalizer.normalizeToCNF(grammar);

        System.out.println("\nCNF Grammar:");
        grammar.printGrammar();
    }
}
