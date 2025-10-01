package com.p3_Basic_Recursion;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        print1toN(1,n);
    }

    private static void print1toN(int i,int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        print1toN(i+1,n);

    }
}
