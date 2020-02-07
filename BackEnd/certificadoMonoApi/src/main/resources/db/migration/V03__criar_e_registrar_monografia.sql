CREATE TABLE monografia (
 id      INT NOT NULL AUTO_INCREMENT,
tema     VARCHAR(100) NOT NULL,
data_defesa datetime(6),
local    VARCHAR(100) NOT NULL,
situacao VARCHAR(100),
aluno_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (aluno_id) REFERENCES aluno (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO monografia (data_defesa, local, situacao, tema,aluno_id) VALUES 
(now(), "Lab 24", "APROVADO", "Tema X", 1);

