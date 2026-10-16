public class Remove_vowels {
    public static void main(String[] args) {
        String s = "education";
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
            }else  {
                sb.append(arr[i]);
            }

        }
        System.out.println(sb.toString());
    }
}
