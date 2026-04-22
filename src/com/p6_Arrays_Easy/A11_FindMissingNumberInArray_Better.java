package com.p6_Arrays_Easy;

public class A11_FindMissingNumberInArray_Better {
    public static void main(String[] args) {


            int[] arr = {1,2,4,5};
            int ans = missingNumberBetter(arr);
            System.out.println(ans);

    }

    private static int missingNumberBetter(int[] arr) {
        int n = arr.length;

        int[] mpp = new int[n+2];
//        n+2 because for hashing it need to store from 0 to n+1 value

        for (int i = 0; i < arr.length; i++) {
            mpp[arr[i]] = 1;

        }

        for (int i=1;i<=n+1;i++){
            if(mpp[i]==0){
                return i;
            }
        }
        return -1;
    }
}
