CREATE TABLE aluno (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  curso_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (curso_id) REFERENCES curso (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO aluno (nome, curso_id) VALUES ('Pedro Silva', 1);
