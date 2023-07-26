package ru.daniladeveloper.kata;

import java.util.stream.IntStream;

public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {
        int survivor = 0;
        int kCount = 1;
        int zeroCount = 0;
        int[] array = IntStream.range(1, n + 1).toArray();
        int i = 0;
        while (zeroCount != n) {
            if (i == array.length) {
                i = 0;
            }
            if (array[i] != 0) {
                if (kCount == k) {
                    survivor = array[i];
                    array[i] = 0;
                    kCount = 1;
                    zeroCount++;
                } else {
                    kCount++;
                }
            }
            i++;
        }
        return survivor;
    }

}
