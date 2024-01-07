package java8_practice;

import java.util.List;
import java.util.Arrays;

import java8_practice.problems.ConvertListOfObjectTOMAP;
import java8_practice.problems.ConvertStringArrayToSingleStringVariable;
import java8_practice.problems.CountOFEachWord;
import java8_practice.problems.CountTotalNum;
import java8_practice.problems.FirstElementFromList;
import java8_practice.problems.FirstNonRepeatCharacter;
import java8_practice.problems.FirstRepeatingCharacter;
import java8_practice.problems.GroupEmp;
import java8_practice.problems.HighPaidEmployeeFromEachDepartment;
import java8_practice.problems.MaxElementFromList;
import java8_practice.problems.MinElementFromList;
import java8_practice.problems.PartitionEvenAndOddNumber;
import java8_practice.problems.SortNumberInList;
import java8_practice.problems.SumOfElements;
import java8_practice.problems.SumOfNaturalNumber;
import java8_practice.problems.SumOfSalaryByDept;
import java8_practice.problems.dto.Employee;

public class MainApp {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15);
		long count = new CountTotalNum().countTotalNumber(numbers);
		System.out.println("Count Total Number of element in List " + count);

		// Remove Duplicate Numbers from List
		// new RemoveDuplicateNumbrs().removeDuplicateNumbrs(Arrays.asList(10, 15, 8,
		// 49, 25, 98, 98, 32, 15));

		// Find List of All Numbers starting with 1
		// new NumbersStartWith1().getAllNumbersStartWith1(Arrays.asList(10, 15, 8, 49,
		// 25, 98, 32));

		// Find all Duplicate Elements
		// new FindDuplicateNumbr().findDuplicateNumbrs(Arrays.asList(10, 15, 8, 49, 25,
		// 98, 98, 32, 15));

		// Find all Duplicate Elements Second Approach
		// new FindDuplicateNumbr().findDuplicateNumbrsSecondApproach(Arrays.asList(10,
		// 15, 8, 49, 25, 98, 98, 32, 15));

		// Find First Element From List
		// new FirstElementFromList().findFirstElementFromList(Arrays.asList());

		// Sum Of Element of List
		// new SumOfElements().calculateSumOfElements(Arrays.asList(10, 15, 8, 49, 25,
		// 98, 32));

		// FInd Max Element From List
		// new MaxElementFromList().calculateMaxElement(Arrays.asList(10, 15, 8, 49, 25,
		// 98, 98, 32, 15, 10, 15, 8, 49, 25, 98, 98, 32, 15,10, 15, 8, 49, 25, 98, 98,
		// 32, 15));

		// Find Max Element From List Second approach
		// new MaxElementFromList().calculateMaxElementSummaryStatics(Arrays.asList(10,
		// 15, 8, 49, 25, 98, 98, 32, 15, 10, 15, 8, 49, 25, 98, 98, 32, 15,10, 15, 8,
		// 49, 25, 98, 98, 32, 15));

		// Find First Non Repeating Character
		String str = "gtabcesed";
		// new FirstNonRepeatCharacter().findFirstNonRepeatingCharater(str);

		// Find First Repeating charater
		// new FirstRepeatingCharacter().findFirstRepeatingCharater(str);

		// Sort Arrays element in java
		// new SortNumberInList().sortNumberInList(Arrays.asList(10, 15, 8, 49, 25, 98,
		// 98, 32, 15));

		// Convert List Of Object to Map
		// new ConvertListOfObjectTOMAP().convertListOfObjectTOMAPUsingGroupBy();

		// Print Count of each word
		// new CountOFEachWord().calculateCountOfEachWord();

		// Sum of Natural Numbers
		// int start = 1 , range = 6;
		// new SumOfNaturalNumber().calculateSumOfNaturalNumbers(start, range);

		// Convert String array to Single String variable value
		// new
		// ConvertStringArrayToSingleStringVariable().convertStringArrayToSingleStringVariable(
		// Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note
		// Book", "Pencil"));

		// new FirstNonRepeatCharacter().findFirstNonRepeatingCharater(str);

		// Group Employee By Department
		List<Employee> emps = Arrays.asList(new Employee("Ankit", "IT", 88000.98), new Employee("Deepak", "QA", 25000),
				new Employee("Deepanshu", "IT", 67500), new Employee("Deepak", "QA", 28000),
				new Employee("Subham", "Data Analyst", 85000.87), new Employee("Amit", "Data Analyst", 125000.25));
		// new GroupEmp().groupEmpByDept(emps);

		// Find Highest Paid Employee From each Department
        // new HighPaidEmployeeFromEachDepartment().findHighPaidEmpFromEachDept(emps);

		// Sum of Salary of each department
		// new SumOfSalaryByDept().sumOfSalaryByDept(emps);
		// new FirstRepeatingCharacter().findFirstRepeatingCharater(str);
		
		new PartitionEvenAndOddNumber().partitionEvenAndOddNumber(numbers);
		new PartitionEvenAndOddNumber().partitionEvenAndOddNumberSecondApproach(numbers);

	}

}
