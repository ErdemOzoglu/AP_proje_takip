package com.example.AP.student.service.entityserice;

import com.example.AP.gen.service.BaseEntityService;
import com.example.AP.student.dao.StudentDao;
import com.example.AP.student.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentEntityService extends BaseEntityService<Student, StudentDao> {
    public StudentEntityService(StudentDao dao) {
        super(dao);
    }
}
