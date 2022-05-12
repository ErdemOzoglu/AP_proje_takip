package com.example.AP.student.entity;

import com.example.AP.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
@Getter
@Setter
public class Student extends BaseEntity {

    @Id
    @SequenceGenerator(name = "Student", sequenceName = "STUDENT_ID_SEQ")
    @GeneratedValue(generator = "Student")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 40)
    private String name;

    @Column(name = "SURNAME", nullable = false, length = 40)
    private String surname;

    @Column(name = "SCHOOL_NUMBER", nullable = false, length = 50, unique = true)
    private String schoolNumber;

    @Column(name = "PASSWORD", nullable = false)
    private String password;
}
