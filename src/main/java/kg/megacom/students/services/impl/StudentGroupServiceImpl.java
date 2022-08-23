package kg.megacom.students.services.impl;

import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.repositories.StudentGroupRepo;
import kg.megacom.students.services.StudentGroupService;
import org.springframework.stereotype.Service;

@Service
public class  StudentGroupServiceImpl implements StudentGroupService {
    private final StudentGroupRepo studentGroupRepo;

    public StudentGroupServiceImpl(StudentGroupRepo studentGroupRepo) {
        this.studentGroupRepo = studentGroupRepo;
    }

    @Override
    public StudentGroup createStudentGroup(StudentGroup studentGroup) {
        return studentGroupRepo.save(studentGroup);
    }
}
