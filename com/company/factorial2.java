package com.company;

//TC: 0(f), SC: O(1)
public class factorial2 {
    static int fc(int f) {
        int fact=1;
        for(int i=1;i<=f;i++) {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int fac=10;
        System.out.println(fc(fac));
    }
}