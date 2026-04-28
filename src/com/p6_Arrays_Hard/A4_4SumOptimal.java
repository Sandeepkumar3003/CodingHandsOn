package com.p6_Arrays_Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4_4SumOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> lst = Solution4SumOptimal(arr);
        System.out.println(lst);

    }

    private static List<List<Integer>> Solution4SumOptimal(int[] arr) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int left = j+1;
                int right = arr.length-1;

                while (left<right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum==0){
                        lst.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;

                        while(left<right && arr[left]==arr[left-1]){
                            left++;
                        }
                        while (left<right && arr[right]==arr[right+1]){
                            right--;
                        }

                    } else if (sum<0) {
                        left++;
                    }else{
                        right--;
                    }

                }
            }



        }
        return lst;
    }
}
