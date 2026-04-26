package com.p6_Arrays_Medium;

public class A3_MajorityElement_Brute {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,2,2,4,2,2};

        int ans  = majorityNumber(arr);
        System.out.println(ans);
    }

    private static int majorityNumber(int[] arr) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }
}
