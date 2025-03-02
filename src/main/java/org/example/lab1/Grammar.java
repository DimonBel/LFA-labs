package org.example.lab1;

//Variant 2:
//VN={S, R, L},
//VT={a, b, c, d, e, f},
//P={
//S → aS
//S → bS
//S → cR
//S → dL
//R → dL
//R → e
//L → fL
//L → eL
//L → d
//}

import org.example.lab2.FinitaAutomata;

import java.util.*;


public class Grammar {

    private Set<String> nonTerminals;    // V_n
    private Set<String> terminals;       // V_t
    private static Map<String, List<String>> productions; // P (правила)
    private String startSymbol; // S
    private static Random random = new Random();

    public Grammar(
             Set<String> nonTerminals,
             Set<String> terminals,
             Map<String, List<String>> productions,
             String startSymbol
    ) {
        this.nonTerminals = nonTerminals;
        this.terminals = terminals;
        this.productions = productions;
        this.startSymbol = startSymbol;
    }

    // Метод генерации 5 валидных строк
    public List<String> generateStrings() {
        List<String> generatedStrings = new ArrayList<>();

        for (int i= 0; i < 5; i++){
            String generatedWord = generateWord("S");
            System.out.println(generatedWord);
            generatedStrings.add(generatedWord);
        }

        return generatedStrings;
    }

    public FiniteAutomata toFiniteAutomaton() {
        Set<String> states = new HashSet<>(nonTerminals);
        Set<String> alphabet = new HashSet<>(terminals);
        Map<String, Map<String, Set<String>>> transitions = new HashMap<>();
        String initialState = startSymbol;
        Set<String> finalStates = new HashSet<>();

        for (String nonTerminal : productions.keySet()) {
            transitions.put(nonTerminal, new HashMap<>());
            for (String production : productions.get(nonTerminal)) {
                String firstSymbol = production.substring(0, 1);
                String rest = production.length() > 1 ? production.substring(1) : "";

                transitions.get(nonTerminal).computeIfAbsent(firstSymbol, k -> new HashSet<>()).add(rest.isEmpty() ? firstSymbol : rest);
                if (terminals.contains(firstSymbol)) {
                    finalStates.add(firstSymbol);
                }
            }
        }

        return new FiniteAutomata(states, alphabet, transitions, initialState, finalStates);
    }

    private static String generateWord(String symbol) {
        if (!productions.containsKey(symbol)) {
            return symbol; // Если терминальный символ, просто возвращаем его
        }

        // Выбираем случайное правило для символа
        String rule = productions.get(symbol).get(random.nextInt(productions.get(symbol).size()));

        // Рекурсивно обрабатываем каждую часть правила
        StringBuilder result = new StringBuilder();
        for (char c : rule.toCharArray()) {
            result.append(generateWord(String.valueOf(c)));
        }
        return result.toString();
    }




}
