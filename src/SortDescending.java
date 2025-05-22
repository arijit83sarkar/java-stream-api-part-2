import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 54, 60, 22, 36, 58);
        List<Integer> sortedDescending = integerList.stream()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println(sortedDescending);

        List<String> stringList = List.of("Map", "Java", "Strem", "GroupBy", "Sort");
        List<String> sortDsc = stringList.stream()
                .sorted(Collections.reverseOrder())
                .toList();
        System.out.println(sortDsc);
    }
}
