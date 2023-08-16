package ru.daniladeveloper.kata;

import java.util.*;

public class Ranges {
    public static void main(String[] args) {
//        System.out.println(ranges(new int[] {3, 2, 4, 7, 8}));
        System.out.println(rangeExtraction(new int[] {3, 2, 4, 7 , 8, 156}));

    }

    // array = {3,2,4,7,8}
    // result -> 2-4, 7-8   24 78
    public static String rangeExtraction(int[] array) {
        StringBuilder result = new StringBuilder();
        int [] sortedInts = Arrays.stream(array).sorted().toArray();
        List<Range> ranges = new ArrayList<>();
        // 2 3 4 7 8
        int rangeStart = sortedInts[0];
        int rangeEnd = -1;
        int prev = sortedInts[0];
        for (int i = 0; i < sortedInts.length; i++) {
           if (Math.abs(prev - sortedInts[i]) > 1) {
               ranges.add(new Range(rangeStart, rangeEnd));
               rangeStart = sortedInts[i];
           }
           prev = sortedInts[i];
           rangeEnd = prev;
        }
        ranges.add(new Range(rangeStart, rangeEnd));

        List<Range> answerRanges = new ArrayList<>();

        for (var range: ranges) {
            if (range.second - range.first == 1) {
                answerRanges.add(new Range(range.first, range.first));
                answerRanges.add(new Range(range.second, range.second));
            } else {
                answerRanges.add(range);
            }
        }

        answerRanges.forEach((range) -> {
            if (!Objects.equals(range.first, range.second)) {
                result.append(range.first).append("-").append(range.second).append(",");
            } else {
                result.append(range.first).append(",");
            }
        });
        if (result.length() > 1) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }

    public record Range(Integer first, Integer second) {

    }


}