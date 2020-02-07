CREATE TABLE professor (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO professor (nome) VALUES ('Joao'), ('Eveline'), ('Mauro');
