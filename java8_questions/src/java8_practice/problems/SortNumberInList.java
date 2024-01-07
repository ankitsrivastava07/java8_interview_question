package java8_practice.problems;

import java.util.Comparator;
import java.util.List;

public class SortNumberInList {

	public void sortNumberInList(List<Integer> numbers) {

		numbers.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e));
	}
}
