import java.util.Arrays;

public class Reverse_letters {
    public static void main(String[] args) {
        String  s = "ab-cd";
        char[] arr = s.toCharArray();
        int  i = 0;
        int j = arr.length-1;
        while (i < j) {
            Character.isLetter(arr[i]);
            Character.isLetter(arr[j]);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(arr));

    }
}
