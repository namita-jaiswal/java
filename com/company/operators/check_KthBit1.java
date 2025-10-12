package operators;

public class check_KthBit1 {
    static boolean bit (int n, int k) {
         if ((n&(1<<(k-1)))!=0) { // 1 in binary is 000....001 and 1<<(k-1) = 0000.....100
             return true;
         }
         else {        // so & of 000....101
                       // and     000....100
    return false;      // is      000....100 hence, Kth bit is set
        }
    }
    public static void main(String[] args) {
        int z=5,y=3; //5 in binary is 0000.....101
        System.out.println(bit(z,y));
    }
}