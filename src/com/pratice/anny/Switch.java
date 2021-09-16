package com.pratice.anny;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        double sqr,sroot,cube;
        int n,choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no:");
        n=sc.nextInt();
        System.out.println("See the Instruction:");
        System.out.println("1.Sqaure:");
        System.out.println("2.Sqaure root:");
        System.out.println("3.Cube:");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                sqr=n*n;
                System.out.println("Square of" +n+ "is:" +sqr);
                break;

            case 2:
                sroot=Math.sqrt(n);
                System.out.println("Square of" +n+ "is:" +sroot);
                break;

            case 3:
                cube=n*n*n;
                System.out.println("Cube of" +n+ "is:" +cube);
                break;


            default:
                System.out.println("Your choice wrong.");
                break;

        }
    }

}
