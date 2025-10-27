package array;

public class moveZeroes {
    static void  moveZeroesToEnd(int [] arr, int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={0,1,0,3,12};
        int n=arr.length;
        moveZeroesToEnd(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}
