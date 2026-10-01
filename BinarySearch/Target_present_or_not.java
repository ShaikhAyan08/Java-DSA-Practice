public class Target_present_or_not {
        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 4, 5, 7, 7, 9, 10};
            int target = 6;
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
            System.out.println(" Last Occurrence is "+mindex2);
            System.out.print("Range: ["+mindex1+","+mindex2+"]");
        }
    }

