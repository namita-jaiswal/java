public class maximumSubarray1 {
    static int maxSubarr(int[] arr, int n){
        int subarray=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>subarray){
                    subarray=sum;
                }
            }
        }
        return subarray;        
    }   
    public static void main(String[] args) {
    int[] arr={-2,1,-3,4,-1,2,1,-5,4};
    int n=arr.length;  
    System.out.println(maxSubarr(arr,n));
    }
}