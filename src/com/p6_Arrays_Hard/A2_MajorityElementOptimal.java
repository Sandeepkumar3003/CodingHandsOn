package com.p6_Arrays_Hard;

import java.util.ArrayList;

public class A2_MajorityElementOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3, 2, 2};
        System.out.println(arr.length);

        ArrayList<Integer> ans = majorityElementOptimal(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> majorityElementOptimal(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int count1=0;
        int count2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(count1==0 && ele2!=arr[i]){
                ele1 =arr[i];
                count1++;
            } else if (count2==0 && ele1!=arr[i]) {
                ele2 = arr[i];
                count2++;
            } else if (arr[i]==ele1) {
                count1++;
            } else if (arr[i]==ele2) {
                count2++;
            }else {
                count1--;
                count2--;
            }
        }
        lst.add(ele1);
        lst.add(ele2);




//        for(int i=0;i<arr.length;i++){
//            if(count1==0 && ele2!=arr[i]) {
//                ele1 = arr[i];
//                count1++;
//            }
//            else if(count2==0 && ele1!=arr[i]){
//                ele2 =arr[i];
//                count2++;
//            }
//            else if(ele1==arr[i]){
//                count1 = count1+1;
//            }
//            else if(ele2==arr[i]){
//                count2 = count2+1;
//            }
//            else{
//                count1--;
//                count2--;
//            }
//
//        }
//        lst.add(ele1);
//        lst.add(ele2);
        return lst;
    }


}
