package ru.daniladeveloper.kata;

public class FindMissingTerm {

    public class Solution
    {
        public static int findMissing(int[] numbers)
        {
            int firstNumber = numbers[0];
            int lastNumber = numbers[numbers.length - 1];

            int step = (lastNumber - firstNumber) / (numbers.length);

            if (step == 0) {
                return firstNumber;
            }

            int nextNumber = firstNumber;
            for (int number : numbers) {
                if (nextNumber != number) {
                    return nextNumber;
                }
                nextNumber += step;
            }

            return 0;
        }
    }

}
