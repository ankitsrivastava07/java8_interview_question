package java8_practice.problems;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringArrayToSingleStringVariable {

	public void convertStringArrayToSingleStringVariable(List<String> listOfString) {
		String result = listOfString.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
	}
}
