public class First_element_greater {
    public static void main(String[] args){
        int[] nums = {1, 2, 4, 4, 4, 7, 9};
        int target = 4;
        int low = 0;
        int high = nums.length-1;
        int mindex =-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if(nums[mid]>target) {
                mindex = mid;
                high = mid-1;
            }else if(nums[mid]<target) {
                low = mid+1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(nums[mindex]);
    }
}
