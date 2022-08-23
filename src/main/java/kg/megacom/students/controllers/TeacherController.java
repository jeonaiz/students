package kg.megacom.students.controllers;

import kg.megacom.students.models.Teacher;
import kg.megacom.students.services.TeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @PostMapping("/add")
    public  Object createTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

}
