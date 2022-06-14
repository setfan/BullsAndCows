import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int counterVowel = 0;
        int counterConsonant = 0;
        int sequence = 3;
        boolean isSequenceV = false;
        boolean isSequenceC = false;
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                counterConsonant = 0;
                counterVowel++;
                if (counterVowel == sequence) {
                    isSequenceV = true;
                    isSequenceC = false;
                }
            } else {
                counterVowel = 0;
                counterConsonant++;
                if (counterConsonant == sequence) {
                    isSequenceC = true;
                    isSequenceV = false;
                }
            }
            if (isSequenceV) {
                result++;
                counterVowel = 1;
                isSequenceV = false;
            } else if (isSequenceC) {
                result++;
                counterConsonant = 1;
                isSequenceC = false;
            }
        }

        System.out.println(result);
    }

    public static boolean isVowel(Character letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }
}