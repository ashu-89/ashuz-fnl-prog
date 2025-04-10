import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Square and sum");

        List<Integer> numbers = List.of(1,2,3);

        int sum = sumOfSquares(numbers);
        System.out.println("Sum of squares is: " + sum);

    }

    private static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x*x)
                .reduce(0, Integer::sum);
    }
}