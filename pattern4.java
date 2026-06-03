public class pattern4{
    public static void main(String[] args) {
        int n = 26;
        for(int i=n-1; i>=0; i--){
            char ch = (char)(65+i);
            for(int j=i; j<n; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}