CREATE TABLE professor_banca (
nota DOUBLE,
orientador BIT(1),
banca_id INT NOT NULL,
professor_id INT NOT NULL,
PRIMARY KEY (banca_id, professor_id),
FOREIGN KEY (banca_id) REFERENCES banca (id),
FOREIGN KEY (professor_id) REFERENCES professor (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

insert into professor_banca values (8.0, 1, 1,1) , (9.0,0,1,2),(9.0,0,1,3);

