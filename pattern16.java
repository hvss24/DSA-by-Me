public class pattern16{
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<2*i; j++){
                if(j % 2 != 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}