package sortsearch;

public class selection {
    static int selectionSort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return 0;
    }   
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=arr.length;  
        selectionSort(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
