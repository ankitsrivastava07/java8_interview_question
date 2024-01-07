package java8_practice.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ConvertListOfObjectTOMAP {

	public void convertListOfObjectTOMAPUsingGroupBy() {

		List<Notes> noteLst = new ArrayList<>();
		noteLst.add(new Notes(1, "note1", 11));
		noteLst.add(new Notes(2, "note2", 22));
		noteLst.add(new Notes(3, "note3", 33));
		noteLst.add(new Notes(4, "note4", 44));
		noteLst.add(new Notes(4, "note5", 55));
		noteLst.add(new Notes(6, "note4", 66));
		Map<Integer, List<Notes>> result = noteLst.stream()
				.collect(Collectors.groupingBy(e -> e.getId(), Collectors.toList()));
		System.out.println(result);
	}
}
