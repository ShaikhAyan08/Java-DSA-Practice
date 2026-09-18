public class Slide_Window {
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4; // Window size
        int window_sum = 0;
        int max_sum = Integer.MIN_VALUE;
         for (int i = 0; i < k; i++) {
             window_sum += nums[i];

         }
         max_sum = window_sum;
             System.out.println("the Window of Size 4  is sum  : "+ window_sum);
         for (int i = k; i < nums.length; i++){
             window_sum= window_sum - nums[i - k] + nums[i];
             max_sum = Math.max(max_sum, window_sum);

         }
         System.out.println((double)max_sum/k);
    }
}
