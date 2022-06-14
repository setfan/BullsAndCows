import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.charAt(i));
        }
        int len = letters.size();

        if (len % 2 == 0) {
            letters.remove(len / 2 - 1);
            letters.remove(len / 2 - 1);
        } else {
            letters.remove(len / 2);
        }

        letters.forEach(System.out::print);

    }
}