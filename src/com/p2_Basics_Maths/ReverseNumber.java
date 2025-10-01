package com.p2_Basics_Maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int output = reverseNumber(n);
        System.out.print(output);
    }

    private static int reverseNumber(int n) {
        int rev = 0;
        int reminder;
        while(n>0){
            reminder = n%10;
            rev = rev*10 + reminder;
            n=n/10;
        }
        return rev;
    }
}
