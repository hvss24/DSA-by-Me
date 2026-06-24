public class ceilNumber {
    public static int ceilingIdx(int arr[], int target){
        //ceiling of a number means that samllest number that is greater than or equal to target
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] > target){
                e = mid-1;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
            else return mid;
        }
        return s;
    }
    public static void main(String[] args) {
        //find ceiling of a number(target) according to the given array.
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        int ans = ceilingIdx(arr, target);
        System.out.println(ans);
    }
}
