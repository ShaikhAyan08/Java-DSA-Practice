public class MInimum_sum_subarry_size_k {
    public static void main(String[] args) {
        int [] nums ={4,2,7,1,8,3};
        int  start = 0;
        int end = 0;
        int minsum  = Integer.MAX_VALUE;
        int sum = 0;
        int k = 3;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        System.out.println("sum = "+sum);
        minsum = sum;
        for (int i = k; i < nums.length; i++) {
            sum  = sum -nums[i-k] + nums[i];
            if(sum < minsum){
                minsum = Math.min(sum, minsum);
                start = i - k + 1;
                end = i;
            }
        }
        System.out.println("minsum = "+minsum);
        System.out.print("Subarray: [");
        for (int j = start; j <= end; j++) {
            System.out.print(nums[j]);
            if(j<end){
                System.out.print(", ");
            }

        }
        System.out.println("]");

    }
}
