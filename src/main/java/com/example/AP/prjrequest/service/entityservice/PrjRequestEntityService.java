package com.example.AP.prjrequest.service.entityservice;

import com.example.AP.gen.service.BaseEntityService;
import com.example.AP.prjrequest.dao.PrjRequestDao;
import com.example.AP.prjrequest.entity.PrjRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrjRequestEntityService extends BaseEntityService<PrjRequest, PrjRequestDao> {
    public PrjRequestEntityService(PrjRequestDao dao) {
        super(dao);
    }

    public List<PrjRequest> findAllByTeacherId(Long teacherId){
        return getDao().findAllByTeacherId(teacherId);
    }
}
