CREATE TABLE categoria(
        codigo INT (20) PRIMARY KEY AUTO_INCREMENT,
        nome VARCHAR (50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Alimentacao');
INSERT INTO categoria (nome) values ('Supermercado');
INSERT INTO categoria (nome) values ('Farmancia');
INSERT INTO categoria (nome) values ('Outros');