package java8_practice.problems;

import java.util.List;

public class FirstElementFromList {

	public void findFirstElementFromList(List<Integer> numbers) {

		numbers.stream().findFirst().ifPresent(e -> System.out.print(e));
	}
}
