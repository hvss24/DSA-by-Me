public class prefix1{
    public static void main(String[] args) {
        int arr[] = {5,2,7,1,3};
        //l=1, r = 4
        int sum = 0;
        int prefix[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            prefix[i] = sum;
        }
        //prefixSum(l, r) = prefixSum[r] - prefixSum[l-1]
        int RequiredSum = prefix[4]-prefix[0];
        System.out.println(RequiredSum);
    }
}
