public class floorNumber {
    public static int floor(int arr[], int target){
        //floor of a number means the greatest number which is smaller than or equal to target.
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] < target){
                s= mid+1;
            }
            else if(arr[mid] > target){
                e = mid-1;
            }
            else return mid;
        }
        return e;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 14, 16, 19, 23};
        int target = 16;
        System.out.println(floor(arr, target));
    }
}
