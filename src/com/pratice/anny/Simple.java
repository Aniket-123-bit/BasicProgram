package com.pratice.anny;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        int p;
        float r,t,si;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principal:");
        p=s.nextInt();
        System.out.println("Enter time in months:");
        t=s.nextInt();
        System.out.println("Enter rate:");
        r=s.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple interest:" +si);

    }
}
