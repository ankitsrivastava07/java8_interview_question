package java8_practice.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8_practice.problems.dto.Employee;

public class SumOfSalaryByDept {

	public void sumOfSalaryByDept(List<Employee> emps) {
		Map<String, Double> result = emps.stream()
				.collect(Collectors.groupingBy(e -> e.getDept(), Collectors.summingDouble(e -> e.getSalary())));
		System.out.println("Sum of Salary for each department is " + result);
	}
}
