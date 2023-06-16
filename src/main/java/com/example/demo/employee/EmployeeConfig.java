package com.example.demo.employee;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository repository) {
		return args -> {
			Employee monika = new Employee("Monika L.", 10L, 5L, "Developer", 1500.00);
			Employee povilas = new Employee("Povilas K.", 20L, 4L, "Developer", 1200.00);
			Employee simona = new Employee("Simona G.", 30L, 7L, "Developer", 2000.00);
			Employee kristijonas = new Employee("Kristijonas P.", 30L, 7L, "Developer", 2000.00);

			repository.saveAll(List.of(monika, povilas, simona, kristijonas));
		};
	}
}
