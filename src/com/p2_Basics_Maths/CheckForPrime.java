package com.p2_Basics_Maths;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean output = primeNumber(n);
        System.out.println(output);

        boolean output1 = primeNumberOptimized(n);
        System.out.println(output1);
    }

    private static boolean primeNumberOptimized(int n) {
        int flag = 0;
        for (int i = 2; i*i < n; i++) {
            if(n%i==0){
                flag = flag +1;
                break;
            }

        }
        if(flag == 0){
            return true;
        }
        else {
            return false;
        }

    }

    private static boolean primeNumber(int n) {
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                flag = flag +1;
                break;
            }

        }
        if(flag == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
