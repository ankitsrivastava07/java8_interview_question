package java8_practice.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementProblem {

    public List<Integer> findAllDuplicateElements(List<Integer> nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        return nums
                .stream()
                .filter(e -> !uniqueNumbers.add(e))
                .distinct()
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        DuplicateElementProblem duplicateElementProblem = new DuplicateElementProblem();
        duplicateElementProblem.findAllDuplicateElements(nums);
    }

}
