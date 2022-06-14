import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.stream(values)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> toPrint = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                toPrint.add(list.get(i));
            }
        }

        Collections.reverse(toPrint);

        toPrint.forEach(elem -> System.out.print(elem + " "));
    }
}