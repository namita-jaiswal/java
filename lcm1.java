package com.company;
//TC:O(a*b)-max(a,b))
public class lcm1 {
    static int lcm1(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0){
            return res;
            }
            res++;
        }
    }

    public static void main(String[] args) {
        int lcm1=45,lcm2=54;
        System.out.println(lcm1(lcm1,lcm2));
    }
}
