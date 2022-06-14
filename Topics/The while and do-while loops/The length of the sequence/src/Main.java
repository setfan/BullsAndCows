import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (!"0".equals(scanner.next())) {
            counter++;
        }

        System.out.println(counter);
    }
}