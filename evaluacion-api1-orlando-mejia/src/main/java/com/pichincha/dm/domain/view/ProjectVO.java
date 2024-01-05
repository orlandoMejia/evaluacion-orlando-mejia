package com.pichincha.dm.domain.view;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectVO {
    @Id
    @Column(name = "id_project")
    Long idProject;

    @Column(name = "celula_id")
    Long idCelula;

    @Column(name = "celula_name_product")
    String celulaNameProduct;

    @Column(name = "celula_name_squad")
    String celulaNameSquad;

    @Column(name = "tribu_id")
    Long idTribu;

    @Column(name = "tribu_name")
    String tribuName;

    @Column(name = "key_project")
    String key;

    @Column(name = "name")
    String repositoryName;

    @Column(name = "state")
    String state;

    @Column(name = "code")
    String code;

    @Column(name = "prefix")
    String prefix;

}
