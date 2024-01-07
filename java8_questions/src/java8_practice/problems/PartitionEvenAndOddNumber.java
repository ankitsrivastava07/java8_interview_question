package java8_practice.problems;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionEvenAndOddNumber {

	public void partitionEvenAndOddNumber(List<Integer> numbers) {
		Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println("Partitioning of even and odd number " + result);
	}

	public void partitionEvenAndOddNumberSecondApproach(List<Integer> numbers) {
		Map<String, List<Integer>> result = numbers.stream()
				.collect(Collectors.groupingBy(e -> e % 2 == 0 ? "Even No" : "Odd Number", Collectors.toList()));
		System.out.println("Partittioning of even and odd numbers " + result);
	}
}
