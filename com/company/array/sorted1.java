package array;

public class sorted1 {
    static boolean sort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<=n;i++) {
            for(int j=i+1;j<n-1;j++) {
                if(arr[j]<arr[i])
                    return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(sort(arr));
    }
}
