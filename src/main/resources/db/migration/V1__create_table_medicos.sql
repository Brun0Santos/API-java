CREATE TABLE tb_medicos(
    id SERIAL NOT NULL,
    nome VARCHAR(25) NOT NULL,
    email VARCHAR(30) NOT NULL,
    crm VARCHAR(6) NOT NULL,
    especialidade VARCHAR(20) NOT NULL,
    logradouro VARCHAR(30) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    complemento VARCHAR(30) NOT NULL,
    numero VARCHAR(9) NOT NULL,
    uf VARCHAR(2) NOT NULL,
    cidade VARCHAR(35) NOT NULL
);