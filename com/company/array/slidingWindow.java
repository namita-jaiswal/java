package com.company.array;

public class slidingWindow {
    static int window(int[] arr, int n, int k) {
        int i,sum=0,max_sum=0;
        for(i=0;i<k;i++){
            sum+=arr[i];
        }
        for(i=k;i<n;i++){
            sum = sum - arr[i - k] + arr[i];;
            if(sum>max_sum){
                return sum;
            }
        }
            return max_sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int n=12,k=3;
        System.out.println(window(arr,n,k));
    }
}