package maths;

public class lcm2 {
    static int opt(int a, int b) {
        if (b == 0)
            return a;
        else
            return opt(b, a % b);
    }
        static int lcm_opt (int a, int b) {
            return (a*b)/opt(a,b);
        }

        public static void main(String[] args) {
        int a1=45,a2=54;
        System.out.println(lcm_opt(a1,a2));
    }
}