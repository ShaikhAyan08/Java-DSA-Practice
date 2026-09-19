public class sliding_window_1 {
    public static void main(String[] args) {
        int [] nums = {2,1,5,2,3,2};
        int k = 7;
        int sum  = 0;
        int left = 0;
        int minlength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= k) {
                minlength = Math.min(minlength, i-left + 1);
                sum -= nums[left];
                left++;
            }

        }
        if(minlength == Integer.MAX_VALUE){
            System.out.println(0);
        } else {
            System.out.println(minlength);
        }
    }
}
