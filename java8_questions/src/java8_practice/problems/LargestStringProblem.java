package java8_practice.problems;

import java.util.Arrays;
import java.util.Comparator;

public class LargestStringProblem {

    public static String findOrderLargestLengthString(String str, final int order) {
        String[] words = str.split("\\s+");
        return Arrays
                .stream(words)
                .sorted(Comparator
                        .comparingInt(String::length)
                        .reversed())
                .skip(order)
                .findFirst()
                .orElse("");
    }

    public static void main(String[] args) {
        String str = "I am Ankit Srivastava";
        String result = findOrderLargestLengthString(str, 3);
        System.out.println(result);
    }
}
