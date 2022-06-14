package bullscows;

import java.util.Scanner;

public class InputManager {
    private static Scanner scanner;


    protected static int readCodeLength() {
        System.out.println("Please, enter the secret code's length:");
        scanner = new Scanner(System.in);
        int codeLength = scanner.nextInt();

        if (codeLength > 10) {
            System.out.println("Error: can't generate a secret number with a " +
                    "length of 11 because there aren't enough unique digits.");
        } else {

            return codeLength;
        }
        scanner.close();
        return 0;
    }

    protected static String readCode() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
