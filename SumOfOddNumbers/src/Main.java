import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of odd numbers");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        System.out.println("The sum of odd numbers is: " + sumOfOddNubers(numbers));
    }

    private static int sumOfOddNubers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 != 0)
                .reduce(Integer::sum)
                .orElse(0);
    }
}