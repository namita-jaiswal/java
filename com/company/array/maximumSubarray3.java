// kadane's algorithm

public class maximumSubarray3 {
    static int kadane(int[] arr, int n){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=+arr[i];
            if(sum>max){
                max=sum;
            }
        }
    return sum;
    }
    public static void main(String[] args) {
    int[] arr={-2,1,-3,4,-1,2,1,-5,4};
    int n=arr.length;
    System.out.println(kadane(arr,n));   
    }
}