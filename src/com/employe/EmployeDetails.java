package com.employe;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeDetails {

	String empName;

	static LocalDate date1 = LocalDate.now();

	public static void listEmployesLastYear(List<Employee> employees) {

		for (Employee employee : employees) {

			if (employee.getDateOfJoining().isAfter(date1.minusDays(365))) {
				System.out.println(employee);
				System.out.println();
			}
		}

	}

	public static void getHighestSalary(Set<Entry<String, List<Employee>>> set) {

		for (Entry<String, List<Employee>> entries : set) {

			List<Employee> employees = entries.getValue();

			Employee employee2 = null;
			for (Employee employee1 : employees) {
				int i = 0;

				if (employee1.getSalary() > i) {
					i = employee1.getSalary();
					employee2 = employee1;
				}
			}
			System.out.println("Department: " + employee2.getDept() + ", " + "Name: " + employee2.getFirstName() + ", "
					+ "Salary: " + employee2.getSalary());
			employee2 = null;

		}

	}

	public static void listDepartment(List<Employee> employees) {

	}

	public static void listReportees(List<Employee> employees) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the employee name to show his reportee : ");
		String empName = scanner.nextLine();
		System.out.println();
		System.out.println("Reportees are : ");

		for (Employee employee : employees) {

			if (employee.getFirstName().equals(empName)) {

				for (Employee employee1 : employees) {

					if (employee1.getManagerId() == employee.getId()) {

						System.out.println("\n" + employee1.getFirstName());
					}

				}
			}

		}
		System.out.println();

	}

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(1, "Karthik", "Sekar", LocalDate.of(2020, 06, 25), "Tech Support", "Trainee", false,
				3, 25000));
		employees.add(new Employee(2, "Palam", "Ramaswamy", LocalDate.of(2019, 11, 14), "Tech Support", "Trainee",
				false, 3, 50000));
		employees.add(
				new Employee(3, "Boomi", "Murthi", LocalDate.of(2018, 02, 18), "Networking", "Team Leader", true, 0, 35000));

		listEmployesLastYear(employees);

		Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();

		for (Employee department : employees) {
			String key = department.getDept();
			if (map.containsKey(key)) {
				List<Employee> list = map.get(key);
				list.add(department);

			} else {
				List<Employee> list = new ArrayList<Employee>();
				list.add(department);
				map.put(key, list);
			}

		}

		map.forEach((k, v) -> System.out.println("Department : " + k + " " + v));

		System.out.println();
		
		getHighestSalary(map.entrySet());
		
		System.out.println();

		listReportees(employees);

	}
}
