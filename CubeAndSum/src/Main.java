import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cube and sum");

        List<Integer> numbers = List.of(1,2,3);

        System.out.println("Sum of cubes is: " + sumOfCubes(numbers));
    }

    private static int sumOfCubes(List<Integer> numbers) {
        return numbers.stream()
                .map(x->x*x*x)
                .reduce(0,Integer::sum);
    }
}