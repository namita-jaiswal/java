package com.company;
// x<<y = x*(2)^y
// x>>y = Math.floor(x/(2)^y)
public class bitwiseOperators2 {
    static int bit (int x) {
        int rs=33; //000....010001
        System.out.println(x<<1); //000.....110
        System.out.println(x<<2); //000....1100
        System.out.println(rs>>1); //000...0010000
        System.out.println(rs>>2); //000....0001000
    return 0;
    }

    public static void main(String[] args) {
        int x=3; //00.......011 (32 bits)
        System.out.println(bit(x));
    }
}