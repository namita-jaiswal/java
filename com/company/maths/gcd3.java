package maths;

public class gcd3 {
    static int gcd(int a,int b) {
        if(b==0)
            return a;
        else
    return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int h=90,g=81;
        System.out.println(gcd(h,g));
    }
}
