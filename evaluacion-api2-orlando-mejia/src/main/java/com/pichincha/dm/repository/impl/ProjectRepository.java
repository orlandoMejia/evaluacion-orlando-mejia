package com.pichincha.dm.repository.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pichincha.dm.domain.view.ProjectVO;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectVO, Long> {
        @Query(value = "SELECT  id_project " +
                        ",celula_id  " +
                        ",celula.celula_name_product " +
                        ",celula.celula_name_squad " +
                        ",tribu.id As tribu_id" +
                        ",tribu.tribu_name " +
                        ",\"KEY\"  As key_project" +
                        ",\"NAME\" As name " +
                        ",code " +
                        ",prefix " +
                        ",stf_project.state As state" +
                        ",stf_project.user_audit " +
                        "FROM public.stf_project " +
                        "INNER JOIN celula " +
                        "On celula.id = stf_project.celula_id " +
                        "INNER JOIN tribu " +
                        "ON celula.tribu_id = tribu.id", nativeQuery = true)
        public List<ProjectVO> findAll();

        @Query(value = "SELECT  id_project " +
		        		",celula_id  " +
		                ",celula.celula_name_product " +
		                ",celula.celula_name_squad " +
		                ",tribu.id As tribu_id" +
		                ",tribu.tribu_name " +
		                ",\"KEY\"  As key_project" +
		                ",\"NAME\" As name " +
		                ",code " +
		                ",prefix " +
		                ",stf_project.state As state" +
		                ",stf_project.user_audit " +
                        "FROM public.stf_project " +
                        "INNER JOIN celula " +
                        "On celula.id = stf_project.celula_id " +
                        "INNER JOIN tribu " +
                        "ON celula.tribu_id = tribu.id " +
                        "WHERE " +
                        "celula.id = :celulaId ", nativeQuery = true)
        public List<ProjectVO> findByCelulaId(@Param("celulaId") Integer celulaId);

        @Query(value = "SELECT  id_project " +
		        		",celula_id  " +
		                ",celula.celula_name_product " +
		                ",celula.celula_name_squad " +
		                ",tribu.id As tribu_id" +
		                ",tribu.tribu_name " +
		                ",\"KEY\"  As key_project" +
		                ",\"NAME\" As name " +
		                ",code " +
		                ",prefix " +
		                ",stf_project.state As state" +
		                ",stf_project.user_audit " +
                        "FROM public.stf_project " +
                        "INNER JOIN celula " +
                        "On celula.id = stf_project.celula_id " +
                        "INNER JOIN tribu " +
                        "ON celula.tribu_id = tribu.id " +
                        "WHERE " +
                        "celula.tribu_id = :tribuId ", nativeQuery = true)
        public List<ProjectVO> findByTribuId(@Param("tribuId") Integer tribuId);

        @Query(value = "SELECT  id_project " +
		        		",celula_id  " +
		                ",celula.celula_name_product " +
		                ",celula.celula_name_squad " +
		                ",tribu.id As tribu_id" +
		                ",tribu.tribu_name " +
		                ",\"KEY\"  As key_project" +
		                ",\"NAME\" As name " +
		                ",code " +
		                ",prefix " +
		                ",stf_project.state As state" +
		                ",stf_project.user_audit " +
                        "FROM public.stf_project " +
                        "INNER JOIN celula " +
                        "On celula.id = stf_project.celula_id " +
                        "INNER JOIN tribu " +
                        "ON celula.tribu_id = tribu.id " +
                        "WHERE " +
                        "\"NAME\" = :name ", nativeQuery = true)
        public List<ProjectVO> findByName(@Param("name") String name);
}