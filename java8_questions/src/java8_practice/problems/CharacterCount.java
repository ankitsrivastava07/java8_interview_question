package java8_practice.problems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    public static Map<Character, Long> countOccurrenceOfEachCharacter(String str) {

        return str
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));

    }

    public static void main(String args[]) {
        String name = "Ankit Srivastava";
        System.out.println(countOccurrenceOfEachCharacter(name));

    }
}
