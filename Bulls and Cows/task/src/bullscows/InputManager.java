package bullscows;

import java.util.Scanner;

public class InputManager {

    private static Scanner scanner;


    protected static int readCodeLength() {
        System.out.println("Please, enter the secret code's length:");
        scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

    protected static int readSymbolLength() {
        System.out.println("Input the number of possible symbols in the code:");
        scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    protected static String readCode() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
