package com.example.coursessystem.entities.mappers;

import com.example.coursessystem.entities.courses.Course;
import com.example.coursessystem.entities.courses.dto.AddCourseDto;
import com.example.coursessystem.entities.courses.dto.CourseDto;

public interface CourseMapper {

  Course addCourseDtoToCourse(AddCourseDto addCourseDto);
  CourseDto courseToCourseDto(Course course);
}
