public class Target_range {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 4, 4, 7, 7, 7, 7, 9};
        int target = 7;
        int low = 0;
        int high = nums.length-1;
        int mindex1 =-1;
        int  mindex2 =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                mindex1 = mid;
                high = mid-1;
            }
        }
        System.out.println("First Occurrence is "+mindex1);
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                mindex2 = mid;
                low = mid+1;
            }
        }
        int  count = mindex2 - mindex1 +1;
        System.out.println(" Last Occurrence is "+mindex2);
        System.out.print("count:"+count);
            }
        }
