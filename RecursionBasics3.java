public class RecursionBasics3 {
    public static int fact(int n){
        if(n == 1)return 1;
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fact(n));
    }
}
