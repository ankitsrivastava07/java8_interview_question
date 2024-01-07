package java8_practice.problems;

import java.util.stream.IntStream;

public class SumOfNaturalNumber {

	public void calculateSumOfNaturalNumbers(int start, int range) {
		int sum = IntStream.rangeClosed(start, range).sum();
		System.out.println("Sum of Natural number is " + sum);
	}

}
