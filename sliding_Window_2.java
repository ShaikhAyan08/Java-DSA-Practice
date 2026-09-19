public class sliding_Window_2 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 3};
        int k = 6;
        int  left = 0;
        int minlength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= k) {
                int curretlength = i -left + 1;
                if (curretlength < minlength) {
                    minlength = curretlength;
                    start = left;
                    end = i;
                }
                sum -= nums[left];
                left++;
            }
        }
        System.out.println("Minimum Length: " + minlength);

        System.out.print("Subarray: [");

        for (int j = start; j <= end; j++) {
            System.out.print(nums[j]);

            if (j < end) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
