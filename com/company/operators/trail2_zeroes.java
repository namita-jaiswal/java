package operators;
// TC: 0(log n)
public class trail2_zeroes {
    static int kuku (int n) {
        int labubu=0;
        for(int i=5;i<=n;i=i*5){
            labubu=labubu+n/i;
        }
     return labubu;
    }

    public static void main(String[] args) {
        int bubu=10;
        System.out.println(kuku(bubu));
    }
}
