package bullscows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grinder {

    String secretCode;
    int bulls;
    int cows;
    int[] bullsCows = {0, 0};
    List<Integer> bullsDiscovered = new ArrayList<>();
    List<Integer> cowsDiscovered = new ArrayList<>();


    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    public Grinder(String secretCode) {
        this.secretCode = secretCode;
    }

    private int[] secretCodeToArray(String code) {
        return Arrays.stream(code.split("")).mapToInt(Integer::parseInt).toArray();
    }

    int[] grind(String inputCode) {
        int[] input = Arrays.stream(inputCode.split("")).mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < input.length; i++) {

            int currentNum = secretCodeToArray(this.secretCode)[i];

            for (int j = 0; j < input.length; j++) {
                if (currentNum == input[j] && i == j) {
                    bulls++;
                    bullsDiscovered.add(currentNum);
                } else if (currentNum == input[j] && !isBull(currentNum)) {
                    if(!isCow(currentNum)){
                        cows++;
                        cowsDiscovered.add(currentNum);
                    }
                }
            }
        }
        bullsCows[0] = getBulls();
        bullsCows[1] = getCows();

        zeroTheGrinder();

        return bullsCows;
    }

    private void zeroTheGrinder(){
        this.bulls = 0;
        this.cows = 0;
        bullsDiscovered.clear();
        cowsDiscovered.clear();
    }

    private boolean isBull(int num){
        return bullsDiscovered.contains(num);
    }

    private boolean isCow(int num){
        return cowsDiscovered.contains(num);
    }
}
