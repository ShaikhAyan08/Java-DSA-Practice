public class Basic_binary_search {
    public static void main(String[] args) {
        int[] nums = {3, 7, 11, 18, 24, 31, 42, 56, 70};
        int target = 56;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

    }
}
