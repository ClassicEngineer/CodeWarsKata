package ru.daniladeveloper.kata;

public class GoodVsEvil {

    private static final String GOOD_WINS = "Good triumphs over Evil";

    private static final String EVIL_WINS = "Evil eradicates all trace of Good";

    private static final String TIE = "No victor on this battle field";

    public static String battle(String goodAmounts, String evilAmounts) {
        Integer goodScore = calculateGoodScore(goodAmounts);
        Integer evilScore = calculateEvilScore(evilAmounts);
        String result = "Battle Result: ";
        if (goodScore.equals(evilScore)) {
            return result + TIE;
        } else if (goodScore > evilScore) {
            return result + GOOD_WINS;
        } else {
            return result +  EVIL_WINS;
        }
    }

    private static Integer calculateEvilScore(String evilAmounts) {
        Integer result = 0;
        String[] goods = evilAmounts.split(" ");

        result += Integer.parseInt(goods[0]);
        result += Integer.parseInt(goods[1]) * 2;
        result += Integer.parseInt(goods[2]) * 2;
        result += Integer.parseInt(goods[3]) * 2;
        result += Integer.parseInt(goods[4]) * 3;
        result += Integer.parseInt(goods[5]) * 5;
        result += Integer.parseInt(goods[6]) * 10;

        return result;
    }

    private static Integer calculateGoodScore(String goodAmounts) {
        Integer result = 0;
        String[] goods = goodAmounts.split(" ");

        result += Integer.parseInt(goods[0]);
        result += Integer.parseInt(goods[1]) * 2;
        result += Integer.parseInt(goods[2]) * 3;
        result += Integer.parseInt(goods[3]) * 3;
        result += Integer.parseInt(goods[4]) * 4;
        result += Integer.parseInt(goods[5]) * 10;

        return result;
    }

    public static void main(String[] args) {

    }
}
