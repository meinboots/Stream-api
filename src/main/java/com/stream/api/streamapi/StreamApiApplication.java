package com.stream.api.streamapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StreamApiApplication {


	static List<Employee> employees = new ArrayList<>();

	static{
		employees.add(
			"Yogesh", "Yadav", 7000.0, List<E>.of("Project-1", "Project-2", "Project-3", "Projecy-4", "Project-5")
		);

		employees.add(
			"Sumit", "Singh", 9000.0, List<E>.of("Project-6", "Project-7", "Project-8", "Projecy-9", "Project-0")
		);

		employees.add(
			"Kamal", "Khan", 4000.0, List<E>.of("Project-11", "Project-12", "Project-13", "Projecy-14", "Project-15")
		);

		employees.add(
			"Garry", "Sandhu", 7000.0, List<E>.of("Project-16", "Project-17", "Project-18", "Projecy-19", "Project-20")
		);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(StreamApiApplication.class, args);
	}

	@GetMapping("/")
	public String sayHello(){
		return "Hello there I am from SpringBoot : (^///^)";
	}
}
