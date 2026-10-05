public class First_Last_occurence {
    public static void main(String[] args) {
        String s = "programming";
        char target = 'g';
        int  first = -1;
        int last = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println(first);
        System.out.println(last);

    }
}