package com.example.AP.teacher.service;

import com.example.AP.teacher.dto.TeacherDto;
import com.example.AP.teacher.converter.TeacherConverter;
import com.example.AP.teacher.entity.Teacher;
import com.example.AP.teacher.service.entityservice.TeacherEntityService;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherEntityService teacherEntityService;
   // private final PasswordEncoder passwordEncoder;

    public TeacherDto save(TeacherDto teacherDto){

        Teacher teacher = TeacherConverter.INSTANCE.convertToTeacher(teacherDto);

      //  String password = passwordEncoder.encode(teacher.getPassword());

      //  teacher.setPassword(password);

        teacher = teacherEntityService.save(teacher);

        teacherDto = TeacherConverter.INSTANCE.convertToTeacherDto(teacher);

        return teacherDto;
    }


    public void delete(Long id) {

        Teacher teacher = teacherEntityService.getByIdWithControl(id);

        teacherEntityService.delete(teacher);
    }



}
