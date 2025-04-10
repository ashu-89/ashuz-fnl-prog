import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Filter plus lambda");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        printEvenNumbersFunctionally(numbers);
    }

    private static void printEvenNumbersFunctionally(List<Integer> numbers) {
        numbers.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}