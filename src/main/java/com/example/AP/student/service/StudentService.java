package com.example.AP.student.service;

import com.example.AP.student.converter.StudentConverter;
import com.example.AP.student.dto.StudentDto;
import com.example.AP.student.entity.Student;
import com.example.AP.student.service.entityserice.StudentEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {


    private final StudentEntityService studentEntityService;
    // private final PasswordEncoder passwordEncoder;

    public StudentDto save(StudentDto studentDto){

        Student student = StudentConverter.INSTANCE.convertToStudent(studentDto);

        //  String password = passwordEncoder.encode(student.getPassword());
        //  student.setPassword(password);

        student = studentEntityService.save(student);

        studentDto = StudentConverter.INSTANCE.convertToStudentDto(student);

        return studentDto;
    }


    public void delete(Long id) {

        Student student = studentEntityService.getByIdWithControl(id);

        studentEntityService.delete(student);
    }
}
