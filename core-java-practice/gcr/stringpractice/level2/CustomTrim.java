import java.util.Scanner;

public class CustomTrim {

    public static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length()
                && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0
                && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substring(
            String text,
            int start,
            int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(
            String s1,
            String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String customTrim =
                substring(text,
                        indexes[0],
                        indexes[1]);

        String builtInTrim = text.trim();

        System.out.println(
                "Custom Trim = [" + customTrim + "]");

        System.out.println(
                "Built-In Trim = [" + builtInTrim + "]");

        System.out.println(
                "Equal = "
                        + compareStrings(
                        customTrim,
                        builtInTrim));

        sc.close();
    }
}