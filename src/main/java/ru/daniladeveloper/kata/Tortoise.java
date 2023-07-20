package ru.daniladeveloper.kata;

public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if(v1 >= v2) {
            return new int[]{-1, -1, -1};
        }
        double difference = v2 - v1;


        double time = g / difference;

        int seconds = (int) (time * 3600);
        int hours = (int) (seconds / 3600);
        int minutes = (int)(seconds / 60);

        seconds = seconds - (minutes * 60);
        minutes = minutes - (hours *  60);


        return new int[] {hours, minutes, seconds};
    }
}
