public class RecursionBasics2 {
    public static void print(int n){
        if(n == 0)return;
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 8;
        print(8);
    }
}
