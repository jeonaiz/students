package kg.megacom.students.controllers;


import kg.megacom.students.models.Course;
import kg.megacom.students.repositories.CourseRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseRepo courseRepo;

    public CourseController(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }
    @PostMapping("/add")
    public Object createCourse(@RequestBody Course course){
        return courseRepo.save(course);
    }
}
