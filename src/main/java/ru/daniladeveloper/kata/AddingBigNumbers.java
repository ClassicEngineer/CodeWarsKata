package ru.daniladeveloper.kata;



public class AddingBigNumbers {
    public static String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int shift = 0;
        for (int i = a.length() -1 , j = b.length() -1; ;) {
            if (j < 0 && i < 0) {
                break;
            }

            Integer aDigit = i >= 0 ? Integer.parseInt(String.valueOf(a.charAt(i))) : 0;

            Integer bDigit = j >= 0 ? Integer.parseInt(String.valueOf(b.charAt(j))) : 0;



            Integer res = aDigit + bDigit + shift;

            shift = 0;
            if (res >= 10) {
                shift = 1;
                res = res % 10;
            }
            result.append(res);
            i --;
            j--;
        }
        if (shift == 1 && b.length() == a.length()) {
            result.append("1");
        }
        String number = result.reverse().toString();

        int indexNonZero = findFirstNotZeroNumberIndex(number);

        return number.substring(indexNonZero);
  }

    public static int findFirstNotZeroNumberIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && str.charAt(i) != '0') {
                return i;
            }
        }
        return -1;
    }
}
