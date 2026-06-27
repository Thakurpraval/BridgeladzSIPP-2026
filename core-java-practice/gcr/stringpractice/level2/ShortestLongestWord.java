import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitWords(String text) {

        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static int findLength(String str) {

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static String[][] createWordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestLongest(String[][] data) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength =
                    Integer.parseInt(data[i][1]);

            int shortestLength =
                    Integer.parseInt(data[shortestIndex][1]);

            int longestLength =
                    Integer.parseInt(data[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = createWordLengthArray(words);

        int[] result = findShortestLongest(data);

        System.out.println("\nShortest Word: "
                + data[result[0]][0]);

        System.out.println("Length: "
                + data[result[0]][1]);

        System.out.println("\nLongest Word: "
                + data[result[1]][0]);

        System.out.println("Length: "
                + data[result[1]][1]);

        sc.close();
    }
}