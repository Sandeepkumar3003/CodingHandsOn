package com.p6_Arrays_Easy;

public class A13_FindNumberThatAppearsOnceAndOthersTwice_Better_Hashing {
    public static void main(String[] args) {


        int[] arr ={1,1,2,2,3,4,4,5,5};
        int ans = appearsOnceBetter(arr);
        System.out.println(ans);
    }

    private static int appearsOnceBetter(int[] arr) {
//        need to find maximum value
        int max=-1;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int n = max+1;
        int[] mpp = new int[n];

        for (int i=0;i<arr.length;i++){
            mpp[arr[i]]++;
        }

        for(int i=0;i<arr.length;i++){
            if(mpp[arr[i]]==1){
                return arr[i];
            }
        }
        return -1;
    }
}
