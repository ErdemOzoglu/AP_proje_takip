package com.example.AP.teacher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherDto {

    private String name;
    private String surname;
    private String teacherNumber;
    private String password;
}
