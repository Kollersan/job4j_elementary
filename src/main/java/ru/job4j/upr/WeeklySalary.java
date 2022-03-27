package ru.job4j.upr;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] != 0) {
                if (i < 5) {
                    if (hours[i] > 8) {
                        rsl = rsl + 80 + (hours[i] - 8) * 15;
                    } else {
                        rsl = rsl + 80;
                    }
                } else if (hours[i] > 8) {
                    rsl = rsl + 160 + (hours[i] - 8) * 30;
                } else {
                    rsl = rsl + hours[i] * 20;
                }
            } //else {
                //rsl += 0;
            //}
        }
        return rsl;
    }
}

