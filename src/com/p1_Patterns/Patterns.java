package com.p1_Patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t;i++){
            int n = in.nextInt();
//            pattern1(n);
//            pattern2(n);
//            pattern3(n);
//            pattern4(n);
//            pattern5(n);
//            pattern6(n);
//            pattern7(n);
//            pattern8(n);
//            pattern9(n);
//            pattern10(n);
//            pattern11(n);
//            pattern12(n);
//            pattern13(n);

//            pattern14(n);
//            pattern15(n);
//            pattern16(n);
//            pattern17(n);
            pattern18(n);
//            pattern1333(n);
        }

    }

    private static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*n-2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {

        // Upper half of diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of diamond
        for (int i = n ; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    private static void pattern10(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern11(int n){
        for (int i = 1; i <= n; i++) {

            for(int j=0;j<i;j++){
                int output  = (i+j)%2;
                System.out.print(output);
            }
            System.out.println();

        }
    }

    private static void pattern12(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2*n-2*i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i-j);
            }
            System.out.println();
        }
    }

    private static void pattern13(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <i; j++) {
                System.out.print(start +" ");
                start = start +1;
            }
            System.out.println();
        }
    }

    private static void pattern14(int n) {
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    private static void pattern15(int n) {
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+n-i;ch++){
                System.out.print(ch+" ");
            }
//            int start = 1;
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print(start);
//                start = start+1;
//            }
            System.out.println();
        }
    }


    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print((char)(int)(i+'A')+" ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int i=0;i<n;i++){
//            Spaces
            for (int spaces = 0; spaces < n-i-1; spaces++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print(ch);
            }
            // Decreasing letters
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(int)('A'+n-i+j-1)+" ");
            }
            System.out.println();
        }
    }

    private static void pattern1333(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }



}
