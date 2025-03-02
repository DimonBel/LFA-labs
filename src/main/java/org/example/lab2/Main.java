package org.example.lab2;

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

        org.example.lab2.Grammar grammar = new Grammar(
                nonTerminals,
                terminals,
                rules,
                startSymbol
        );
        System.out.println("_________________");
        System.out.println(grammar.getNonTerminals());
        System.out.println(grammar.getTerminals());
        System.out.println(grammar.getProductions());
        System.out.println(grammar.getStartSymbol());
        System.out.println("_________________");
        List<String> generatedWords = grammar.generateStrings();
        System.out.println("_________________");

        List<String> generatedWords1 = grammar.generateStrings();

        FinitaAutomata fa =  grammar.toFiniteAutomaton();

        System.out.println("\nControl if is valid words ( like correct words ):");
        for (String word : generatedWords) {
            System.out.println(word + " принадлежит языку? " + fa.stringBelongsToLanguage(word));
        }

        // Проверка заведомо некорректных слов
        List<String> incorrectWords = Arrays.asList("xyz", "abc", "da", "ae", "cc", "fS", "rL", "aee");

        System.out.println("\nControl wrong words");
        for (String word : incorrectWords) {
            System.out.println(word + " are in grammar " + fa.stringBelongsToLanguage(word));
        }
        String grammarType = grammar.classifyGrammar();
        System.out.println("---------------------------------------");
        System.out.println("Grammar classification: " + grammarType);

        System.out.println("_________________________________________");


        Set<String> states = new HashSet<>(Arrays.asList("q0", "q1", "q2", "q3", "q4"));
        Set<String> alphabet = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> finalStates = new HashSet<>(Collections.singletonList("q4"));
        Map<String, Map<String, Set<String>>> transitions = new HashMap<>();

        transitions.put("q0", Map.of("a", Set.of("q1")));
        transitions.put("q1", Map.of("b", Set.of("q2", "q3")));
        transitions.put("q2", Map.of("c", Set.of("q3")));
        transitions.put("q3", Map.of("a", Set.of("q3"), "b", Set.of("q4")));

        FinitaAutomata fa1 = new FinitaAutomata(states, alphabet, transitions, "q0", finalStates);
        Grammar grammar1 = fa1.toGrammar();

        //List<String> generatedWords2 = grammar1.generateStrings();
        System.out.println("_________________");
        System.out.println(grammar1.getNonTerminals());
        System.out.println(grammar1.getTerminals());
        System.out.println(grammar1.getProductions());
        System.out.println(grammar1.getStartSymbol());
        System.out.println("_________________");
        System.out.println("_________________");
        System.out.println("_________________");
        List<String> generatedWords11 = grammar1.generateStrings();

        System.out.println(grammar.getNonTerminals());
        System.out.println(grammar.getTerminals());
        System.out.println(grammar.getProductions());
        System.out.println(grammar.getStartSymbol());

        System.out.println(fa1.isDeterministic());
        FinitaAutomata dfa = fa1.convertToDFA();

        System.out.println("DFA Состояния: " + dfa.getStates());
        System.out.println("DFA Переходы: " + dfa.getTransitions());
        System.out.println("DFA Начальное состояние: " + dfa.getInitialState());
        System.out.println("DFA Конечные состояния: " + dfa.getFinalStates());
    }


}
