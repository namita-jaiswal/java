public class leftRotateD {
    static void leftRotate(int[] arr, int d, int n){
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i]; //i-d -> 7-3 = 4; 6-3 = 3; 5-3 = 2; 4-3 = 1; 3-3 = 0 (the last element i.e n=7 will be shifted to d=3 i-d=4th place)
        }
        for(int i=0;i<d;i++){
            arr[n-d+i]=temp[i]; //temp[0]=n-dth index; temp[1]=2n-dth+1 index; temp[2]=n-dth+2 index; and run the loop from 0 to d so basically, n-d+i
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=2;
        leftRotate(arr,d,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
