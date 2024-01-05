package com.pichincha.dm.domain.entity;


import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "stf_project")
public class Project implements Serializable {
    private static final long serialVersionUID = 8917990003010155293L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    Long idProject;

    @Column(name = "celula_id")
    Long celulaId;

    @Column(name = "key_project")
    String key;

    @Column(name = "NAME")
    String name;

    @Column(name = "code")
    String code;

    @Column(name = "prefix")
    String prefix;

    @Column(name = "state")
    String state;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    Date createDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "update_date")
    Date updateDate;


}
