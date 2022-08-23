package kg.megacom.students.services;

import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.StudentDto;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<StudentDto> findAll();

    Student update(Long id, String title);

    void delete(long id);
}
