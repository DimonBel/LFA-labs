# Regular expressions

### Course: Formal Languages & Finite Automata
### Author: Belih Dmitrii

----

# Theory

### Regular Expressions

Regular Expressions are the expressions that describe the language accepted by Finite Automata. It is the most efficient way to represent any language.

The languages accepted by some regular expressions are referred to as **Regular languages**.

Regular expressions are used to check and match character combinations in strings. The string searching algorithm uses this pattern to find the operations on a string.

Let **Σ** be an alphabet that denotes the input set.

The regular expression over **Σ** can be defined as follows:

1. **Φ** is a regular expression that denotes the empty set.
2. **ε** is a regular expression and denotes the set `{ε}`, called a null string.
3. For each **‘x’** in **Σ**, **‘x’** is a regular expression and denotes the set `{x}`.
4. If **‘a’** and **‘b’** are the regular expressions that denote the language **L₁** and **L₂**, respectively, then:
    - **a + b** is equal to **L₁ ∪ L₂** (union).
    - **ab** is equal to the **L₁L₂** (concatenation).
    - **a*** is equal to **L₁*** (closure).

## Examples

- In a regular expression, **a*** means **zero or more** occurrences of **a**.  
  It can generate `{ε, a, aa, aaa, aaaa, aaaaa, ...}`.

- In a regular expression, **a+** means **one or more** occurrences of **a**.  
  It can generate `{a, aa, aaa, aaaa, aaaaa, ...}`.

---

### Operations on Regular Language

The various operations on the regular language are:

### 1. Union
If **R** and **S** are two regular languages, their union **R ∪ S** is also a Regular Language.

**R ∪ S** = `{a | a is in R or a is in S}`

### 2. Intersection
If **R** and **S** are two regular languages, their intersection is also a Regular Language.

**R ∩ S** = `{ab | a is in R and b is in S}`

### 3. Kleene Closure
If **R** is a regular language, its Kleene closure **R*** will also be a Regular Language.

**R*** = Zero or more occurrences of language **R**.

---

### Examples of Regular Expressions

### Example 1
Consider the languages **L₁ = ∅** and **L₂ = {x}**. Which one of the following represents

**L₁ L₂* ∪ L₁***?

a.) `{ε}`  
b.) `x*`  
c.) `∅`  
d.) `{ε, x}`

**Ans.** a.) `{ε}`

**Explanation:**
- **L₁ L₂*** results in `∅` because concatenation with an empty language (`∅`) is always `∅`.
- **L₁*** = `∅*` = `{ε}` (Kleene closure of an empty language contains only the empty string).
- The union `∅ ∪ {ε}` = `{ε}`.

## Objectives:

- Write and cover what regular expressions are, what they are used for;

- Below you will find 3 complex regular expressions per each variant. Take a variant depending on your number in the list of students and do the following:

1. Write a code that will generate valid combinations of symbols conform given regular expressions (examples will be shown). Be careful that idea is to interpret the given regular expressions dinamycally, not to hardcode the way it will generate valid strings. You give a set of regexes as input and get valid word as an output

2. In case you have an example, where symbol may be written undefined number of times, take a limit of 5 times (to evade generation of extremely long combinations);

3.  **Bonus** point: write a function that will show sequence of processing regular expression (like, what you do first, second and so on)

Write a good report covering all performed actions and faced difficulties.

## Implementation Description


### Core Architecture
The application consists of four primary classes that work in concert to process regular expressions:

- **Main Class** - The application entry point that coordinates the workflow
- **RegexGenerator** - Handles the generation of valid strings for each pattern
- **RegexExplainer** - Provides human-readable explanations of regex processing
- **OutputFormatter** - Manages the presentation of output in a structured way

### Main Class Implementation
The Main class serves as the controller for the application, initializing all necessary components and managing the processing pipeline. It begins by defining three complex regular expression patterns that will serve as test cases:

1. A pattern matching optional 'M' followed by exactly two 'N's, three occurrences of either '0' or 'P', and variable numbers of 'Q's and 'R's
2. A pattern requiring three occurrences of 'X', 'Y', or 'Z' followed by one or more '8's and exactly two digits that are either '9' or '0'
3. A simpler pattern starting with either 'H' or 'i', followed by 'J' or 'K', optional 'L's, and an optional final 'N'

The main execution flow demonstrates good software engineering practices by clearly separating the concerns of generation, explanation, and presentation. Each regex pattern is processed sequentially with appropriate headers and formatting to ensure clear, readable output.
```java
String[] regexPatterns = {
                "M?N{2}(0|P){3}Q*R*",
                "(X|Y|Z){3}8+(9|0)^2",
                "(H|i)(J|K)L*N?"
        };

        // Initialize helper classes
        RegexGenerator generator = new RegexGenerator();
        RegexExplainer explainer = new RegexExplainer();
        OutputFormatter formatter = new OutputFormatter();

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
```
### OutputFormatter Class
The OutputFormatter class specializes in presenting information in a visually appealing and organized manner. It implements several formatting methods that follow consistent styling conventions throughout the application output. The class handles:

- Major section headers with prominent visual separation
- Subsection titles with secondary styling
- List presentation with automatic numbering and alignment
- Consistent visual separators between sections

This centralized formatting approach ensures uniform presentation across all output while making it easy to modify the display style globally if needed. The formatting methods use simple string manipulation to create clean, professional-looking console output without relying on external libraries.

```java
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
```
### RegexExplainer Class
The RegexExplainer provides an educational component to the application by breaking down each regular expression into understandable processing steps. For each supported pattern, it outputs a numbered list explaining how the generator will interpret and process each component of the regex.

The explanations transform symbolic regular expression syntax into plain English descriptions, making the patterns more accessible to users who may not be familiar with regex notation. The current implementation handles three specific patterns, but the design allows for easy extension to support additional patterns by adding new conditional branches.

```java
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
```
### RegexGenerator Class
At the heart of the application, the RegexGenerator class contains the logic to produce all valid strings matching the input patterns. The implementation uses a divide-and-conquer strategy with separate methods for each supported pattern.

For the first pattern (`M?N{2}(0|P){3}Q*R*`), the generator:

1. Creates all combinations of the optional 'M'
2. Adds the mandatory 'NN' sequence
3. Generates all possible permutations of three '0' or 'P' characters
4. Appends variable numbers of 'Q's (limited to 0-5 for practicality)
5. Finishes with variable numbers of 'R's (similarly limited)

The second pattern generator follows a similar approach but handles the different quantifiers and alternations specific to that pattern. Notably, it implements the '+' quantifier (one or more occurrences) by generating between 1 and 5 '8' characters.

The third pattern demonstrates handling of simpler constructs with fewer combinations, showing the flexibility of the approach across different pattern complexities.

## Design Considerations
The implementation makes several intentional design choices worth noting:

- **Practical Limits on Repetition**: While the regex syntax allows theoretically infinite repetitions with `*` and `+`, the generator imposes reasonable limits (0-5 for `*`, 1-5 for `+`) to keep the output manageable.
- **Exhaustive Combination Generation**: For alternations (`|`) and other choices, the generator produces all possible valid combinations rather than random samples, ensuring complete coverage of the possibility space.
- **Separation of Concerns**: The clear division between generation, explanation, and presentation logic makes the code more maintainable and easier to extend.
- **Educational Focus**: The inclusion of detailed explanations transforms the tool from a simple generator into a learning aid for understanding regular expression construction.

The implementation successfully demonstrates how to systematically break down regular expressions into their component parts and generate all valid matching strings while providing clear explanations of the process. The modular design allows for straightforward extension to support additional regex features or patterns as needed.


