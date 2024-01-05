package com.pichincha.dm.service.mapper;

import com.pichincha.dm.domain.view.ProjectVO;
import com.pichincha.services.server.models.ProjectDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectMapper {
    ProjectDTO toProjectDTO(ProjectVO projectVO);
    ProjectVO toProjectVO(ProjectDTO projectDTO);
}
