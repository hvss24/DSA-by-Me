import java.util.*;
public class Gfg{
    public static int maxPairSum(int arr[], int k){
            Arrays.sort(arr);
            int n = arr.length;
            int maxPairSum = 0;
            for(int i=n-1; i>0; i--){
                if((arr[i] - arr[i-1]) < k){
                    maxPairSum = maxPairSum + arr[i]+arr[i-1];
                    i--;
                }
            }
            return maxPairSum;
    }
    public static void main(String[] args) {
        int arr[] = {5,15,10,300};
        int k = 12;
        System.out.println(maxPairSum(arr, k));
    }
}