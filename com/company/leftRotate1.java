public class leftRotate1 {
    static void byOne(int[] nums) {
        int n=nums.length;
        int temp=nums[0];
        for (int i=1;i<n;i++) {
            nums[i-1]=nums[i];
            nums[n-1]=temp;
        }
    }

    public static void main(String[] args) {

    }
}