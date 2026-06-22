public class ceilNumber {
    public static int ceilingIdx(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(target <= arr[mid]){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if(ans == -1){
            System.out.println("There is no element in the array that is greater than or equal to target.That's why we are returning -1.");
        }
        return ans;
    }
    public static void main(String[] args) {
        //find ceiling of a number(target) according to the given array.
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        int ans = ceilingIdx(arr, target);
        System.out.println(ans);
    }
}
