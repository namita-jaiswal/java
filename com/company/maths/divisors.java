package maths;
//TC: 0(n)
//SC: 0(1)
public class divisors {
    static int div(int n) {
        for(int i=1;i<n;i++) {
        if (n%i==0) {
            System.out.println(i);
        }
    }
    return n;
}

    public static void main(String[] args) {
    int digit=24;
        System.out.println(div(digit));
    }
}
