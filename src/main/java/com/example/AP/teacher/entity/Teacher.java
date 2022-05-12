package com.example.AP.teacher.entity;

import com.example.AP.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
@Getter
@Setter
public class Teacher extends BaseEntity {

    @Id
    @SequenceGenerator(name = "Teacher", sequenceName = "TEACHER_ID_SEQ")
    @GeneratedValue(generator = "Teacher")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 40)
    private String name;

    @Column(name = "SURNAME", nullable = false, length = 40)
    private String surname;

    @Column(name = "TEACHER_NUMBER", nullable = false, length = 50, unique = true)
    private String teacherNumber;

    @Column(name = "PASSWORD", nullable = false)
    private String password;
}
