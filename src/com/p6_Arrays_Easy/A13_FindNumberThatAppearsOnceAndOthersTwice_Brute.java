package com.p6_Arrays_Easy;

public class A13_FindNumberThatAppearsOnceAndOthersTwice_Brute {
    public static void main(String[] args) {

        int[] arr ={1,1,2,2,3,4,4,5,5};
        int ans = appearsOnce(arr);
        System.out.println(ans);
    }

    private static int appearsOnce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count = count+1;
                }
            }if(count==1){
                return arr[i];
            }

        }return  -1;

    }
}
