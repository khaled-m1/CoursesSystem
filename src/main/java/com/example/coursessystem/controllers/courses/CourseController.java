package com.example.coursessystem.controllers.courses;
import com.example.coursessystem.entities.courses.dto.AddCourseDto;
import com.example.coursessystem.entities.courses.dto.CourseDto;
import com.example.coursessystem.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/courses")
public class CourseController {
    private final CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("")
    public ResponseEntity<List<CourseDto>> getCourses(){
        return this.courseService.findAll();
    }
    @GetMapping(path = "/{courseId}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable Long courseId){
        return this.courseService.findById(courseId);
    }
    @PostMapping()
    public ResponseEntity<CourseDto> createCourse(@RequestBody AddCourseDto addCourseDto){
        return this.courseService.create(addCourseDto);
    }
    @PutMapping(path = "/{courseId}")
    public ResponseEntity<CourseDto> updateCourse(@PathVariable Long courseId,
                                                 @RequestBody AddCourseDto addCourseDto){
        return this.courseService.update(courseId, addCourseDto);
    }
    @DeleteMapping(path = "/{courseId}")
    public ResponseEntity<String> removeCourse(@PathVariable Long courseId){
        return this.courseService.remove(courseId);
    }
}
