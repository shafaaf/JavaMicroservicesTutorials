package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student student1 = new Student("Bob", "bob@mail.com", LocalDate.of(1994, Month.JANUARY, 5));
            Student student2 = new Student("Mariam", "mariam@mail.com", LocalDate.of(1990, Month.JULY, 1));
            studentRepository.saveAll(List.of(student1, student2));
        };
    }
}
