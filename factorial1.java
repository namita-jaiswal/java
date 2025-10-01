package com.company;
//TC: T(n-1)+0(1)=0(n)
public class factorial1 {
    static int factorials(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return (n * factorials(n - 1));
        }
    }
    public static void main(String[] args) {
        int fact=4;
        System.out.println(factorials(fact));
    }
}
