import java.util.*;
import java.util.stream.Collectors;

public class DeclarativeExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Just declare the transformations
        List<Integer> squaredEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Declarative Result: " + squaredEvens);
    }
}
