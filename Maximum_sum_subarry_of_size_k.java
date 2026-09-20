public class Maximum_sum_subarry_of_size_k {
    public static void main(String[] args) {
        int [] nums = {2,5,1,8,2,9,1};
        int k = 3;
        int windosum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i<k;i++) {
            windosum += nums[i];
        }
        System.out.println("windosum = " + windosum);
        maxsum = windosum;
        for (int i = k;i<nums.length;i++) {
            windosum = windosum - nums[i - k] + nums[i];
            if (windosum > maxsum) {
                maxsum = Math.max(maxsum, windosum);
                start = i - k + 1;
                end = i;
            }
        }
        System.out.print("Subarray: [");

        for (int j = start;j <=end;j++){
                System.out.print(nums[j]);
                if (j<end){
                    System.out.print(", ");
                }

        }
        System.out.println("]");
        System.out.println("maxsum = " + maxsum);
    }
}
