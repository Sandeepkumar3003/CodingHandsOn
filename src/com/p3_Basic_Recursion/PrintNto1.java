package com.p3_Basic_Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printNto1(1,n);
    }

    private static void printNto1(int i,int n) {
        if(i>n){
            return;
        }

        printNto1(i+1,n);
        System.out.println(i);

    }
}
