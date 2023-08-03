package ru.daniladeveloper.kata;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isValidChar(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                sb.append(" ");
            }
        }

        String words[] = sb.toString().split(" ");

        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word: words) {
            if (word.isEmpty() || containsOnly(word, '\'')) {
                continue;
            }
            if (wordToCount.computeIfPresent(word, (k, v) -> v + 1) == null) {
                wordToCount.put(word, 1);
            }
        }

        List<String> top3Words = wordToCount.entrySet().stream()
            .sorted((Comparator.comparingInt(value -> -value.getValue())))
            .limit(3)
            .map(entry -> entry.getKey().toLowerCase())
            .toList();


        return top3Words;
    }

    private static boolean containsOnly(String word, char c) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidChar(char c) {
        if (c == ' ' || c == '\'') {
            return true;
        }
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
