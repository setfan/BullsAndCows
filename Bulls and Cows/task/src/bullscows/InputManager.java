package bullscows;

import java.util.Scanner;

public class InputManager {

    private static Scanner scanner = new Scanner(System.in);
    private static int codeLength = 0;
    private static int symbolLength = 0;


    protected static int readCodeLength() {

        System.out.println("Please, enter the secret code's length:");

        String input = scanner.nextLine();

        codeLength = parseNumber(input);


        return codeLength;
    }

    protected static int readSymbolLength() {
        System.out.println("Input the number of possible symbols in the code:");

        String input = scanner.nextLine();

        symbolLength = parseNumber(input);

        if (codeLength > symbolLength) {
            OutputManager.printMessage("Error: it's not possible to " +
                    "generate a code with a length of " +
                    codeLength + " with " + symbolLength + " unique symbols.");
            return 0;

        }

        return symbolLength;
    }


    protected static String readCode() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int parseNumber(String input) {
        int number = 0;
        try {
            number = Integer.parseInt(input);

        } catch (NumberFormatException e) {
            OutputManager.printMessage("Error: \"" + input + "\" isn't a valid number.");
        }

        if (number == 0) {
            OutputManager.printMessage("Error: length can't be 0.");
        } else if (number > 36) {
            OutputManager.printMessage("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            return 0;
        }

        return number;
    }
}
