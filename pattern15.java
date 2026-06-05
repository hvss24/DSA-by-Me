public class pattern15 {
    public static void main(String[] args) {
        int n = 10;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                if(i == 1 || i == n){
                    System.out.print("*");
                }
                else{
                    if(j == n || j == i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
