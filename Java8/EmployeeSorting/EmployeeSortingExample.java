package EmployeeSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingExample {

	public static void main(String[] args) {
		Employee e1 =new Employee("Ram", 28);
		Employee e2 =new Employee("Shyaam", 40);
		Employee e3 =new Employee("Rahim", 20);
		Employee e4 =new Employee("Siddhu", 50);
		
		List<Employee> list =  new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Comparator<Employee> byAge = Comparator.comparing(Employee::getAge);
		list.stream().sorted(byAge).forEach(System.out::println);
		
		/* Program output
		 Employee [name=Rahim, age=20]
		 Employee [name=Ram, age=28]
		 Employee [name=Shyaam, age=40]
		 Employee [name=Siddhu, age=50]
		*/
		
		//list.sort(byAge);
		//list.forEach(System.out::println);
	}

}

class Employee{
	private String name;
	private Integer age;
	
	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}
