package org.example.lab1;

import java.util.*;

public class Main {
    private static Map<String, List<String>> rules = new HashMap<>();

    public static void main(String[] args) {
        rules.put("S", Arrays.asList("aS", "bS", "cR", "dL"));
        rules.put("R", Arrays.asList("dL", "e"));
        rules.put("L", Arrays.asList("fL", "eL", "d"));

        Set<String> nonTerminals = new HashSet<>(Arrays.asList("S", "L", "R"));
        Set<String> terminals = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e","f"));
        String startSymbol = "S";

        Grammar grammar = new Grammar(
                nonTerminals,
                terminals,
                rules,
                startSymbol
        );

        //grammar.generateStrings();
        List<String> generatedWords = grammar.generateStrings();

        FiniteAutomata fa = grammar.toFiniteAutomaton();

        System.out.println("\nПроверка принадлежности сгенерированных строк языку:");
        for (String word : generatedWords) {
            System.out.println(word + " принадлежит языку? " + fa.stringBelongsToLanguage(word));
        }

        // Проверка заведомо некорректных слов
        List<String> incorrectWords = Arrays.asList("xyz", "abc", "da", "ae", "cc", "fS", "rL", "aee");

        System.out.println("\nПроверка некорректных строк:");
        for (String word : incorrectWords) {
            System.out.println(word + " принадлежит языку? " + fa.stringBelongsToLanguage(word));
        }
    }
}