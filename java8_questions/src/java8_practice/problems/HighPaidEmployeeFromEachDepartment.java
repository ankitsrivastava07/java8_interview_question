package java8_practice.problems;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Collectors;

import java8_practice.problems.dto.Employee;

public class HighPaidEmployeeFromEachDepartment {

	public void findHighPaidEmpFromEachDept(List<Employee> emps) {
		Map<String,Employee> result = emps.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparing(e -> e.getSalary())), Optional::get)));
		System.out.println("Employee with high paid in each departmehnt " + result);
	}
}
