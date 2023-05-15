package v8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseMainTest {
    public static void main(String[] args) {

        List<CourseModel> courses = new ArrayList<>();
        courses.add(new CourseModel("Python", 45));
        courses.add(new CourseModel("JavaScript", 150));
        courses.add(new CourseModel("Java 8", 113));
        courses.add(new CourseModel("C", 55));

        courses.stream()
                .filter(course -> course.getStudents() > 50)
                .forEach(course -> System.out.println(course.getName()));

        Stream<String> named = courses.stream().map(CourseModel::getName);

        courses.stream()
                .filter(course -> course.getStudents() > 60)
                .map(CourseModel::getStudents)
                .forEach(System.out::println);

        courses.stream()
                .collect(Collectors.toMap(
                        CourseModel::getName,
                        CourseModel::getStudents))
                .forEach((name, students) -> System.out.println(name + " has " + students + " students"));
    }
}
