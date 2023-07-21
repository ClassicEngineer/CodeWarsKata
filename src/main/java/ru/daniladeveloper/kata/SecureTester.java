package ru.daniladeveloper.kata;

public class SecureTester{

    public static boolean alphanumeric(String s){
        if (s.isEmpty()) {
            return false;
        }
        for (Character ch : s.toCharArray()) {
            if (!(isLatinLetter(ch)) && !isDigit(ch) ){
                return false;
            }
        }
        return true;
    }
    public static boolean isLatinLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

}
