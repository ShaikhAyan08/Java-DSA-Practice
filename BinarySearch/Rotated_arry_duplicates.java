public class Rotated_arry_duplicates {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 2, 2};
        int target = 4;
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
            if( nums[low] ==nums[mid] &&  nums[mid]==nums[high]) {
                low++;
                high--;
                continue;
            }if(nums[low] < nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else if(nums[mid] <= target && target <= nums[high]) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(index);
    }
}
