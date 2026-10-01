import java.util.Scanner;

public class First_and_Last_Occurrence {
    public static void main(String args[]){
        int[] nums = {1, 3, 3, 3, 5, 5, 5, 8, 10};
        int target = 5;
        int low = 0;
        int high = nums.length-1;
        int mindex1=0;
        int mindex2=0;
        while(low<=high){
            int mid = low +(high-low)/2;
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
        System.out.println("Range : ["+mindex1 +", "+mindex2+"]");
    }
}
