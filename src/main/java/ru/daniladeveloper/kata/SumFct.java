package ru.daniladeveloper.kata;

import java.math.BigInteger;

public class SumFct {


    /*
    perimeter(5)  should return 80
    perimeter(7)  should return 216
     */
    public static BigInteger perimeter(BigInteger n) {
//        BigInteger sum = BigInteger.valueOf(0);
//        n = n.add(BigInteger.ONE);
//        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
//            sum = sum.add(fibonachi(i));
//        }
        return fibonachiSum(n).multiply(BigInteger.valueOf(4L));
    }

    public static BigInteger fibonachi(BigInteger limit) {
        if (limit.intValue() <= 1) {
            return limit;
        }
        else return fibonachi(limit.subtract(BigInteger.ONE)).add(fibonachi(limit.subtract(BigInteger.TWO)));
    }

    // 1 (1+0)=1, (1+1)= 2, (2+1)= 3
    public static BigInteger fibonachiSum(BigInteger n) {
        n= n.add(BigInteger.ONE);
        BigInteger sum = BigInteger.valueOf(1);
        BigInteger prev = BigInteger.valueOf(0);
        BigInteger preprev = BigInteger.valueOf(0);
        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            preprev = prev;
            prev = sum;
            sum = (preprev).add(prev);
        }
        return sum.subtract(BigInteger.ONE);
    }

}
