package java8_practice.problems;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {

	public void calculateSumOfElements(List<Integer> numbers) {
		int sum = numbers.stream().collect(Collectors.summingInt(e -> e));
		System.out.println("Sum of Elements " + sum);
	}
}
