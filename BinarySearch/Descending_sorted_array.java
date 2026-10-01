public class Descending_sorted_array {
    public static void main(String[] args) {
        int[] nums = {90, 75, 63, 51, 42, 30, 18, 7, 2};
        int target = 30;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                System.out.println(mid);
                break;
            }else if(nums[mid]>target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
    }
}
