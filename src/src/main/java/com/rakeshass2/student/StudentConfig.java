package com.rakeshass2.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                   Student Rakesh= new Student(
                            "Rakesh",
                            "narapareddyrakesh13@gmail.com",

                            LocalDate.of(2001, FEBRUARY,13));
          Student Niharika=  new Student(
                    "Niharika",
                    "niharikan@gmail.com",

                    LocalDate.of(1998, JUNE,10));
            repository.saveAll(List.of(Rakesh,Niharika));

        };
    };
}
