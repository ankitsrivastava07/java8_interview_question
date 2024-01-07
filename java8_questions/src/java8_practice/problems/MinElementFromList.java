package java8_practice.problems;

import java.util.List;

public class MinElementFromList {

	public void findMinElementFromList(List<Integer> numbers) {
		numbers.stream().mapToInt(e -> e).min().ifPresent(e -> System.out.println(e));
	}
}
