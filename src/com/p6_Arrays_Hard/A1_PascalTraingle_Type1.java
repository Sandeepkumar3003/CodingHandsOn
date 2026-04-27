package com.p6_Arrays_Hard;

public class A1_PascalTraingle_Type1 {
    public static void main(String[] args) {


//        to print element at particular place when Row and Column number is given
        int row = 6;
        int column = 3;
        int ans = pascal(row,column);
        System.out.println(ans);
    }

    private static int pascal( int r, int c) {


        int res = 1;
        for (int i = 1; i < c; i++) {
            res = res * (r-i);
            res = res/(i);

        }

        return res;
    }
}
