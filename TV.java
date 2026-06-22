import java.util.*;
public class TV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<n; i++){
                sb.append(s.charAt(i));
            }
                boolean print = false;
                for(int i=0; i<n-k; i++){
                    if(sb.charAt(i) == '1'){
                        sb.setCharAt(i, '0');
                    }
                    if(sb.charAt(i+k) == '1'){
                        sb.setCharAt(i+k, '0');
                    }
                }
                for(int i=0; i<n; i++){
                    if(sb.charAt(i) == '1'){
                        System.out.println("No");
                        print = true;
                        break;
                    }
                }
                if(!print)System.out.println("Yes");
        }
    }
}
