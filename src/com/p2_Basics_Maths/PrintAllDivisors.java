package com.p2_Basics_Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printAllDivisors(n);


        ArrayList<Integer> output = printAllDivisorsOptimized(n);
        System.out.print(output.toString());

    }

    private static ArrayList<Integer> printAllDivisorsOptimized(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i*i <= n; i++) {
            if(n%i == 0){
                divisors.add(i);
                if(n/i != i){
                    divisors.add(n/i);
                }
            }

        }
        return divisors;
    }

    private static void printAllDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                System.out.println(i);
            }

        }
    }

}
