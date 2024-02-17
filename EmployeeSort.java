import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
 
class EmployeeSort {
 
	public static void main(String[] args) {
 
	    List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(4,"A"));

		empList.add(new Employee(1,"A"));

		empList.add(new Employee(2,"C"));

		empList.add(new Employee(3,"B"));

		empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId))
			.forEach(e->System.out.println(e.getName() + " " + e.getId()));
		
		
	
	}

}
 
 
class Employee {

    int id;

    String name;

	public Employee(int id, String name) {

		super();

		this.id = id;

		this.name = name;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

		@Override

  public String toString() {

    return "Employee{" +

        "id=" + id +

        ", name='" + name + '\'' +

        '}';

	}

}