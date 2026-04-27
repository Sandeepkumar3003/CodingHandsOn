package com.p6_Arrays_Hard;

import java.util.*;

public class A3_3SumBetter {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = Solution3SumBetter(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> Solution3SumBetter(int[] arr) {
        Set<List<Integer>> ans = new HashSet<>();
        int third = 0;
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> st = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                third = -(arr[i]+arr[j]);
                if(st.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                st.add(arr[j]);
            }
        }

        return new ArrayList<>(ans);
    }
}
