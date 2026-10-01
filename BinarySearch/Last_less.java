public class Last_less {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 4, 7, 9};
        int target = 7;
        int low = 0;
        int mindex = -1;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                mindex = mid;
                low = mid+1;

            }else{
                high = mid-1;
            }
        }
        System.out.println(nums[mindex]);

    }
}
