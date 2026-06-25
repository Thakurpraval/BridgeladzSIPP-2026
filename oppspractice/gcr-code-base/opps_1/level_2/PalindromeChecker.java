public class PalindromeChecker {

    String text;

    boolean isPalindrome() {

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        return text.equalsIgnoreCase(reverse);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text +
                    " is a Palindrome.");
        } else {
            System.out.println(text +
                    " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p =
                new PalindromeChecker();

        p.text = "MADAM";

        p.displayResult();
    }
}