package sortsearch;

public class merge {
    static int mergeSort(int[] arr, int r, int m, int l){
       int n1=m-r+1;
       int n2=l-m;
       int[]L=new int[n1];
       int[]R=new int[n2];
    return 0;
}
    static void mergeSort (int[] arr, int r, int l){
        if(r>l){
            int m = (r+l)/2;
            mergeSort(arr, r, m);
            mergeSort(arr, m+1, l);
            mergeSort(arr, r, m, l);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1,10};
        int l=arr.length;
        int r=0;
        mergeSort(arr,r,l);
        System.out.println("Sorted array:");
        for(int i=0;i<l;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
