package com.p3_Basic_Recursion;

import java.util.Scanner;


public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        String input = "madam";
        int n = input.length();
        boolean ans = palindrome(input, 0,n);
        System.out.println(ans);

        boolean ans1 = palindrome1(input, 0);
        System.out.println(ans1);


    }

    private static boolean palindrome(String input,int i, int n) {
        if(i>=n/2){
            return true;
        }
        if(input.charAt(i)!=input.charAt(n-1)){
            return false;
        }

        return palindrome(input,i+1,n-1);
    }


    private static boolean palindrome1(String input,int i) {
        int n = input.length();
        if(i>=n/2){
            return true;
        }
        if(input.charAt(i)!=input.charAt(n-i-1)){
            return false;
        }

        return palindrome1(input,i+1);
    }
}
