package com.example.AP.project.service.entityservice;

import com.example.AP.gen.service.BaseEntityService;
import com.example.AP.project.dao.ProjectDao;
import com.example.AP.project.entity.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectEntityService extends BaseEntityService< Project, ProjectDao> {
    public ProjectEntityService(ProjectDao dao) {
        super(dao);
    }
}
