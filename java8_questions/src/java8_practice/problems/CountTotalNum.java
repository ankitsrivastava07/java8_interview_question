package java8_practice.problems;

import java.util.List;

public class CountTotalNum {

	public long countTotalNumber(List<Integer> numbers) {
		return numbers.stream().count();
	}

}
