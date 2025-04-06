package org.example.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class RegexGenerator {

    public List<String> generateValidStrings(String regex) {
        List<String> results = new ArrayList<>();
        if (regex.equals("M?N{2}(0|P){3}Q*R*")) {
            results.addAll(generatePattern1());
        } else if (regex.equals("(X|Y|Z){3}8+(9|0)^2")) {
            results.addAll(generatePattern2());
        } else if (regex.equals("(H|i)(J|K)L*N?")) {
            results.addAll(generatePattern3());
        }
        return results;
    }

    private List<String> generatePattern1() {
        List<String> results = new ArrayList<>();
        String[] optionalM = {"", "M"};
        String fixedN = "NN";
        String[] choices0P = {"0", "P"};
        String[] optionalQ = {"", "Q", "QQ", "QQQ", "QQQQ", "QQQQQ"};
        String[] optionalR = {"", "R", "RR", "RRR", "RRRR", "RRRRR"};

        for (String m : optionalM) {
            for (String c1 : choices0P) {
                for (String c2 : choices0P) {
                    for (String c3 : choices0P) {
                        for (String q : optionalQ) {
                            for (String r : optionalR) {
                                results.add(m + fixedN + c1 + c2 + c3 + q + r);
                            }
                        }
                    }
                }
            }
        }
        return results;
    }

    private List<String> generatePattern2() {
        List<String> results = new ArrayList<>();
        String[] choicesXYZ = {"X", "Y", "Z"};
        String[] oneToFive8 = {"8", "88", "888", "8888", "88888"};
        String[] choices90 = {"9", "0"};

        for (String x1 : choicesXYZ) {
            for (String x2 : choicesXYZ) {
                for (String x3 : choicesXYZ) {
                    for (String eight : oneToFive8) {
                        for (String n1 : choices90) {
                            for (String n2 : choices90) {
                                results.add(x1 + x2 + x3 + eight + n1 + n2);
                            }
                        }
                    }
                }
            }
        }
        return results;
    }

    private List<String> generatePattern3() {
        List<String> results = new ArrayList<>();
        String[] choicesHi = {"H", "i"};
        String[] choicesJK = {"J", "K"};
        String[] optionalL = {"", "L", "LL", "LLL", "LLLL", "LLLLL"};
        String[] optionalN = {"", "N"};

        for (String hi : choicesHi) {
            for (String jk : choicesJK) {
                for (String l : optionalL) {
                    for (String n : optionalN) {
                        results.add(hi + jk + l + n);
                    }
                }
            }
        }
        return results;
    }
}