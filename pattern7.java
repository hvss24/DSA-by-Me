public class pattern7{
    public static void main(String args[]){
        int n = 4;
        for(int i=n-1; i>=0; i--){
            int num = (n-i);
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            int maxi = (2*(n-i))-1;
            for(int j=0; j<(maxi/2); j++){
                System.out.print(num+" ");
                num++;
            }
            for(int j=(maxi/2); j<maxi; j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}