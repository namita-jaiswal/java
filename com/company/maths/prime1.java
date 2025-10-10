package com.company.maths;
//TC:O(n)
public class prime1 {
    static boolean pr(int n){
        if(n==1 || n==0) {
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
    return true;
    }

    public static void main(String[] args) {
        int prime=89;
        System.out.println(pr(prime));
    }
}
