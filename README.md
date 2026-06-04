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

Q) How do we increase JVM memory in Java ?
Ans:- To increase memory in the JVM you configure it using command line options when starting your Java applications.
These option control heap size and stack size and other memory regions.
----------------------------
1.) Heap Size
Initial Heap Size:- -Xms
Maximum Heap Size:- -Xmx
java -Xms512m -Xmx1024m MyApp
2.) Stack Size
controls memory per thread 
Options:- -Xss
java -Xss1m MyApp

Q) Find List of employees by department name
emps.stream().collect(Collectors.groupingBy(Employee::getDept))

Q) What is Class Loader in Java ?
Ans:- Class loader is the internal part of Java Runtime Enviromennt(JRE) that dynamically loads Java Classes into the JVM.

Q) What is Double check in Single Ton class ?
Ans:- Double check locking is a design pattern used to optimized thread-safe Lazy initialization in a Single Ton class. It reduces overhead by checking the initiliazation flag twice.

public class SingleTon {

private static volatile SingleTon singleTon;

private SingleTon() {}

public static SingleTon getInstance() {
if(instance == null)
{
 syncronized(SingleTon.class) {
 if(instance == null) {
   instance = new Instance();
 }
 }
}
}

}
