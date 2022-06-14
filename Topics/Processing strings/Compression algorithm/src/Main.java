import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        char current;
        int counter = 1;
        StringBuilder result = new StringBuilder();

        if (arr.length == 1) {
            System.out.println(input + "1");
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            current = arr[i];

            if (current == arr[i + 1]) {
                counter++;
            } else {
                result.append(current);
                result.append(counter);
                counter = 1;
            }

            if (i == arr.length - 2) {
                result.append(arr[i + 1]);
                result.append(counter);
            }
        }

        System.out.println(result);

    }
}