CREATE TABLE checking_account
(
    id                    char(36)     NOT NULL,
    full_name             VARCHAR(255) NOT NULL,
    cpf                   VARCHAR(255) NOT NULL,
    birth_date            date         NULL,
    balance               DECIMAL      NULL,
    cellphone             VARCHAR(255) NULL,
    user_id               char(36)     NULL,
    special_credit_active BOOLEAN       NULL,
    CONSTRAINT pk_checking_account PRIMARY KEY (id)
);

ALTER TABLE checking_account
    ADD CONSTRAINT uc_checking_account_cpf UNIQUE (cpf);

ALTER TABLE checking_account
    ADD CONSTRAINT FK_CHECKING_ACCOUNT_ON_USER FOREIGN KEY (user_id) REFERENCES tb_user (id);