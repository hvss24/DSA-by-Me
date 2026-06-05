public class pattern11{
    public static int sum(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j == i){
                    System.out.print(j+"="+sum(i));
                }
                else{
                    System.out.print(j+"+");
                }
            }
            System.out.println();
        }
    }
}