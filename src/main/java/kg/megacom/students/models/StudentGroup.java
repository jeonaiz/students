package kg.megacom.students.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "studentGroup")
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date startDate;
    Date endDate;
    @ManyToOne
    @JoinColumn(name = "group_id")
    Group group;
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;
}
