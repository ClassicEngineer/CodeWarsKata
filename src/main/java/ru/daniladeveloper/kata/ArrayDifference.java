package ru.daniladeveloper.kata;

import java.util.ArrayList;
import java.util.List;

public class ArrayDifference {

  public static int[] arrayDiff(int[] a, int[] b) {
    List<Integer> diff = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      if (!contains(b, a[i]))
          diff.add(a[i]);
    }

    return diff.stream().mapToInt(i->i).toArray();
  }

  private static boolean contains(int[] b, int i) {
    for (int j = 0; j < b.length; j++) {
      if (b[j] == i) {
        return true;
      }
    }
    return false;
  }

}