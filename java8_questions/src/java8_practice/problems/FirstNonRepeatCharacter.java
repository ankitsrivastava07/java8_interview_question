package java8_practice.problems;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {

	public void findFirstNonRepeatingCharater(String str) {

		str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).findFirst().ifPresent(e-> System.out.println(e));

	}
}
