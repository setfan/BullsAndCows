package bullscows;

public class GameManger {
    private int numberOfTurns = 1;
    Grinder grinder;
    int[] bullsAndCows;
    int codeLength;

    int symbolLength;


    public GameManger() {
        grinder = new Grinder(generateCode());
    }

    protected void startGame() {
        OutputManager.printMessage("Okay, let's start a game!");
        nextTurn();
    }

    protected void nextTurn() {
        OutputManager.printMessage("Turn " + this.numberOfTurns + ":");
        increaseNumberOfTurns();
        gameLoop(InputManager.readCode());
    }

    private void increaseNumberOfTurns() {
        this.numberOfTurns++;
    }

    private String generateCode() {
        codeLength = InputManager.readCodeLength();
        symbolLength = InputManager.readSymbolLength();
        return CodeGenerator
                .generateCode(codeLength, symbolLength);
    }

    private void gameLoop(String nextCode) {
        bullsAndCows = this.grinder.grind(nextCode);

        OutputManager.createOutput(bullsAndCows[0], bullsAndCows[1]);

        if (bullsAndCows[0] == codeLength) {
            OutputManager.printFinalMessage();
        } else {
            nextTurn();
        }
    }
}
