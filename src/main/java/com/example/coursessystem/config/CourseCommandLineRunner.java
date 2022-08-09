package com.example.coursessystem.config;

import com.example.coursessystem.entities.courses.Course;
import com.example.coursessystem.entities.courses.dto.AddCourseDto;
import com.example.coursessystem.entities.mappers.CourseMapper;
import com.example.coursessystem.entities.mappers.CourseMapperImpl;
import com.example.coursessystem.repositories.courses.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.stream.IntStream;

@Configuration
public class CourseCommandLineRunner {
    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository){
       return args -> {
           CourseMapper courseMapper = new CourseMapperImpl();
           IntStream.rangeClosed(1, 10).forEach(i -> {
               AddCourseDto addCourseDto =
                       new AddCourseDto("Course #"+i,
                                        "Learn Course #"+i+" in the best way :)",
                               new BigDecimal(String.valueOf(i * 100)));
               Course course = courseMapper.addCourseDtoToCourse(addCourseDto);
               courseRepository.save(course);
           });
       };
    }
}
