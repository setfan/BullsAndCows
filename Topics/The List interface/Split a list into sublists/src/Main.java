import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class ListUtils {

    /**
     * It splits the passed list into a sequence of sublists with a predefined size
     */
    public static <T> List<List<T>> splitListIntoSubLists(List<T> list, int subListSize) {
        List<List<T>> sublists = new ArrayList<>();

        int sublistsSize = list.size() / subListSize;
        int sublistsSizeLast = list.size() % subListSize;

        if (sublistsSize == 0) {
            sublists.add(list.subList(0, sublistsSizeLast));
        } else {
            int index = 0;
            for (int i = 0; i < sublistsSize; i++) {
                sublists.add(list.subList(index, index + subListSize));
                index += subListSize;
            }
            if (sublistsSizeLast > 0) {
                sublists.add(list.subList(list.size() - sublistsSizeLast, list.size()));

            }
        }


        return sublists;
    }
}

/* Please, do not modify code in this class */
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String[] values = scanner.nextLine().split("\\s+");

        final List<Integer> list = Arrays.asList(values).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        final int subListSize = Integer.parseInt(scanner.nextLine());

        final List<List<Integer>> subLists = ListUtils.splitListIntoSubLists(list, subListSize);

        subLists.forEach(subList -> {
            final String representation = subList.stream().map(Object::toString).collect(Collectors.joining(" "));
            System.out.println(representation);
        });
    }
}