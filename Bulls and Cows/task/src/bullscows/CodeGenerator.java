package bullscows;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class CodeGenerator {
    private static final Random random = new Random();
    private static String code = "";
    private static final String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";

    private static void appendElem(char ch) {
        code += Character.toString(ch);
    }

    public static String generateCode(int codeLength, int symbolLength) {

        char ch;

        while (code.length() < codeLength) {

            ch = symbols.charAt(random.nextInt(symbolLength));
            appendElem(ch);


            code = Arrays.stream(code.split(""))
                    .distinct()
                    .collect(Collectors.joining());
        }

        String letterEnd = Character.toString(symbols.charAt(symbolLength - 1));

        String incognitoCode = code.replaceAll("[a-z\\d]", "*");

        OutputManager.printMessage("The secret is prepared: " +
                incognitoCode + " (0-9, a-" + letterEnd + ").");

        return code;

    }
}
