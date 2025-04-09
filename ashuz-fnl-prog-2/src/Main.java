import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        List<Integer> integerList = new ArrayList<>();

        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);

        Main main = new Main();
        main.printUsingStreams(integerList);

    }



    public void printUsingStreams(List<Integer> myList){

        for(Integer x: myList){
            System.out.println(x);
        }

    }

}



