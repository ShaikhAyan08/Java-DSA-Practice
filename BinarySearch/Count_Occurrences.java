public class Count_Occurrences {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 5, 7, 9};
        int target = 2;
        int low = 0;
        int high = nums.length-1;
        int firstIndex = -1;
        int secondIndex = -1;
        while(low<=high){
            int mid  = low +(high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else {
                firstIndex = mid;
                high = mid - 1;
            }
            }
        System.out.println("First Index : "+firstIndex);
        low = 0;
        high = nums.length-1;
        while(low<=high){
            int mid  = low +(high-low)/2;
            if(nums[mid]>target){
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                secondIndex = mid;
                low = mid+1;
            }
        }
        int count = secondIndex - firstIndex +1;
        System.out.println("Second Index : "+secondIndex);
        System.out.println("Count : "+count);

    }
}
