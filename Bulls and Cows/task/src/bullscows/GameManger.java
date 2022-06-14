package bullscows;

public class GameManger {
    private int numberOfTurns = 1;
    Grinder grinder;
    OutputManager outputManager = new OutputManager();
    int[] bullsAndCows;
    int codeLength;

    public GameManger() {
        grinder = new Grinder(generateCode());
    }

    protected void startGame() {
        outputManager.printMessage("Okay, let's start a game!");
        nextTurn();
    }

    protected void nextTurn() {
        outputManager.printMessage("Turn " + this.numberOfTurns + ":");
        increaseNumberOfTurns();
        gameLoop(InputManager.readCode());
    }

    private void increaseNumberOfTurns() {
        this.numberOfTurns++;
    }

    private String generateCode() {
        codeLength = InputManager.readCodeLength();
        return CodeGenerator
                .generateCode(codeLength);
    }

    private void gameLoop(String nextCode) {
        bullsAndCows = this.grinder.grind(nextCode);

        outputManager.createOutput(bullsAndCows[0], bullsAndCows[1]);

        if (bullsAndCows[0] == codeLength) {
            outputManager.printFinalMessage();
        } else {
            nextTurn();
        }
    }
}
