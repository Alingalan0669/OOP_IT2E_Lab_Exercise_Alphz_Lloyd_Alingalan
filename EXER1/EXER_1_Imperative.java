import java.util.*;

public class EXER_1_Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squaredEvens = new ArrayList<>();

        // Explicit step-by-step instructions
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                squaredEvens.add(num * num);
            }
        }

        System.out.println("Imperative Result: " + squaredEvens);
    }
}
