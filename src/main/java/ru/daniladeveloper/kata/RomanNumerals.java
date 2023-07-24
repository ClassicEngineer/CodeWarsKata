package ru.daniladeveloper.kata;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {

    public static String toRoman(int n) {
        if (!getSimpleRoman(n).isEmpty()) {
            return getSimpleRoman(n);
        }

        StringBuilder result = new StringBuilder();
        int mCount = n / 1000;

        for (int i = 0; i < mCount; i++) {
            result.append(getSimpleRoman(1000));
        }
        n = n - (mCount) * 1000;

        int hundredCount = appendResult(n, result, 100);

        n = n - (hundredCount) * 100;

        int tenCount = appendResult(n, result, 10);

        n = n - (tenCount) * 10;

        result.append(getSimpleRoman(n));

        return result.toString();
    }

    private static int appendResult(int n, StringBuilder result, int tenPow) {
        int number = n / tenPow;

        if (number == 1) {
            result.append(getSimpleRoman(tenPow));
        } else {
            if (number <= 3) {
                for (int i = 0; i < number; i++) {
                    result.append(getSimpleRoman(tenPow));
                }
            }
            if (number == 4) {
                result.append(getSimpleRoman(tenPow));
                result.append(getSimpleRoman(5 * tenPow));
            }
            else if (number > 4 && number < 9) {
                result.append(getSimpleRoman(5 * tenPow));
                for (int i = 0; i < number - 5; i++) {
                    result.append(getSimpleRoman(tenPow));
                }
            } else if (number == 9) {
                result.append(getSimpleRoman(tenPow));
                result.append(getSimpleRoman(tenPow * 10));
            }

        }
        return number;
    }

    private static String getSimpleRoman(int n) {
        switch (n) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 1000:
                return "M";
            case 500:
                return "D";
            case 100:
                return "C";
            case 50:
                return "L";

        }
        return "";
    }

    private static int getSimpleArabic(String roman) {
        switch (roman) {
            case "I": return 1;
            case "II" : return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX" : return 9;
            case "X": return 10;
            case "M": return 1000;
            case "D": return 500;
            case "C": return 100;
            case "L": return 50;
        }
        return 0;
    }


    public static int fromRoman(String romanNumeral) {
        int result = 0;
        List<Integer> numbers = new ArrayList<>();
        if (getSimpleArabic(romanNumeral) != 0) {
            return getSimpleArabic(romanNumeral);
        }
        for (int i = 0; i < romanNumeral.length(); i++) {
                String next = String.valueOf(romanNumeral.charAt(i));
                numbers.add(getSimpleArabic(next));
        }

        for (int i = 0, j = 1; i < numbers.size(); i++, j++) {
            if (j !=numbers.size() && numbers.get(j) > numbers.get(i)) {
                result = result - numbers.get(i);
            } else {
                result = result + numbers.get(i);
            }
        }

        return result;
    }
}
