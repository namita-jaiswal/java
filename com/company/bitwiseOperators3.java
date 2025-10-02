package com.company;
// 0 to 1 and vice versa
public class bitwiseOperators3 {
    static int not(int n) {
        System.out.println(~n);
        return 0;
    }

    public static void main(String[] args) {
        int not = 33; // ~ tilde
        System.out.println(not(not));
    }
}
