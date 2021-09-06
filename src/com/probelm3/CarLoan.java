package com.probelm3;

public class CarLoan {
    public static void main(String[] args) {
        double principal = 1000;
        double years = 2;
        double rate = 20;

        double r = (rate / 100) / 12;   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }
}
