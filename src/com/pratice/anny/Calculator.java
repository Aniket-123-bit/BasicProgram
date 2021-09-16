package com.pratice.anny;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        float a,b,sum,sub,mul,div,mod;
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two any nos:");
        a= in.nextFloat();
        b=in.nextFloat();
        System.out.println("see the instruction:");
        System.out.println("1.Addition:");
        System.out.println("2.Subtration:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("5.Modularation:");
        System.out.println("Enter your choice:");
        choice= in.nextInt();
        switch (choice){
            case 1:
                System.out.println("you are chose addition:");
                sum=a+b;
                System.out.println("Result:"+sum);
                break;
            case 2:
                System.out.println("you are chose subtraction:");
                sub=a-b;
                System.out.println("Result:"+sub);
                break;

            case 3:
                System.out.println("you are chose multiplication:");
                mul=a-b;
                System.out.println("Result:+mul");
                break;
            case 4:
                System.out.println("you are chose division:");
                div=a/b;
                System.out.println("Result:+div");
                break;
            case 5:
                System.out.println("you are chose modularation:");
                mod=a%b;
                System.out.println("Result:+mod");
                break;

            default:
                System.out.println("you choice wrong:");
                break;
        }

    }
}
