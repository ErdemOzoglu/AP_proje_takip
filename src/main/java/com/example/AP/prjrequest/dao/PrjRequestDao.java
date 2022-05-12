package com.example.AP.prjrequest.dao;

import com.example.AP.prjrequest.entity.PrjRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrjRequestDao extends JpaRepository<PrjRequest, Long> {

    List<PrjRequest> findAllByTeacherId(Long  teacherId);

}
