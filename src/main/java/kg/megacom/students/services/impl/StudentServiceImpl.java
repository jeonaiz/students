package kg.megacom.students.services.impl;

import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.StudentDto;
import kg.megacom.students.repositories.StudentRepo;
import kg.megacom.students.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;

    public  StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @Override
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student update (Long id, String title){
        studentRepo.update(id, title);
        return studentRepo.findById(id).get();
    }

    @Override
    public void delete(long id) {
        studentRepo.delete(studentRepo.findById(id).get());
    }

    @Override
    public List<StudentDto> findAll() {
        return null;
    }

}

