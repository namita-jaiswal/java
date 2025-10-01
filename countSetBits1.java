package com.company;
// TC:0(total number of bits)
public class countSetBits1 {
    static int bit(int n) {
        int res = 0;
        while (n > 0) {
            if ((n & 1) == 1) { // if((n%2!=0)
                res++;
            }
                n = n >> 1; // n=n/2;
        }
        return res;
    }

        public static void main(String[] args) {
            int x = 13;
        System.out.println(bit(x));
    }
}