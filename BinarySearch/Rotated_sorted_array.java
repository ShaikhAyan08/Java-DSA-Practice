public class Rotated_sorted_array {
    public static void main(String[] args) {
        int[] nums = {12, 15, 18, 2, 5, 8, 10};
        int target = 15;
        int low = 0, high = nums.length-1;
        int mindex =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                mindex = mid;
                break;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high = mid-1;
                }else{
                   low = mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[high]){
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
        }
        System.out.println(mindex);
    }
}
