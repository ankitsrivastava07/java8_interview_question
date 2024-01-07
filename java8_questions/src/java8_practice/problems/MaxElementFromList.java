package java8_practice.problems;

import java.util.List;
import java.util.Comparator;

public class MaxElementFromList {

	public void calculateMaxElement(List<Integer> numbers) {
		long startTime = System.currentTimeMillis();
		numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		long endTime = System.currentTimeMillis();
		System.out.println("Exceution Time " + (endTime - startTime));
	}

	public void calculateMaxElementUsingIntStream(List<Integer> numbers) {
		long startTime = System.currentTimeMillis();
		numbers.stream().mapToInt(e -> e).max()
				.ifPresent(e -> System.out.println("Max element using second approach is " + e));
		long endTime = System.currentTimeMillis();
		System.out.println("Exceution Time " + (endTime - startTime));
	}
}
