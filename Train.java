import java.util.*;
public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int min = 6;
            int max = 1;
            for(int i=0; i<n; i++){
                int num = sc.nextInt();
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }
            System.out.println(max+1-min);
        }
    }
}
