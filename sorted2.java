package com.company;

public class sorted2 {
    static boolean sort(int[] arr){
        int n=arr.length-1;
        for (int i=1;i< n;i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
   return true;
    }

    public static void main(String[] args) {
        int [] array={1,5,6,7,8,9};
        System.out.println(sort(array));
    }
}
