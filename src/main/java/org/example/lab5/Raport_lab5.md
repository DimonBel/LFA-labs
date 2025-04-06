# Chomsky Normal Form

### Course: Formal Languages & Finite Automata
### Author: Belih Dmitrii

----

## Theory

## Chomsky Normal Form
A grammar where every production is either of the form `A → BC` or `A → c` (where `A`, `B`, `C` are arbitrary variables and `c` an arbitrary symbol).

### Example:
```
S → AS | a
A → SA | b
```
(If language contains `ε`, then we allow `S → ε` where `S` is start symbol, and forbid `S` on RHS.)  
*Goddard 9a: 2*

### Why Chomsky Normal Form?
The key advantage is that in Chomsky Normal Form, every derivation of a string of `n` letters has exactly `2n − 1` steps. Thus: one can determine if a string is in the language by exhaustive search of all derivations.  
*Goddard 9a: 3*

### Conversion
The conversion to Chomsky Normal Form has four main steps:
1. Get rid of all `ε` productions.
2. Get rid of all productions where RHS is one variable.
3. Replace every production that is too long by shorter productions.
4. Move all terminals to productions where RHS is one terminal.

## Objectives:

- Learn about Chomsky Normal Form (CNF)

- Get familiar with the approaches of normalizing a grammar.

- Implement a method for normalizing an input grammar by the rules of CNF.
    1. The implementation needs to be encapsulated in a method with an appropriate signature (also ideally in an appropriate class/type).
    2. The implemented functionality needs executed and tested.
    3. Also, another ***BONUS*** point would be given if the student will make the aforementioned function to accept any grammar, not only the one from the student's variant.


## Implementation Description

### 1. `Grammar` Class
The `Grammar` class represents a context-free grammar with non-terminals, terminals, productions, and a start symbol.

### Fields
- **`nonTerminals`**: Set of non-terminal symbols (e.g., `S`, `A`, `B`).
- **`terminals`**: Set of terminal symbols (e.g., `a`, `b`).
- **`productions`**: A map where the key is a non-terminal (e.g., `S`) and the value is a set of production rules (each rule is a `List<String>` representing the right-hand side, RHS).
- **`startSymbol`**: The starting non-terminal of the grammar.

### Constructor
```java
public Grammar(Set<String> nonTerminals, Set<String> terminals, Map<String, Set<List<String>>> productions, String startSymbol)
```
- **Purpose**: Initializes the grammar with the provided sets and map.

### `printGrammar()`
- **Purpose**: Prints all productions in a readable format.
- **How it Works**:
    - If a production’s RHS is empty (`rhs.isEmpty()`), it prints `ε` (epsilon).
    - Otherwise, it joins the symbols with spaces (e.g., `S → a B`).

---

### 2. `GrammarNormalizer` Class
The `GrammarNormalizer` class contains the logic to normalize a CFG into CNF. The main method `normalizeToCNF()` orchestrates the process by calling helper methods in this order:
1. `eliminateEpsilon`
2. `eliminateUnitProductions`
3. `eliminateInaccessibleSymbols`
4. `eliminateNonProductiveSymbols`
5. `convertToCNF`

### `normalizeToCNF(Grammar grammar)`
- **Purpose**: Converts the input grammar to CNF by applying all necessary transformations.
- **Process**: Calls the five helper methods sequentially and returns the modified grammar.
- **CNF Requirements**: After this process, every production will either be of the form `A → BC` (two non-terminals) or `A → c` (one terminal), except possibly `S → ε` for the start symbol if the language includes the empty string.

### `eliminateEpsilon(Grammar grammar)`
- **Purpose**: Removes all epsilon (`ε`) productions (e.g., `A → ε`) except possibly from the start symbol.
- **How it Works**:
    1. **Find Nullable Symbols**:
        - Identifies non-terminals that directly produce `ε` (empty list in `rhs`).
        - Iteratively finds additional nullable symbols: if a production `A → B C` exists and both `B` and `C` are nullable, then `A` is nullable too. Continues until no new nullable symbols are found (`changed = false`).
    2. **Generate New Productions**:
        - For each production (e.g., `A → B C`), generates all possible combinations where nullable symbols can be omitted (e.g., `A → B C`, `A → B`, `A → C`, `A → ε` if both are nullable).
        - Uses `generateNullableCombinations` to compute these variations.
    3. **Remove Unwanted Epsilons**:
        - Removes `ε` productions from all non-terminals except the start symbol (`!lhs.equals(grammar.startSymbol)`).
- **Example**: If `S → A B`, `A → ε`, `B → ε`, then `S` becomes nullable, and new productions might include `S → A B`, `S → A`, `S → B`, and `S → ε`.

