package com.p6_Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;

public class A1_PascalTraingle_Type3 {
    public static void main(String[] args) {

//        to print element at particular row
        int n =6;
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for(int i=1;i<=n;i++){
            lst.add(pascalType3(i));
        }

        System.out.println(lst);
    }

    private static ArrayList<Integer> pascalType3(int n) {
        int res=1;
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(1);
        for(int i=1;i<n;i++){
            res = res *(n-i);
            res= res/i;
            lst.add(res);
            System.out.println(res);
        }
        return lst;

    }
}
