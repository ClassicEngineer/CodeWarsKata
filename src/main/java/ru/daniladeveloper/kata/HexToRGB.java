package ru.daniladeveloper.kata;

public class HexToRGB {

  public static int[] hexStringToRGB(String hex) {

      String r = hex.charAt(1) + String.valueOf(hex.charAt(2));
      String g = hex.charAt(3) + String.valueOf(hex.charAt(4));
      String b = hex.charAt(5) + String.valueOf(hex.charAt(6));

      int red = Integer.parseInt(r, 16);
      int green = Integer.parseInt(g, 16);
      int blue = Integer.parseInt(b, 16);


      return new int[]{red, green, blue};
  }

}
