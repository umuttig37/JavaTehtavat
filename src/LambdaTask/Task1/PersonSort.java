package LambdaTask.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25, "New York"));
        people.add(new Person("Sarah", 22, "Los Angeles"));
        people.add(new Person("Mark", 30, "New York"));
        people.add(new Person("Amanda", 27, "Chicago"));
        people.add(new Person("Matthew", 21, "New York"));

        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted by age:");
        people.forEach(System.out::println);

        people.removeIf(p -> !p.getCity().equals("New York"));

        System.out.println("\nFiltered by city 'New York':");
        people.forEach(System.out::println);
    }
}
