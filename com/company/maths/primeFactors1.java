package maths;

public class primeFactors1 {
    static int prime(int n) {
        int x=0;
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                x=i;
                while(n%x==0) {
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
    int primes=24;
        int largest=prime(primes);
        System.out.println("Largest prime factor = " + largest);
        System.out.println(51%3);
    }
}