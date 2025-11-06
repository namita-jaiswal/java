package hashing;

public class openAdressing {
    static class MyHash{
        int[] arr;
        int cap, size;
        MyHash(int c){
            cap=c;
            size=0;
            arr=new int[cap];
            for(int i=0;i<cap;i++){
                arr[i]=-1;
            }
        }
    int hash(int key){
        return key%cap;
    }
}
    public static void main(String[] args) {
        
    }
}
