package com.pichincha.dm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.dm.service.ProjectService;
import com.pichincha.services.server.RepositoryApi;
import com.pichincha.services.server.models.ProjectDTO;

@RestController
@CrossOrigin
public class RepositroryController implements RepositoryApi {

    @Autowired
    private ProjectService projectService;

    @Override
    public ResponseEntity<List<ProjectDTO>> getProjects() {
        return ResponseEntity.ok(projectService.findAll());
    }
    
    @Override
    public ResponseEntity<List<ProjectDTO>> getProjectByName(String repoName) {
        return ResponseEntity.ok(projectService.findByName(repoName));
    }

    @Override
    public ResponseEntity<List<ProjectDTO>> getProjectByCelulaId(Integer celulaId) {
        return ResponseEntity.ok(projectService.findByCelulaId(celulaId));
    }

    @Override
    public ResponseEntity<List<ProjectDTO>> getProjectByTribuId(Integer tribuId) {
        return ResponseEntity.ok(projectService.findByTribuId(tribuId));
    }
}