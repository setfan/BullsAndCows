import java.util.*;

public class Main {
    static String outputGenerator(String args) {
        String[] maxElements = args.split("\\*");
        int minNumber = Integer.MAX_VALUE;
        int[] arr;
        int seed = 0;

        for (String maxElement : maxElements) {
            arr = Arrays.stream(maxElement.split("\\s")).mapToInt(Integer::parseInt).toArray();

            if (arr[1] < minNumber) {
                minNumber = arr[1];
                seed = arr[0];
            }
        }
        return new String(seed + "\n" + minNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Random random;

        StringBuilder result = new StringBuilder();
        int temp;

        for (int seed = a; seed <= b; seed++) {
            int refMax = Integer.MIN_VALUE;
            random = new Random(seed);
            result.append(seed).append(" ");
            for (int i = 0; i < n; i++) {
                temp = random.nextInt(k);

                if (temp > refMax) {
                    refMax = temp;
                }
            }
            result.append(refMax).append("*");
        }

        System.out.println(outputGenerator(result.toString()));
    }

}