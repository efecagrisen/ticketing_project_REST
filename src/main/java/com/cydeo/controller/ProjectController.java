package com.cydeo.controller;

import com.cydeo.dto.ResponseWrapper;
import com.cydeo.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/project")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    public ResponseEntity<ResponseWrapper> getProjects(){};

    public ResponseEntity<ResponseWrapper> getProjectByCode(){};

    public ResponseEntity<ResponseWrapper> createProject(){};

    public ResponseEntity<ResponseWrapper> updateProject(){};

    public ResponseEntity<ResponseWrapper> deleteProject(){};

    public ResponseEntity<ResponseWrapper> getProjectByManager(){};

    public ResponseEntity<ResponseWrapper> managerCompleteProject(){};








}
