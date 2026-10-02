public class Sorted_Rotatry_arry {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 2, 3, 4, 5};
        int target = 3;
        int low = 0;
        int high = nums.length-1;
        int mindex = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                mindex = mid;
                break;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<= target && target< nums[mid]){
//                    mindex = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid]<= target && target< nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        System.out.println(mindex);
    }
}
