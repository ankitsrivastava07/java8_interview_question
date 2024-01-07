package java8_practice.problems;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java8_practice.problems.dto.Employee;

public class GroupEmp {

	public void groupEmpByDept(List<Employee> emps) {
		Map<String, List<Employee>> result = emps.stream()
				.collect(Collectors.groupingBy(e -> e.getDept(), Collectors.toList()));
		System.out.println(result);
	}
}
