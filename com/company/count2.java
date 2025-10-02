package com.company;

public class count2 {
    static int out(long n) {
        if (n == 0) {
            return 1; //log10(0) is undefined
        }
        return (int) (Math.log10(Math.abs(n))) + 1;
    }
    public static void main(String[] args) {
        long d = 123455L;
        System.out.println(out(d));
    }
}

