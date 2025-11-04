public class largestElement2 {
    static int large(int[] arr){
        int res=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]>arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={2,5,7,3,8};
        System.out.println(large(arr));
    }
}
