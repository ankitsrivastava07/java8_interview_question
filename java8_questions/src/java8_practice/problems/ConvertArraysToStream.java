package java8_practice.problems;

import java.util.Arrays;

public class ConvertArraysToStream {

	public void convertArraysTOStream(int ars[]) {
		Stream<Integer> stream = Arrays.stream(ars);
		Integer arrsLength = stream.count();

		
		System.out.println(arrsLength);
	}
}
