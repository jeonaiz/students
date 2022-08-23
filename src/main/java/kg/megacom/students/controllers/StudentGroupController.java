package kg.megacom.students.controllers;

import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.services.StudentGroupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentGroups")
public class StudentGroupController {
    private final StudentGroupService studentGroupService;


    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }
    @PostMapping("/add")
    public  Object createStudentGroups(@RequestBody StudentGroup studentGroup){
        return  studentGroupService.createStudentGroup(studentGroup);
    }
}
