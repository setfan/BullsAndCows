import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        input = input.trim();

        int[] digits = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();


        int sum1 = digits[0] + digits[1] + digits[2];
        int sum2 = digits[3] + digits[4] + digits[5];

        System.out.println(sum1 == sum2 ? "Lucky" : "Regular");

    }
}