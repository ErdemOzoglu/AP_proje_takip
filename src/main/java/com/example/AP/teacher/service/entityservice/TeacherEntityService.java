package com.example.AP.teacher.service.entityservice;

import com.example.AP.gen.service.BaseEntityService;
import com.example.AP.teacher.dao.TeacherDao;
import com.example.AP.teacher.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public class TeacherEntityService extends BaseEntityService<Teacher, TeacherDao> {
    public TeacherEntityService(TeacherDao dao) {
        super(dao);
    }
}
