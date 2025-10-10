package com.company.array;
import java.util.Arrays;

public class reversingArray {
    static int[] rev(int[] arr){
        int n=arr.length;
        int low=0, high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={7,5,9,8,2,3,6,5,4,15,8,4};
        int[] reversedArr=rev(arr);
        System.out.print(Arrays.toString(reversedArr));
    }
}
