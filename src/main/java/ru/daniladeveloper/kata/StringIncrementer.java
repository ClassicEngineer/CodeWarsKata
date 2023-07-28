package ru.daniladeveloper.kata;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIncrementer {

        public  final static Pattern LAST_DIGITS = Pattern.compile("[0-9]*$");
        public static String incrementString(String strNum) {
            if (strNum.isEmpty()) {
                return "1";
            }
            String wordPart = "";
            String numberPart = "";
            StringBuilder zeroPart = new StringBuilder();
            Matcher matcher = LAST_DIGITS.matcher(strNum);
            if (matcher.find()) {
                numberPart = matcher.group(0);
                wordPart = strNum.replaceAll(LAST_DIGITS.pattern(), "");
            } else {
                return incrementStringSimple(strNum);
            }
            if (numberPart.isEmpty()) {
                return strNum + "1";
            }
            if (wordPart.isEmpty()) {
                return incrementStringSimple(strNum);
            }
            int lastZeroIndex = -1;
            for (int i = 0; i < numberPart.length(); i++) {
                if (Character.isDigit(numberPart.charAt(i)) && numberPart.charAt(i) != '0') {
                    break;
                }
                if (numberPart.charAt(i) == '0') {
                    zeroPart.append(numberPart.charAt(i));
                    lastZeroIndex = i;
                }
            }
            if (lastZeroIndex != -1) {
                numberPart = numberPart.substring(lastZeroIndex + 1);
            }

            if (numberPart.isEmpty()) {
                numberPart = "0";
            }

            return combineParts(wordPart, zeroPart.toString(), numberPart);


        }

    private static String combineParts(String wordPart, String zeroPart, String numberPart) {
        BigInteger numOrigin = new BigInteger(numberPart);

        BigInteger numPlusOne = numOrigin.add(BigInteger.ONE);

        StringBuilder zeroResult  = new StringBuilder();

        int transitionCount = 0;

        if (numOrigin.intValue() == 0) {
            transitionCount = 1;
        } else {
            transitionCount = String.valueOf(numPlusOne).length() -  String.valueOf(numOrigin).length();
        }

        for (int i = 0; i < zeroPart.length() - transitionCount ; i++) {
            zeroResult.append("0");
        }

        return wordPart +  zeroResult + numPlusOne;
    }

    public static String incrementStringSimple(String strNum) {
        int zeroIndex = findFirstZeroIndex(strNum);
        int numberIndex = findFirstNotZeroNumberIndex(strNum);
        if (numberIndex == -1 && zeroIndex == -1) {
            return strNum + "1";
        } else {
            String zerosPart = "";
            String numberPart = "";
            String wordPart = "";
            if (zeroIndex != -1) {
                wordPart = strNum.substring(0, zeroIndex);
            } else {
                wordPart = strNum.substring(0, numberIndex);
            }
            if (numberIndex != -1) {
                numberPart = strNum.substring(numberIndex);
            } else {
                numberPart = "0";
            }
            if (numberIndex != -1 && zeroIndex != -1) {
                zerosPart = strNum.substring(zeroIndex, numberIndex);
            } else if (zeroIndex != -1) {
                zerosPart = strNum.substring(zeroIndex);
            }

            return combineParts(wordPart, zerosPart, numberPart);

        }
    }

    public static int findFirstNotZeroNumberIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && str.charAt(i) != '0') {
                return i;
            }
        }
        return -1;
    }

    public static int findFirstZeroIndex(String str) {
            for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) && str.charAt(i) != '0') {
                break;
            }
            if (Character.isDigit(str.charAt(i)) && str.charAt(i) == '0') {
                return i;
            }
        }
        return -1;
    }

}
