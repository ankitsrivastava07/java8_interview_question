# Java 8 Stream and Functions Questions
Q) Character Count:- 
Ans:- String word like "test"
str.chars().mapToObj(e-> (char)e).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

Q) Convert Array To Stream
Ans:- Arrays.stream();

Q) String array to Single Word
Ans:- String result = listOfString.stream().collect(Collectors.joining(",", "[", "]"));

Q) Cout of each words String str = "Java 8 has new feature like java code optimizer or concise code";
Ans:- Arrays.stream(str.split("\\s+").collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

Q) Calculate 3rd Employee Highest Salary 
Ans:- emps.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(2).findFirst().orElse(null);

Q) Find Duplicaet Num:- nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());

Q) First Non Repeative character:- nums.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())
.entrySet().filter(e-> e.getValue()==1).findFirst().orElsenull();

Q) Highest Paid Employee:- emps.steam().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(
Comparator.compare(Employee::getSalary))), Optional::get)
)))

Q) Find max element:- nums.stream().max(Integer::compare).orElse(null);

Q) Find Maximum String by order 
   Arrays.stream(str.split("\\s+"))
                .distinct()
                .collect(Collectors.groupingBy(String::length,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toList()))
                .entrySet()
                .stream()
                .skip(1)
                .map(e -> e.getValue().get(0))
                .findFirst()
                .orElse("");

Q) Move zero to right place
int nums[] = {};
int ind = 0;
for(int i=0;i<nums.length;i++)
{
  if(nums[i]!=0)
    nums[ind++]= nums[i];
}
while(ind<nums.length) {
   nums[ind++]=0;
}

Q) Find All employee by department.
Map<String,List<Employee>> result = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment));

Q) Find all 3 three highest number
nums.stream().sorted(Comparator.reverseOrder).limit(3);
