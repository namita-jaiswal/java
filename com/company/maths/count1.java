package maths;

public class count1 {
    static int count(long n) {

        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long c = 678976787;
        System.out.println(count(c));
    }
}
