package com.p6_Arrays_Easy;

public class A11_FindMissingNumberInArray_Brute {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    private static int missingNumber(int[] arr) {
        int n = arr.length;
        for(int i=1;i<=n;i++){
            int flag =0;
            for (int j = 0; j <n ; j++) {
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }if(flag==0){
                return i;
            }
        }
        return -1;

    }
}
