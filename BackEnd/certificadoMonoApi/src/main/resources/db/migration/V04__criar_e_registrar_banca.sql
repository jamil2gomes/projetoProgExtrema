CREATE TABLE banca (
id  INT NOT NULL AUTO_INCREMENT,
data_formacao date,
monografia_id INT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (monografia_id) REFERENCES monografia (id)
) engine=InnoDB DEFAULT CHARSET=utf8;

insert into banca (data_formacao, monografia_id) values (now(), 1);

