package kg.megacom.students.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentGroupDto {
    Long id;
    Date startDate;
    Date endDate;
    GroupDto group;
    StudentDto student;
}
