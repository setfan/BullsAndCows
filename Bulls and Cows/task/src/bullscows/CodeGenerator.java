package bullscows;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CodeGenerator {

    public static String generateCode(int length) {

        String number = "";

        while (number.length() < 10) {
            number = Arrays.stream(randomGenerator().split(""))
                    .distinct()
                    .collect(Collectors.joining());
        }

        return number.substring(0, length);
    }


    private static String randomGenerator() {
        long pseudoRandomNumber = System.nanoTime();

        return String.valueOf(pseudoRandomNumber);
    }
}
