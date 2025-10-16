package sortsearch;
public class binarySearch {
    static int binary(int arr[], int l, int r, int key){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                return binary(arr,l,mid-1,key);
            }
            return binary(arr,mid+1,r,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int key=3;
        int result=binary(arr,0,n-1,key);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }
}