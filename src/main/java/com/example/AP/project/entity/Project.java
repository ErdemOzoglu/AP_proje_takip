package com.example.AP.project.entity;

import com.example.AP.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Table(name = "PROJECT_TABLE")
@Getter
@Setter
public class Project extends BaseEntity {

    @Id
    @SequenceGenerator(name = "Project" , sequenceName = "PROJECT_ID_SEQ")
    @GeneratedValue(generator = "Project")
    private Long id;

    @Column(name ="PROJECT_NAME", nullable = false)
    private String projectName;

    @Column(name ="DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "STUDENT1")
    private Long  student1;

    @Column(name = "STUDENT2")
    private Long  student2;

    @Column(name = "TEACHER", nullable = false)
    private Long  teacher;


}
