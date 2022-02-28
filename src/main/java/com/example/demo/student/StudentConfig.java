package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->  {
           Student sang = new Student(
                    1L,
                    "Sang",
                    "sang@gmail.com",
                    LocalDate.of(1999, SEPTEMBER, 9)
            );
            Student trong = new Student(
                    "Trong",
                    "trong@gmail.com",
                    LocalDate.of(2002, FEBRUARY, 12)
            );
            repository.saveAll(List.of(sang, trong));
        };
    }

}
