package array;
public class leaders{
    static void lead(int [] arr, int n){
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
        if (flag==false){
            System.out.print(arr[i]+" ");
        }
    }
}

static void leader2(int [] arr, int n){
    int curr_lead=arr[n-1];
    System.out.println(curr_lead);
    for(int i=n-2;i>=0;i--){
        if(curr_lead<arr[i]){
            curr_lead=arr[i];
            System.out.println(curr_lead);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={16,17,4,3,5,2};
        int n=arr.length;
        lead(arr,n);
        leader2(arr,n);
    }
}