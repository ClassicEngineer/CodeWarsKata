package ru.daniladeveloper.kata;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
    public boolean check(String sentence){
        sentence = sentence.toLowerCase();
        Map<Character, Integer> charToCount = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            Character character = sentence.charAt(i);
            charToCount.put(character, 0);
            charToCount.computeIfPresent(character, (ch, number) -> number + 1);
        }

        for (char a = 'a'; a <= 'z'; a++) {
            if (charToCount.get(a) == null) {
                return false;
            }
        }
        return true;
    }

    public boolean checkStream(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
