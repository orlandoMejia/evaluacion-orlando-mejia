;

CREATE USER IF NOT EXISTS "SA" SALT '8e2a3a88c972f437' HASH 'b5a6d5f6d1ebe7fe4244a90a7c270586549503f73ba244527733a2511b58d308' ADMIN;

CREATE TABLE public.stf_project(
    id_project INTEGER,
    celula_id integer,
    "KEY" VARCHAR(100),
    "NAME" varchar(100),
    code varchar(30),
    prefix varchar(20),
    state varchar(20),
    create_date date,
    update_date date,
    user_audit varchar(100)
);

INSERT INTO stf_project VALUES (1, 1, 'KEY-1', 'PROJECT-1', 'PROJECT-1', 'P1', 'ACTIVO1', '2023-01-01', '2023-01-06', 'AUDITOR1');
INSERT INTO stf_project VALUES (2, 1, 'KEY-2', 'PROJECT-2', 'PROJECT-2', 'P2', 'ACTIVO2', '2023-01-02', '2023-01-07', 'AUDITOR2');
INSERT INTO stf_project VALUES (3, 1, 'KEY-3', 'PROJECT-3', 'PROJECT-3', 'P3', 'ACTIVO3', '2023-01-03', '2023-01-08', 'AUDITOR3');
INSERT INTO stf_project VALUES (4, 1, 'KEY-4', 'PROJECT-4', 'PROJECT-4', 'P4', 'ACTIVO4', '2023-01-04', '2023-01-09', 'AUDITOR4');
INSERT INTO stf_project VALUES (5, 1, 'KEY-5', 'PROJECT-5', 'PROJECT-5', 'P5', 'ACTIVO5', '2023-01-05', '2023-01-10', 'AUDITOR5');


CREATE TABLE public.celula(
    id integer,
    celula_name_product varchar(256),
    celula_name_squad varchar(256),
	tribu_id integer
);

INSERT INTO celula VALUES (1, 'CELULA-1', 'CELULA-1', 1);

CREATE TABLE public.tribu(
    id integer,
	tribu_name varchar(50)
);

insert into tribu values (1, 'TRIBU-1');