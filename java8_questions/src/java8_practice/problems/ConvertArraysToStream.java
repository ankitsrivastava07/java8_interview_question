package java8_practice.problems;

import java.util.Arrays;

public class ConvertArraysToStream {

	public void convertArraysTOStream(int ars[]) {
		Arrays.stream(ars).forEach(e -> System.out.println(e));
	}
}
