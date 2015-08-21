package ua.org.oracle.academy.malahk;

import java.util.Comparator;

public class EmployeeComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int result = 0;
		if (o1.getAge() > o2.getAge()) {
			result = 1;
		}
		if (o1.getAge() < o2.getAge()) {
			result = -1;
		}
		if (o1.getAge() == o2.getAge()) {
			if (o1.getSalary() > o2.getSalary()) {
				result = 1;
			}
			if (o1.getSalary() < o2.getSalary()) {
				result = -1;
			}
			if (o1.getSalary() == o2.getSalary()) {
				result = ((o1.getName()).compareTo(o2.getName()));
			}
		}

		
		return result;
	}

}
