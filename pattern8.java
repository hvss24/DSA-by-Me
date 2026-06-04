public class pattern8{
    public static void main(String[] args) {
        int n = 15;
        int spaces = n/2;
        for(int i=0; i<=(n/2); i++){
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            if(spaces == 0)spaces++;
            else spaces--;
            for(int j=1; j<=(2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=(n/2)+1; i<n; i++){
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }
            spaces++;
            for(int j=1; j<=2*(n-i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}