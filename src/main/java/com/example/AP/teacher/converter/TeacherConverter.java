package com.example.AP.teacher.converter;

import com.example.AP.teacher.entity.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import com.example.AP.teacher.dto.TeacherDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeacherConverter {

    TeacherConverter INSTANCE = Mappers.getMapper(TeacherConverter.class);

    TeacherDto convertToTeacherDto(Teacher teacher);
    Teacher convertToTeacher(TeacherDto teacherDto);
}
