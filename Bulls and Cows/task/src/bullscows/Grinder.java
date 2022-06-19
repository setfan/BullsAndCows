package bullscows;

import java.util.ArrayList;
import java.util.List;

public class Grinder {

    String secretCode;
    int bulls;
    int cows;
    int[] bullsCows = {0, 0};
    List<String> bullsDiscovered = new ArrayList<>();
    List<String> cowsDiscovered = new ArrayList<>();


    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    public Grinder(String secretCode) {
        this.secretCode = secretCode;
    }


    int[] grind(String input) {
        String[] inputCode = input.split("");
        String[] secretCodeArray = secretCode.split("");



        for (int i = 0; i < inputCode.length; i++) {

            String currentElem = secretCodeArray[i];

            for (int j = 0; j < inputCode.length; j++) {
                if (currentElem.equals(inputCode[j]) && i == j) {
                    bulls++;
                    bullsDiscovered.add(currentElem);
                } else if (currentElem.equals(inputCode[j]) && !isBull(currentElem)) {
                    if (!isCow(currentElem)) {
                        cows++;
                        cowsDiscovered.add(currentElem);
                    }
                }
            }
        }
        bullsCows[0] = getBulls();
        bullsCows[1] = getCows();

        zeroTheGrinder();

        return bullsCows;
    }

    private void zeroTheGrinder() {
        this.bulls = 0;
        this.cows = 0;
        bullsDiscovered.clear();
        cowsDiscovered.clear();
    }

    private boolean isBull(String elem) {
        return bullsDiscovered.contains(elem);
    }

    private boolean isCow(String elem) {
        return cowsDiscovered.contains(elem);
    }
}
