package array;
import java.util.Arrays;

public class sorting012 {
    static int[] sort012(int[] arr, int n){
        int cnt1=0,cnt2=0,cnt0=0;
        for (int i=0; i<n; i++) {
            if(arr[i]==0){
                cnt0++;
            }
            else if(arr[i]==1){
                cnt1++;
            }
            else if(arr[i]==2){
                cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        } 
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i]=1;
        }
        for(int i=cnt0+cnt1;i<n;i++){
            arr[i]=2;
        }  
    return arr;
    } 
public static void main(String[] args) {
    int[] arr={0,2,1,2,0,1,0,1,2,0,1};
    int n=arr.length;
    System.out.println(Arrays.toString(sort012(arr,n)));
    }
}