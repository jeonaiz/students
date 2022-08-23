package kg.megacom.students.services.impl;

import kg.megacom.students.models.Group;
import kg.megacom.students.repositories.GroupRepo;
import kg.megacom.students.services.GroupService;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepo groupRepo;

    public  GroupServiceImpl(GroupRepo groupRepo) {
        this.groupRepo = groupRepo;
    }

    @Override
    public Group createCroup(Group group) {
        return groupRepo.save(group);
    }

//    @Override
//    public Group createGroup(Group group) {
//        return ;
//    }
}

