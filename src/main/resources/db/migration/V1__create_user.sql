CREATE TABLE tb_user
(
    id       char(36)     NOT NULL,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email    VARCHAR(255) NOT NULL,
    CONSTRAINT pk_tb_user PRIMARY KEY (id)
);

ALTER TABLE tb_user
    ADD CONSTRAINT uc_tb_user_email UNIQUE (email);

ALTER TABLE tb_user
    ADD CONSTRAINT uc_tb_user_username UNIQUE (username);