package com.bridgelabz.day7;

public class TwoNibble {
    static int swapNibbles(int x)
    {
        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    // Driver code
    public static void main(String arg[])
    {
        int x = 200;
        System.out.print(swapNibbles(x));
    }
}

