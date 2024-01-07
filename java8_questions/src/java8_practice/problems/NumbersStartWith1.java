package java8_practice.problems;

import java.util.List;

public class NumbersStartWith1 {

	public void getAllNumbersStartWith1(List<Integer> numbers) {

		numbers.stream()
		.map(e -> e + "")
		.filter(e -> e.startsWith("1"))
		.forEach(e -> System.out.print(e + " "));
	}
}
