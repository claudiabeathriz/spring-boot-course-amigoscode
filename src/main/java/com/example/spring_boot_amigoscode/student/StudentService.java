package com.example.spring_boot_amigoscode.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
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
