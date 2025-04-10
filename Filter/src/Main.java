import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Filters");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        printEvenNumbersFunctionally(numbers);


    }

    private static boolean isEven(int number){
        return number%2==0;
    }

    private static void printEvenNumbersFunctionally(List<Integer> numbers) {
        numbers.stream()
                .filter(Main::isEven)
                .forEach(System.out::println);
    }
}