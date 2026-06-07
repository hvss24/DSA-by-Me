public class pattern9{
    public static void main(String[] args) {
        int n = 4;
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int left = j;
                int right = 2*n-2-j;
                int top = i;
                int bottom = 2*n-2-i;
                int val = Math.min(top, Math.min(bottom, Math.min(left, right)));
                System.out.print(n-val);
            }
            System.out.println();
        }
    }
}