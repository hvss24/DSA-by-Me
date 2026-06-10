import java.util.*;
public class AIProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            //without AI
            int time1 = (n/(x+y)) + 1;
            if(n % (x+y) == 0){
                time1 -= 1;
            }
            //with AI
            int time2 = z;
            if(n > z*x){
                int lines = n-(z*x);
                time2 += lines/(x+(10*y)) + 1;
                if(lines % (x+(10*y)) == 0){
                    time2 -= 1;
                }
            }
            System.out.println(Math.min(time1, time2));
        }
    }
}
