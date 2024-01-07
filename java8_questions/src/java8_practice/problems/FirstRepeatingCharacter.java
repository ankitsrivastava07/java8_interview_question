package java8_practice.problems;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstRepeatingCharacter {

	public void findFirstRepeatingCharater(String str) {
		str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).findFirst().ifPresent(e -> System.out.println(e));
	}
}
