package sortsearch;
public class recursiveBubble {
    static int bubble(int arr[], int n){
        if(n==1){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        return bubble(arr,n-1);
    }
public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    int n=arr.length;
    bubble(arr,n);
    }   
}
