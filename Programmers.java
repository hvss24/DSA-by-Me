import java.util.*;
public class Programmers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int moves = 0;
            if(a == b)System.out.println(0);
            else if(Math.abs(a- b) == 1)System.out.println(1);
            else{
                while(a != b){
                    if(b > a){
                    int temp = a;
                    a = b;
                    b = temp;
                    }
                    int diff1 = Math.abs(a-b);
                    int diff2 = Math.abs((a/x) - b);
                    if(diff1 > diff2){
                        a = a/x;
                        moves++;
                    }
                    else{
                        moves += Math.abs(a-b);
                        a = b;
                    }
                }
                System.out.println(moves);
            }
        }
    }
}