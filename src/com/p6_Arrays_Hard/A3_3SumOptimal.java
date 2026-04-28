package com.p6_Arrays_Hard;

import java.util.*;

public class A3_3SumOptimal {
    public static void main(String[] args) {
//        int[] arr = {-1,0,1,2,-1,-4};
        int[] arr = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};

        List<List<Integer>> ans = Solution3SumOptimal(arr);
        List<List<Integer>> ans2 = Solution3SumOptimalPractice(arr);
        System.out.println(ans2);
    }

    private static List<List<Integer>> Solution3SumOptimalPractice(int[] arr) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==0){
                    lst.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                    while (left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while (left<right && arr[right]==arr[right+1]){
                        right--;
                    }
                }
                else if (sum<0) {
                    left++;
                }else{
                    right--;
                }
            }
        }return lst;
    }

    private static List<List<Integer>> Solution3SumOptimal(int[] arr) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            int left = i+1;
            int right = arr.length-1;
            while (left<right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum==0){
                    lst.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;

                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while (left<right && arr[right]==arr[right+1]){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }

        }
        return lst;

    }
}
