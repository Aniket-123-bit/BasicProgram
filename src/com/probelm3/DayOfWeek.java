package com.probelm3;

public class DayOfWeek {
    public static void main(String[] args) {
        int m = 9;
        int d = 23;
        int y = 2021;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        System.out.println(d0);

    }
}
