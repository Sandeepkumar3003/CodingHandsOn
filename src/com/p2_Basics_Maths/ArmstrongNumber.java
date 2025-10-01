package com.p2_Basics_Maths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean output = armstrong(n);
        System.out.print(output);
    }

    private static boolean armstrong(int n) {
        int rev = 0;
        int temp = n;
        int reminder;
        while(n>0){
            reminder = n%10;
            rev = rev + reminder*reminder*reminder;
            n=n/10;
        }
        if(rev == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
