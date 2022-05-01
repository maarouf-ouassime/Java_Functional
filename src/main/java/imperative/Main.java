package imperative;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ouassime", MALE),
                new Person("Maarouf", MALE),
                new Person("Khadija", FEMALE),
                new Person("Amina", FEMALE),
                new Person("Ali", MALE),
                new Person("Rachida", FEMALE)
        );

        // Imperative Approach
        System.out.println("// Imperative Approach");
        List<Person> females = new ArrayList<>();

        for (Person person:people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female:females) {
            System.out.println(female);
        }

        // Declarative Approach
        System.out.println("// Declarative Approach");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,FEMALE
    }
}
