package com.example.EmployeeExamProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.ExampleSpringandRest.Employee;
import com.example.ExampleSpringandRest.EmployeeRepository;
import com.example.ExampleSpringandRest.ExampleSpringandRestApplication;


@SpringBootApplication
public class EmployeeExamProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringandRestApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	public void run(String... args) throws Exception {

		Employee employee1 = new Employee();
				employee1.setFirstName("Sakshi");
				employee1.setLastName("Dongre");
				employee1.setEmail("sakshi@gmail.com");
				

		Employee employee2 = new Employee();
				employee2.setFirstName("Kanchan");
		employee2.setLastName("Lonarkar");
		employee2.setEmail("Kanchan@gmail.com");

	

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		
	}
}

