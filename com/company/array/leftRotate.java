package array;

public class leftRotate {
    static void leftrotate(int[] arr, int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,7};
    int n=arr.length;
    leftrotate(arr,n);
    for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}