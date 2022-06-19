import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        int number;

        while (true) {

            input = scanner.nextLine();
            if ("0".equals(input)) {
                return;
            }

            try {

                number = Integer.parseInt(input);
                System.out.println(number * 10);

            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}