package ru.daniladeveloper.kata;

import java.math.BigInteger;

class Persist {
	public static int persistence(long n) {
        int count = 0;
        if (n < 10) {
            return count;
        }
        while(n >= 10) {
            count++;
            n = getDigitsMultiply(n);

        }
        return count;
	}

    public static long getDigitsMultiply(long n) {
        Long mult = 1L;
        BigInteger tenPow = BigInteger.valueOf(10);
        while (tenPow.longValue() <= n) {
            tenPow = tenPow.multiply(BigInteger.valueOf(10));
        }
        tenPow  = tenPow.divide(BigInteger.valueOf(10L));

        while (tenPow.longValue() >= 10) {
            mult = mult * (n / tenPow.longValue());
            n = n - ((n / tenPow.longValue() * tenPow.longValue()));
            tenPow = tenPow.divide(BigInteger.valueOf(10L));
        }
        return mult * n;
    }

    public static void main(String[] args) {
        System.out.println(persistence(25));
    }
}
