import java.util.*;
public class countSort{
    public static void main(String args[]){
        int arr[] = {2, 5, 3, 0, 2, 3, 0, 3};
        int max = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int freq[] = new int[max+1];
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<freq.length; i++){
            while(freq[i] > 0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}