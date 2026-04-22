package com.p6_Arrays_Easy;

public class A11_FindMissingNumberInArray_Optimal {
    public static void main(String[] args) {


            int[] arr = {1,2,3,5};
            int ans = missingNumberOptimal(arr);
            System.out.println(ans);

    }

    private static int missingNumberOptimal(int[] arr) {
        int sum=0;
        int n = arr.length+1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }

        int sum2 = (n*(n+1))/2;

        int ans = sum2-sum;

        return ans;
    }

}
