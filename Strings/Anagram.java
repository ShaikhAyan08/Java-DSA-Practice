import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Latent";
        String s2 = "Talent";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if(s1.length()!=s2.length()) {
            System.out.println("Lengths do not match");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]!=arr2[i]) {
                System.out.print("False");
            }
            else {
                System.out.print("True");
            }
        }

    }
}
