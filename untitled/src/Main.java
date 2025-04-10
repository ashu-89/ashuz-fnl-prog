import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Printing List of numbers functionally");

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
        printListFunctionally(numbers);




    }

    public static void printAnInteger(int x){
        System.out.println(x);
    }

    public static void printListFunctionally( List<Integer> numbers ){
        numbers.stream()
                .forEach(Main::printAnInteger);
    }
}