package com.pichincha.dm.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pichincha.dm.repository.impl.ProjectRepository;
import com.pichincha.dm.service.ProjectService;
import com.pichincha.dm.service.mapper.ProjectMapper;
import com.pichincha.services.server.models.ProjectDTO;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<ProjectDTO> findAll(){
        return projectRepository.findAll().stream().map(projectMapper::toProjectDTO).collect(Collectors.toList());
    }

    @Override
    public List<ProjectDTO> findByName(String projectName) {
        return projectRepository.findByName(projectName).stream().map(projectMapper::toProjectDTO).collect(Collectors.toList());
    }
    
    @Override
    public List<ProjectDTO> findByCelulaId(int idCelula) {
        return projectRepository.findByCelulaId(idCelula).stream().map(projectMapper::toProjectDTO).collect(Collectors.toList());
    }

    @Override
    public List<ProjectDTO> findByTribuId(int idTribu) {
        return projectRepository.findByTribuId(idTribu).stream().map(projectMapper::toProjectDTO).collect(Collectors.toList());
    }
}