package com.p3_Basic_Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int output = fibonacci(n);
        System.out.println(output);

    }

    private static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);

        return last + slast;
    }
}
