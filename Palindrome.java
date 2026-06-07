import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(long n){
        String s = String.valueOf(n);
        int i=0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            if(n < 23){
                boolean print = false;
                for(int b=0; b<=23; b+=12){
                    long a = n-b;
                    if(isPalindrome(a)){
                        System.out.println(a+" "+ b);
                        print = true;
                        break;
                    }
                }
                if(!print)System.out.println(-1);
            }
            else{
                if(n % 12 == 0){
                    int a = 0;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 1){
                    int a = 1;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 2){
                    int a = 2;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 3){
                    int a = 3;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 4){
                    int a = 4;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 5){
                    int a = 5;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 6){
                    int a = 6;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 7){
                    int a = 7;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 8){
                    int a = 8;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 9){
                    int a = 9;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 10){
                    int a = 22;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
                else if(n % 12 == 11){
                    int a = 11;
                    long b = n-a;
                    System.out.println(a + " "+ b);
                }
            }
        }
    }
}
