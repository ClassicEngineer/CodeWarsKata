package ru.daniladeveloper.kata;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;


public class SmallerNumberKata
{
  public static long nextSmaller(long n)
  {
      Integer[] integers = getDigits(n);
      var permutations = permute(integers);
      permutations.sort(Comparator.comparingLong(SmallerNumberKata::getLong));
      for (int i = permutations.size() - 1; i >=0; i--) {
          long value = getLong(permutations.get(i));
          if (value < n && permutations.get(i).get(0) != 0) {
              return value;
          }
      }
      return -1;
  }

  public static long getLong(List<Integer> digits) {
        StringBuilder builder = new StringBuilder();
        digits.forEach(builder::append);
        return Long.parseLong(builder.toString());
  }

  public static Integer[] getDigits(long n) {
      String number = String.valueOf(n);
      List<Integer> digits = IntStream.range(0, number.length())
          .mapToObj(i -> Integer.parseInt(String.valueOf(number.charAt(i))))
          .toList();
      return digits.toArray(new Integer[0]);
  }

    public static List<List<Integer>> permute(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(0, nums, result);
        return result;
    }

    private static void permutation(int i, Integer[] nums, List<List<Integer>> result) {
        if (i == nums.length - 1) {
            result.add(new ArrayList<>(Arrays.asList(nums)));
        } else {
            for (int j = i, l = nums.length; j < l; j++) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                permutation(i + 1, nums, result);
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
