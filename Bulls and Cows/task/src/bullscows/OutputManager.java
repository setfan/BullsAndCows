package bullscows;

public class OutputManager {
    private final int winningScore = 4;

    String bullName = "bull";
    String cowName = "cow";


    void createOutput(int bulls, int cows) {

        if (bulls > 1) {
            this.bullName = "bulls";
        }
        if (cows > 1) {
            this.cowName = "cows";
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

    protected void printFinalMessage(){

        printMessage("Congratulations! You guessed the secret code.");
    }

    protected void printMessage(String message){
        System.out.println(message);
    }
}