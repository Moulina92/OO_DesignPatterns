package src.recursion.introduction;

public class ReverseOfString {
    public String reverse(String s) {
        // your algorithm here
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
