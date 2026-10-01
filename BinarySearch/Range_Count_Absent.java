public class Range_Count_Absent {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 4, 5, 5, 5, 5, 7, 9, 9};
        int left = 3;
        int right = 8;
        int low = 0;
        int high = nums.length-1;
        int mindex1 =-1;
        int  mindex2 =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=left){
                mindex1 = mid;
                high = mid-1;
            }else if(nums[mid]<left) {
                low = mid + 1;
            }
        }
        System.out.println("First Occurrence is "+mindex1);
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]>right){
                high = mid-1;
            }else if(nums[mid]<=right) {
                mindex2 = mid;
                low = mid + 1;
                low = mid + 1;
            }
        }
        int  count = mindex2 - mindex1 +1;
        System.out.println(" Last Occurrence is "+mindex2);
        System.out.print("count:"+count);
    }
}


