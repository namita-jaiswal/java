package operators;
//TC: O(n)
public class trail1_zeroes {
    static int trail(int t) {
        int fact=1,res=0;
        for(int i=1;i<=t;i++) {
         fact=fact*i;
         while((fact%10)==0) {
             res++;
             fact=fact/10;
         }
        }
        return res;
    }

    public static void main(String[] args) {
    int lol=10;
        System.out.println(trail(lol));
    }
}