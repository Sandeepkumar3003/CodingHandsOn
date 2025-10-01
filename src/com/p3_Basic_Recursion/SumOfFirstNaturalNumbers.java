package com.p3_Basic_Recursion;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        sumOfN(n,0);
        int output = sumOfNFuctional(n);
        System.out.println(output);

    }

    private static int sumOfNFuctional(int n) {
        if (n==0){
            return 0;
        }
        return n + sumOfNFuctional(n-1);
    }

    private static void sumOfN(int i, int sum) {
        if(i<1){
            System.out.println(sum);
            return;
        }

        sumOfN(i-1,sum+i);



    }




//
//
//
////    Parameterized
//    private static void sumOfN(int i, int sum) {
//        if(i<1){
//            System.out.println(sum);
//            return;
//        }
//
//        sumOfN(i-1,sum+i);
//    }
//
//
////    Functional way
//
//    private static int sumOfNFuctional(int n) {
//        if(n==0){
//            return 0;
//        }
//        return n + sumOfNFuctional(n-1);
//    }
}
