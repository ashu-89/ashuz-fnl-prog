import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collect List of even numbers");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        List<Integer> evenNumbers = getListOfEvenNumbers(numbers);

        evenNumbers.stream().forEach(System.out::println);

    }

    private static List<Integer> getListOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }
}