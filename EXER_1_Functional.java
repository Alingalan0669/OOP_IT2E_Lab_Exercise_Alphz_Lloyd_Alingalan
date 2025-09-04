import java.util.*;
import java.util.stream.Collectors;

public class FunctionalExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Functional: pure transformations, no mutation
        List<Integer> squaredEvens = numbers.stream()
                .filter(FunctionalExample::isEven)
                .map(FunctionalExample::square)
                .collect(Collectors.toList());

        System.out.println("Functional Result: " + squaredEvens);
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static int square(int n) {
        return n * n;
    }
}
