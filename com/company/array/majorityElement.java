public class majorityElement { 
    static int major(int [] arr, int n){
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                   if(cnt>n/2){
                    return arr[i];
                   } 
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int[] arr={3,3,4,2,4,4,2,4,4};
    int n=arr.length;
    System.out.println(major(arr,n));  
    }
}