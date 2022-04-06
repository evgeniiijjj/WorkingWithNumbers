import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        intList.forEach(num -> {
            if (num > 0 && num % 2 == 0) {
                if (result.isEmpty()
                        || num > result.get(result.size() - 1)) result.add(num);
                else {
                    for (int j = 0; j < result.size(); j++) {
                        if (num <= result.get(j)) {
                            result.add(j, num);
                            break;
                        }
                    }
                }
            }
        });
        result.forEach(i -> System.out.print(i + " "));
    }
}
