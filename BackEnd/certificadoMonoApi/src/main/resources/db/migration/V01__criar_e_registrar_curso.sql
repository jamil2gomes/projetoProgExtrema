CREATE TABLE curso (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO curso (nome) VALUES ('Sistemas de Informação');

