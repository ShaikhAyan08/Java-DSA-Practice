public class Two_pointers_basic {
    public static void main(String[] args) {
        int [] numbers = {2,3,5,8,11,14};
        int  target = 13;
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int current_sum = numbers[left] + numbers[right];
            if (current_sum == target) {
                System.out.println("The target number is : " + numbers[left] + " + " +numbers[right] + " = " +target );
                break;
            }
            else if (current_sum < target) {
                left++;
            }
            else {
                right--;
            }

        }
    }
}
