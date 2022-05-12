package com.example.AP.student.converter;

import com.example.AP.student.dto.StudentDto;
import com.example.AP.student.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface StudentConverter {

    StudentConverter INSTANCE = Mappers.getMapper(StudentConverter.class);

    Student convertToStudent(StudentDto studentDto);
    StudentDto convertToStudentDto(Student student);

}