### `generateNullableCombinations(List<String> symbols, Set<String> nullable)`
- **Purpose**: Helper method to generate all possible combinations of a production’s RHS by omitting nullable symbols.
- **How it Works**:
    - Uses a binary counter (0 to `2^n - 1`, where `n` is the length of `symbols`) to represent all subsets.
    - For each position `j`, if the bit is 0 or the symbol isn’t nullable, it keeps the symbol; otherwise, it omits it.
    - Returns a set of all valid combinations.
- **Example**: For `rhs = [A, B]` where both `A` and `B` are nullable, it generates `[[A, B], [A], [B], []]`.

### `eliminateUnitProductions(Grammar grammar)`
- **Purpose**: Removes unit productions (e.g., `A → B`, where `B` is a non-terminal).
- **How it Works**:
    1. **Compute Unit Closure**:
        - For each non-terminal `lhs`, uses `getUnitClosure` to find all non-terminals reachable via unit productions (e.g., `A → B`, `B → C` means `A` reaches `C`).
    2. **Replace with Non-Unit Productions**:
        - For each reachable non-terminal, copies its non-unit productions (RHS not a single non-terminal) to `lhs`.
    3. **Update Productions**:
        - Replaces the original productions with the new set.
- **Example**: If `A → B`, `B → b`, then `A → b` is added, and `A → B` is removed.

### `getUnitClosure(String symbol, Grammar grammar)`
- **Purpose**: Finds all non-terminals reachable from `symbol` via unit productions.
- **How it Works**:
    - Uses a stack-based depth-first search (DFS).
    - Starts with `symbol`, explores each production; if RHS is a single non-terminal, adds it to the closure and continues.
    - Returns the set of all reachable non-terminals.
- **Example**: For `A → B`, `B → C`, returns `{A, B, C}` for `A`.

### `eliminateInaccessibleSymbols(Grammar grammar)`
- **Purpose**: Removes non-terminals that cannot be reached from the start symbol.
- **How it Works**:
    - Uses a queue-based breadth-first search (BFS) starting from `startSymbol`.
    - Adds each non-terminal encountered in any RHS to the `accessible` set and continues exploring.
    - Retains only accessible non-terminals in `productions` and `nonTerminals`.
- **Example**: If `S → A`, `A → a`, but `B → b` exists with no path from `S`, then `B` is removed.

### `eliminateNonProductiveSymbols(Grammar grammar)`
- **Purpose**: Removes non-terminals that cannot produce a string of terminals (non-productive).
- **How it Works**:
    - Iteratively builds a set of productive non-terminals:
        - A non-terminal is productive if all symbols in at least one of its RHS are either terminals or already productive.
        - Continues until no new productive symbols are added (`changed = false`).
    - Retains only productive non-terminals in `productions` and `nonTerminals`.
- **Example**: If `A → B`, but `B` has no productions leading to terminals, `A` and `B` are removed.

### `convertToCNF(Grammar grammar)`
- **Purpose**: Ensures all productions are in CNF (`A → BC` or `A → c`).
- **How it Works**:
    1. **Handle Terminals in Long Productions**:
        - For each terminal in an RHS of length > 1, replaces it with a new non-terminal (e.g., `T1`) and adds a production `T1 → terminal`.
        - Stores mappings in `terminalMap` to reuse new variables.
    2. **Break Long Productions**:
        - For RHS with length > 2 (e.g., `A → B C D`), introduces new variables (e.g., `X1`) and splits it into binary productions (e.g., `A → X1 D`, `X1 → B C`).
        - Uses a counter (`varCounter`) to generate unique variable names.
    3. **Update Productions**:
        - Replaces the original productions with the new binary and terminal productions.
- **Example**: `S → a B C` becomes `S → T1 X1`, `T1 → a`, `X1 → B C`.

---

### 3. `Main` Class
- **Purpose**: Demonstrates the normalization process with a sample grammar.
- **How it Works**:
    - Defines a grammar with:
        - Non-terminals: `{S, A, B, C, D}`
        - Terminals: `{a, b}`
        - Productions: e.g., `S → a B | b A`, `A → B | b | a D | A S | B A A B | ε`, etc.
        - Start symbol: `S`
    - Prints the original grammar.
    - Calls `GrammarNormalizer.normalizeToCNF(grammar)`.
    - Prints the resulting CNF grammar.
- **Output**: Shows the transformation from the original grammar to CNF, with all steps applied.

---

## Summary of the Process
1. **Epsilon Removal**: Removes `ε` productions and adjusts for nullable symbols.
2. **Unit Production Removal**: Eliminates `A → B` by copying non-unit productions.
3. **Inaccessible Removal**: Removes unreachable non-terminals.
4. **Non-Productive Removal**: Removes non-terminals that cannot produce terminal strings.
5. **CNF Conversion**: Ensures all productions are either `A → BC` or `A → c`.

This implementation follows the standard algorithm for converting a CFG to CNF, ensuring the resulting grammar generates the same language while adhering to CNF constraints.










