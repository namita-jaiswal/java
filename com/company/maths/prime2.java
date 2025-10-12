package maths;
// TC:O((sqrt of n)
public class prime2 {
    static boolean prime(int n) {
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=1;
        System.out.println(prime(n));
    }
}