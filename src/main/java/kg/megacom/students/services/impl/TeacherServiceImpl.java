package kg.megacom.students.services.impl;

import kg.megacom.students.models.Teacher;
import kg.megacom.students.repositories.TeacherRepo;
import kg.megacom.students.services.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepo teacherRepo;

    public  TeacherServiceImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }
}

