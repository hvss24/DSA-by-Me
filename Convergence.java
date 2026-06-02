import java.util.*;
public class Convergence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int med = (n-1)/2;
            int count1 = 0;
            int count2 = 0;
            for(int i=0; i<med; i++){
                if(arr[i] != arr[med]){
                    count1++;
                }too
            }
            for(int i=med; i<n; i++){
                if(arr[i] != arr[med]){
                    count2++;
                }
            }
            System.out.println(Math.max(count1, count2));
        }
    }
}
