package com.company.maths;

public class gcd2 {
    static int gcd (int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
    int h=66,g=99;
        System.out.println(gcd(h,g));
    }
}
