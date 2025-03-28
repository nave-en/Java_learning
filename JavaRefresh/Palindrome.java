public class Palindrome {
    public static void main(String[] args) {
        String txt = "Madam";
        txt = txt.toLowerCase();
        int left = 0, right = txt.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (txt.charAt(left) != txt.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left += 1;
            right -= 1;
        }
        if (isPalindrome) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Its not a Palindrome");
        } 
    }
}
