public class Target_not_present {
    public static void main(String[] args) {
        int[] nums = {4, 9, 13, 18, 25, 31, 40, 52};
        int target = 20;
        int low = 0;
        int high = nums.length-1;
        boolean flag = false;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                flag = true;
                break;
            }else if(nums[mid]>target){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        if(!flag){
            System.out.println(-1);

        }
    }
}
