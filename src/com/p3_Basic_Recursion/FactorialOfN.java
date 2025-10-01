package com.p3_Basic_Recursion;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        factorial(n,1);
        int output = factorialOfNFuctional(n);
        System.out.println(output);

    }

    private static int factorialOfNFuctional(int n) {
        if(n==0){
            return 1;
        }

        return n * factorialOfNFuctional(n-1);
    }

    private static void factorial(int i, int fact) {
        if(i<1){
            System.out.println(fact);
            return;
        }

        factorial(i-1,fact*i);
    }


}
