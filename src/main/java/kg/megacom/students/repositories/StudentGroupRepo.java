package kg.megacom.students.repositories;

import kg.megacom.students.models.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGroupRepo extends JpaRepository<StudentGroup,Long> {
}
