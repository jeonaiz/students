package kg.megacom.students.controllers;

import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.StudentDto;
import kg.megacom.students.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){ return studentService.createStudent(student);}

    @GetMapping("/findAll")
    public List<StudentDto> findAll(){return studentService.findAll();}

    @PutMapping("/update")
    public Student updateStudent(@RequestParam Long id, @RequestParam String title){
        return studentService.update(id, title);
    }

    @DeleteMapping ("/delete")
    void delete(@RequestParam Long id){
        studentService.delete(id);
    }

}