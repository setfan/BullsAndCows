import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int num = scanner.nextInt();
        int distance = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();

        for (int j : numbers) {
            if (Math.abs(j - num) < distance) {
                distance = Math.abs(j - num);
            }
        }

        for (int number : numbers) {
            if (Math.abs(number - num) == distance) {
                result.add(number);
            }
        }

        Collections.sort(result);

        result.forEach(elem -> System.out.print(elem + " "));
    }
}