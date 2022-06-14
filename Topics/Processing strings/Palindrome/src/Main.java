import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(isPalindrome(scanner.next()) ? "yes" : "no");
    }

    private static boolean isPalindrome(String word) {
        int min = 0;
        int max = word.length() - 1;
        while (true) {
            if (min > max) {
                return true;
            }
            char a = word.charAt(min);
            char b = word.charAt(max);
            if (a != b) {
                return false;
            }
            min++;
            max--;
        }
    }
}