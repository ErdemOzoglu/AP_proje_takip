package com.example.AP.prjrequest.entity;

import com.example.AP.gen.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PRJ_REQUEST")
@Getter
@Setter
public class PrjRequest extends BaseEntity {

    @Id
    @SequenceGenerator(name = "PrjRequest" , sequenceName = "PRJ_REQUEST_ID_SEQ")
    @GeneratedValue(generator = "PrjRequest")
    private Long id;

    @Column(name = "STUDENT_ID",nullable = false)
    private Long studentId;

    @Column(name = "TEACHER_ID",nullable = false)
    private Long teacherId;

    @Column(name = "PROJECT_ID",nullable = false)
    private Long projectId;

}
