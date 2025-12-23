package com.example.spring_boot_amigoscode;

import com.example.spring_boot_amigoscode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController

public class SpringBootAmigoscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAmigoscodeApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Claudia",
						"claudia@coding.com",
						LocalDate.of(2000, Month.MARCH, 14),
						25
				)
		);
	}

}
