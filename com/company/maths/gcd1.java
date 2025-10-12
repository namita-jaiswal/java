package maths;

public class gcd1 {
    static int divisor(int a,int b) {
        int c= Math.min(a,b);
        while(c>1) {
            if(a%c==0 && b%c==0) {
                break;
            }
            c--;
        }
        return c;
    }

        public static void main (String[]args) {
            int num1=22,num2=44;
            System.out.println(divisor(num1,num2));
        }
    }