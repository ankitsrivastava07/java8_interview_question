package java8_practice.problems;

import java.util.List;

public class RemoveDuplicateNumbrs {

	public void removeDuplicateNumbrs(List<Integer> numbers) {
		numbers.stream().distinct().forEach(e -> System.out.print(e + " "));
	}
}
