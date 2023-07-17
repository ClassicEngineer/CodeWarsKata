package ru.daniladeveloper.kata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripleDouble {

    /**
     * TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and
     *                                           // num2 has straight double 99s
     *
     * TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
     *
     * TripleDouble(12345, 12345) == 0
     *
     * TripleDouble(666789, 12345667) == 1
     */

    public class Kata
    {
        public static int TripleDouble(long num1, long num2)
        {
            String first = String.valueOf(num1);
            String second = String.valueOf(num2);
            List<Character>  digits = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

            for (Character digit : digits) {
                if (first.contains(String.valueOf(digit) + digit + digit) && second.contains(String.valueOf(digit) + digit)) {
                    return 1;
                }

            }

            return 0;
        }
    }
}
