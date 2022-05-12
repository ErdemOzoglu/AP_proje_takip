package com.example.AP.student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {

    private String name;
    private String surname;
    private String schoolNumber;
    private String password;
}
