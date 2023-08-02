package ru.daniladeveloper.kata;

class PopulationGrowth {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int total = p0;
        while(total < p) {
            total += (total * percent / 100) + aug;
            years++;
        }

        return years;
    }
}
