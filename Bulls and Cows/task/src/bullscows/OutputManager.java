package bullscows;

public class OutputManager {
    private final int winningScore = 4;

    static String bullName = "bull";
    static String cowName = "cow";


    static void createOutput(int bulls, int cows) {

        if (bulls > 1) {
            bullName = "bulls";
        }
        if (cows > 1) {
            cowName = "cows";
        }
        String output = "Grade: ";
        if (bulls == 0 && cows > 0) {
            output = output + cows + " " + cowName;
        } else if (bulls > 0 && cows == 0) {
            output = output + bulls + " " + bullName;
        } else if (bulls == 0 && cows == 0) {
            output = output + " None.";
        } else {
            output = output + bulls + " " + bullName + " and " + cows + " " + cowName;
        }


        printMessage(output);
    }

    static protected void printFinalMessage() {

        printMessage("Congratulations! You guessed the secret code.");
    }

    static protected void printMessage(String message) {
        System.out.println(message);
    }
}