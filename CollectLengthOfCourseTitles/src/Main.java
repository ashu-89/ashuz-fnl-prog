import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collect Length of course titles");

        List<String> courses = List.of("math", "science", "english", "social studies", "sanskrit");

        List<Integer> courseSizes = getCourseSizes(courses);

        courseSizes.forEach(System.out::println);
    }

    private static List<Integer> getCourseSizes(List<String> courses) {
        return  courses.stream().map(course -> course.length())
                .collect(Collectors.toList());
    }
}