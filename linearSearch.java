package com.company;

public class linearSearch {
    static int LinearSearch(int[] nums, int target) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target=4;
        System.out.println(LinearSearch(nums,target));
    }
}