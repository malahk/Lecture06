package ua.org.oracle.academy.malahk;

import java.util.TreeSet;

public class EmployeeMain {
	

	public static void main(String[] args) {
		
		
		
		Employee a = new Employee("Kirill", 28, 500);	
		Employee b = new Employee("Ivan", 35, 600);
		Employee c = new Employee("Kirill", 28, 400);
		Employee d = new Employee("Kirill", 31, 500);
		Employee f = new Employee("Zed", 31, 500);
		

		TreeSet<Employee> employeeSet = new TreeSet<Employee>();

		employeeSet.add(a);
		employeeSet.add(b);

		for (Employee e : employeeSet) {
			System.out.println(e.getName());
		}

		EmployeeComp comp = new EmployeeComp();
		TreeSet<Employee> employeeSet1 = new TreeSet<Employee>(comp);

		employeeSet1.add(a);
		employeeSet1.add(b);
		employeeSet1.add(c);
		employeeSet1.add(d);
		employeeSet1.add(f);

		for (Employee e : employeeSet1) {
			System.out.println(e.toString());
		}

	}

}

