package com.p2_Basics_Maths;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int output = countNumber(n);
        System.out.print(output);
    }

    private static int countNumber(int n) {
        int count = 0;
        while(n>0){
            count = count + 1;
            n  = n/10;
        }
        return count;
    }

}
