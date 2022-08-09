package com.example.coursessystem.repositories.courses;

import com.example.coursessystem.entities.courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
