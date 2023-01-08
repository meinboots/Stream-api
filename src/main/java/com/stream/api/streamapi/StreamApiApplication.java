package com.stream.api.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.transform.Source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StreamApiApplication {


	static List<Employee> employees = new ArrayList<>();

	static{
		employees.add(
			new Employee("Yogesh", "Yadav", 7000.0, List.of("Project-1", "Project-2", "Project-3", "Projecy-4", "Project-5"))
		);

		employees.add(
			new Employee("Sumit", "Singh", 9000.0, List.of("Project-6", "Project-7", "Project-8", "Projecy-9", "Project-0"))
		);

		employees.add(
			new Employee("Kamal", "Khan", 4000.0, List.of("Project-11", "Project-12", "Project-13", "Projecy-14", "Project-15"))
		);

		employees.add(
			new Employee("Garry", "Sandhu", 7000.0, List.of("Project-16", "Project-17", "Project-18", "Projecy-19", "Project-20"))
		);
	}
	

	public static void main(String[] args) {
		//SpringApplication.run(StreamApiApplication.class, args);

		//Foreach
		employees.stream()
					.forEach(employee -> System.out.println(employee));

					System.out.println();
					System.out.println();

		//Map
		//Collect
		//Suppose I want all employees salary increased by 150

		List<Employee> incSalary = employees.stream()
							.map( employee -> new Employee(
								employee.getFirstName(),
								employee.getLastName(),
								employee.getSalary() + 150,
								employee.getProjects()
							)).collect(Collectors.toList());
				
		incSalary.stream()
					.forEach(employee -> System.out.println(employee));

					System.out.println();
					System.out.println();

		//Filter
		List<Employee> filterSalary = 
		employees.stream()
					.filter(employee -> employee.getSalary() > 5000)
					.map( employee -> new Employee(
								employee.getFirstName(),
								employee.getLastName(),
								employee.getSalary() + 150,
								employee.getProjects()
							)).collect(Collectors.toList());

		filterSalary.stream()
						.forEach(employee -> System.out.println(employee));

						System.out.println();
						System.out.println();

	



	}

	// @GetMapping("/")
	// public String sayHello(){
	// 	return "Hello there I am from SpringBoot : (^///^)";
	// }
}
