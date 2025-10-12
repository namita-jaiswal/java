package array;

public class largestElement1 {
    static int large(int[] arr){
        int n=arr.length;
        for (int i=0; i<n ; i++) {
            boolean flag = true;
                for (int j = 0; j < n; j++) {
                    if (arr[j] > arr[i]){
                        flag=false;
                        break;
                }
            }
                if(flag==true){
                    return i;
                }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] arr={3,6,9,8,4,5,2};
        System.out.println(large(arr));
    }
}
