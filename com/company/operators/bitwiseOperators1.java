package operators;
public class bitwiseOperators1 {
    static int operator_AND(int a, int b) {
        int x =(a&b); // produces input as 1 when both of the inputs are 1
    return x;
    }
    static int operator_OR(int a, int b) {
        int y=(a|b); // produces input as 1 when any o the inputs are 1
    return y;
    }
    static int operator_XOR(int a, int b) {
        int z =(a^b); // produces input as 1 when 2 input bits are different
        return z;
    }

    public static void main(String[] args) {
        int q=3;
        int p=9;
        System.out.println(operator_AND(p,q));
        System.out.println(operator_OR(p,q));
        System.out.println(operator_XOR(p,q));
    }
}
