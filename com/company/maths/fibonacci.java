package maths;

public class fibonacci {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n-1)+ fib(n-2);
        }
    }
public static void main(String[] args) {
    int fibb=5;
    for(int i=1;i<=fibb;i++) {
        System.out.println(fib(i));
    }
}
}