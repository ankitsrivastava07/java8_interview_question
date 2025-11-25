package java8_practice.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberFrequencyOperation {

    public static Map<Integer, Integer> doubleNumberFrequency(List<Integer> numbers) {

        return numbers
                .stream()
                .collect(Collectors
                        .toMap(e -> e, e -> e * 2));
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList();
        Map<Integer, Integer> result = doubleNumberFrequency(numbers);

        System.out.println(result);
    }

}
