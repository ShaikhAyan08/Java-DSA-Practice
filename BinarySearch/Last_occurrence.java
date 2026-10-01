public class Last_occurrence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 3, 5, 8, 8, 10};
        int target = 3;
        int mindex = -1;
        int  low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]==target){
                mindex = mid;
                low = mid+1;
            }else if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(mindex);

    }
}
