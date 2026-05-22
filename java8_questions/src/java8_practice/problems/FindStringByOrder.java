package java8_practice.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindStringByOrder {

    public String calculateStringByOrder(String str) {
        return Arrays.stream(str.split("\\s+"))
                .distinct()
                .collect(Collectors.groupingBy(String::length,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toList()))
                .entrySet()
                .stream()
                .skip(1)
                .map(e -> e.getValue().get(0))
                .findFirst()
                .orElse("");
    }


    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        FindStringByOrder obj = new FindStringByOrder();
        System.out.println(obj.calculateStringByOrder(str));
    }
}
