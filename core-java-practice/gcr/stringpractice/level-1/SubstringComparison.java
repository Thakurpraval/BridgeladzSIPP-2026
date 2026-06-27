import java.util.Scanner;

public class SubstringComparison {

    // Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Compare two strings
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        System.out.print("Enter Start Index: ");
        int start = sc.nextInt();

        System.out.print("Enter End Index: ");
        int end = sc.nextInt();

        String userSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean result = compareStrings(userSubstring, builtInSubstring);

        System.out.println("\nUser Defined Substring : " + userSubstring);
        System.out.println("Built-in Substring     : " + builtInSubstring);
        System.out.println("Both substrings are same : " + result);

        sc.close();
    }
}