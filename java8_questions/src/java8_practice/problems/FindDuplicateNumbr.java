package java8_practice.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbr {

	public void findDuplicateNumbrs(List<Integer> numbers) {

		long startTime = System.currentTimeMillis();
		numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(entrySet -> entrySet.getValue() > 1).map(e -> e.getKey());
		// .forEach(e -> System.out.print(" "));
		long endTime = System.currentTimeMillis();

		System.out.println("Execution Time taken " + (endTime - startTime));
	}

	public void findDuplicateNumbersSecondApproach(List<Integer> numbers) {
		long startTime = System.currentTimeMillis();

		Set<Integer> collectDupElements = new HashSet<>();
		numbers.stream().filter(e -> !collectDupElements.add(e))
		 .forEach(e -> System.out.print(e + " "));

		long endTime = System.currentTimeMillis();

		System.out.println("Execution Time taken for second approach " + (endTime - startTime));
	}
}
