package com.pichincha.dm.service;

import java.util.List;

import com.pichincha.services.server.models.ProjectDTO;

public interface ProjectService {

    List<ProjectDTO> findAll();

    List<ProjectDTO> findByCelulaId(int idCelula);

    List<ProjectDTO> findByName(String projectName);

    List<ProjectDTO> findByTribuId(int idTribu);

}
