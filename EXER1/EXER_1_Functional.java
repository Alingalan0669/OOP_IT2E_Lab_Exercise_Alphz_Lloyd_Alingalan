import java.util.*;
import java.util.stream.Collectors;

public class EXER_1_Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Functional: pure transformations, no mutation
        List<Integer> squaredEvens = numbers.stream()
                .filter(EXER_1_Functional::isEven)
                .map(EXER_1_Functional::square)
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
