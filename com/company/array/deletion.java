public class deletion {
    static int del(int[] arr, int x){
        int n=arr.length;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]==x){
                break;
            }
        }
            if(i==n)
                return n;
            for(int j=1;j<n-1;j++){
                arr[i]=arr[j+1];
        }
        return (n-1);
    }

    public static void main(String[] args) {
        int x=12;
        int[] arr={3,8,12,5,6};
        System.out.println(del(arr,x));
    }
}
