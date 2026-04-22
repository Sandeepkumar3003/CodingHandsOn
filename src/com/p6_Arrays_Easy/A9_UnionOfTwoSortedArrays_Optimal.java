package com.p6_Arrays_Easy;

import java.util.ArrayList;

public class A9_UnionOfTwoSortedArrays_Optimal {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {1,2,3,4,4,5,6,7,7,8};

        ArrayList<Integer> ans = UnionOutputOptimal(arr1,arr2);


        System.out.println(ans);

    }


    private static ArrayList<Integer> UnionOutputOptimal(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i =0;
        int j = 0;

        int m = arr1.length;
        int n = arr2.length;

        while (i<m && j<n){
            if(arr1[i]<arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else if(arr1[i]>arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
            else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i<m){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }

        while (j<n){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }

        return ans;
    }
}
