public class Binary_search_1 {
    public static void main(String[] args) {
        int [] nums ={2,5,8,12,16,23,38,45};
        int n = nums.length;
        int  target = 23;
        int  low =0;
        int  high = n-1;
        while(low<=high){
            int mid  = low+ (high-low)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;

            }else if(nums[mid]>target){
                high  = mid-1;
            }else{
                low = mid +1;
            }
        }
    }
}
