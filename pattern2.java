public class pattern2 {
    public static void main(String args[]){
        int n = 26;
        int last = 65+n;
        for(int i=65; i<last; i++){
            for(int j=65; j<=i; j++){
                char ch = (char)(i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
