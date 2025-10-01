package com.p2_Basics_Maths;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean output = palindrome(n);
        System.out.print(output);
    }

    private static boolean palindrome(int n) {
        int rev = 0;
        int temp = n;
        int reminder;
        while(n>0){
            reminder = n%10;
            rev = rev*10 + reminder;
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
