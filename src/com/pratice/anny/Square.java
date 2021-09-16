package com.pratice.anny;


import java.util.Scanner;

public class Square {
    public static void main(String args[]){
        double x, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any +ve no:");
        x=in.nextFloat();
        result=Math.sqrt(x);
        System.out.println("Square root of"+x+"is:"+result);

    }
}
