import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Distinct and Sorted!");

        List<Integer> numbers = List.of(1,2,3,3,4,5,5,5,6,7,8,8,8,8,8);

        System.out.println("full list: ");
        numbers.stream().forEach(System.out::println);

        System.out.println("only distinct: ");
        numbers.stream().distinct().forEach(System.out::println);

        List<Integer> random = List.of(5,1,3,9,8,6,1,3,5,8);

        System.out.println("sorted");
        random.stream().sorted().forEach(System.out::println);

        System.out.println("sorted and distinct");
        random.stream().sorted().distinct().forEach(System.out::println);

        System.out.println("distinct and sorted");
        random.stream().distinct().sorted().forEach(System.out::println);


    }
}