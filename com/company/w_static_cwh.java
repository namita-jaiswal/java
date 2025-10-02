package com.company;
public class w_static_cwh
{
    static int logic(int x, int y)
    {
        int z;
        if (x > y)
        {
            z = x + y;
        } else
        {
            z = x - y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c;
        c = logic(a, b);
        System.out.println(c);
    }
}