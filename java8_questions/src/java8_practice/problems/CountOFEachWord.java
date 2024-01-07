package java8_practice.problems;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountOFEachWord {

	public void calculateCountOfEachWord() {
		String str = "Java 8 has new feature like java code optimizer or concise code";

		System.out.print(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(word -> word,
				() -> new TreeMap<>(String.CASE_INSENSITIVE_ORDER), Collectors.counting())));
	}
}
