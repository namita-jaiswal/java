package com.company; // Brian Kerningam's Algorithm

public class countSetBits2 {
static int bit (int n) {
    int count = 0;
    while (n > 0) {
        n = n & (n - 1); // clear the lowest set bit
        count++;
    }
    return count;
    }

        public static void main(String[] args) {
        int c=5;
        System.out.println(bit(c));
    }
}