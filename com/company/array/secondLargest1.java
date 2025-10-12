package array;

public class secondLargest1 {
    static int cis(int[] arr, int n) {
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }
    static int sec(int[] arr, int n){
        int largest=cis(arr,n);
        int res=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1)
                    res=i;
                else if(arr[i]>arr[res])
                    res=i;
            }
        }
    return res;
    }
    public static void main(String[] args) {
        int[] a={7,1,5,3,9,2,8,6};
        int n=8;
        System.out.println(sec(a,n));
    }
}
