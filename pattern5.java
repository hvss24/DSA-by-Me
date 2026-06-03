public class pattern5{
    public static void main(String args[]){
        int n = 50;
        for(int i=n-1; i>=0; i--){
            int num = 1;
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<n; j++){
                System.out.print(num);
                num++;
                if(num < 10)System.out.print(" ");
            }
            System.err.println();
        }
    }
}