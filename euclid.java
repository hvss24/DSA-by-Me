import java.util.*;
public class euclid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int num = n-1;
            Arrays.sort(arr);
            int ans[] = new int[n];
            for(int i=0; i<n; i++){
                ans[i] = arr[num];
                num--;
            }
            boolean print = false;
            for(int i=2; i<ans.length; i++){
                if(ans[i] != (ans[i-2] % ans[i-1])){
                    System.out.println("-1");
                    print = true;
                    break;
                }
            }
            if(!print)System.out.println(ans[0]+" "+ ans[1]);
        }
    }
}