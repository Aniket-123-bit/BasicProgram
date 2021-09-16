package com.aniket.program;

public class Interface implements TwoNumber{
    public void add()
    {
        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
    }
    public void sub()
    {
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
    }
    public static void main(String[] args)
    {
        Interface obj = new Interface();
        obj.add();
        obj.sub();
    }
}
