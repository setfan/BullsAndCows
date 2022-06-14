import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        String longestWord = "";
        int longestSize = Integer.MIN_VALUE;

        for (String word :
                words) {
            if (word.length() > longestSize) {
                longestSize = word.length();
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}