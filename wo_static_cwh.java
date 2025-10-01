package com.company;

public class wo_static_cwh
{
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x - y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c;
        wo_static_cwh obj = new wo_static_cwh(); //method invocation using object creation
        c = obj.logic(a, b);
        System.out.println(c);
    }
}