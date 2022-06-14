import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();

        String password = Generate.password(a, b, c, n);

        System.out.println(password);
    }
}

class Generate {

    public static int generateNumberOfFour(Random rnd) {
        String randomAppend = "1234";
        return Integer.parseInt(Character
                .toString(randomAppend.charAt(rnd
                        .nextInt(randomAppend.length()))));
    }

    public static boolean appendElem(StringBuilder password, char ch) {

        if (password.length() == 0) {
            password.append(ch);
            return true;
        } else if (password.charAt(password.length() - 1) != ch) {
            password.append(ch);
            return true;
        } else {
            return false;
        }
    }

    public static String password(int a, int b, int c, int n) {

        boolean toIgnoreA = a == 0;
        boolean toIgnoreB = b == 0;
        boolean toIgnoreC = c == 0;

        String digits = "0987654321";
        String smallLetters = "abcdefghijklmopqrstuvwxyz";
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialSymbols = "!@£$%^&*_";

        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        char ch;
        int callAppend;

        while (password.length() < n) {
            callAppend = generateNumberOfFour(rnd);
            switch (callAppend) {
                case 1:
                    if (a > 0) {
                        ch = capitalLetters.charAt(rnd.nextInt(capitalLetters.length()));
                        boolean appended = appendElem(password, ch);
                        if (appended) {
                            a--;
                        }
                    }
                    break;
                case 2:
                    if (b > 0) {
                        ch = smallLetters.charAt(rnd.nextInt(smallLetters.length()));
                        boolean appended = appendElem(password, ch);
                        if (appended) {
                            b--;
                        }
                    }
                    break;
                case 3:
                    if (c > 0) {
                        ch = digits.charAt(rnd.nextInt(digits.length()));
                        boolean appended = appendElem(password, ch);
                        if (appended) {
                            c--;
                        }
                    }
                    break;
                case 4:
                    if (a == 0 && b == 0 && c == 0) {
                        ch = specialSymbols.charAt(rnd.nextInt(specialSymbols.length()));
                        appendElem(password, ch);
                    }
                    break;
                default:
                    break;
            }

            if (a == 0 && b == 0 && c == 0) {
                if (!toIgnoreA) {
                    a = generateNumberOfFour(rnd);
                }
                if (!toIgnoreB) {
                    b = generateNumberOfFour(rnd);
                }
                if (!toIgnoreC) {
                    c = generateNumberOfFour(rnd);
                }
            }
        }

        return password.toString();
    }
}