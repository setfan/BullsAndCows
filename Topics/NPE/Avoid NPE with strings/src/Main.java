import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static String concatStrings(String str1, String str2) {
        /* write your code here */

        boolean isNPE1 = Objects.equals(str1, null);
        boolean isNPE2 = Objects.equals(str2, null);

        if (isNPE1 && isNPE2) {
            return "";
        } else if (isNPE1) {
            return str2;
        } else if (isNPE2) {
            return str1;
        } else {
            return str1.concat(str2);
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}