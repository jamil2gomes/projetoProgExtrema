create database projetoMono;
use  projetoMono;




insert into professor(nome) values ("Joao"), ("Mauro"), ("Eveline");
insert into curso (nome) values ("Sistemas de Informação");
insert into aluno(nome, curso_id) values ("Pedro Silva", 1);
insert into monografia (data_defesa, local, situacao, tema,aluno_id) values (now(), "Lab 24", "APROVADO", "Tema X", 1);
insert into banca (data_formacao, monografia_id) values (now(), 1);
insert into professor_banca values (8.0, 1, 1,1) , (9.0,0,1,2),(9.0,0,1,3);



select * from aluno;
select * from curso;
select * from professor;
select * from professor_banca;

select * from banca;
select * from monografia;
select * from professor_banca;


#PEGA A DATA, LOCAL, TEMA, SITUACAO E NOME DO ALUNO
select  m.data_defesa, m.local, a.nome, m.tema, m.situacao 
from aluno a 
inner join monografia m on  a. id = m.aluno_id
where m.situacao = "APROVADO" 
and a.nome = "Pedro Silva"
and m.tema = "Tema X";

#PEGA OS PROFESSORES DA BANCA E SUAS NOTAS
select p.nome, pb.nota from aluno a inner join monografia m  on a.id = m.aluno_id
inner join banca b on b.monografia_id = m.id inner join professor_banca pb on pb.banca_id = b.id 
inner join professor p on p.id = pb.professor_id
where m.situacao = "APROVADO" 
and a.nome = "Pedro Silva"
and m.tema = "Tema X";

select p.nome, pb.nota from professor p inner join professor_banca pb on p.id = pb.professor_id
inner join banca b on b.id = pb.banca_id inner join monografia m on m.id = b.monografia_id inner join aluno a
on a.id = m.aluno_id
where m.situacao = "APROVADO" 
and a.nome = "Pedro Silva"
and m.tema = "Tema X";


#PEGA A MEDIA DA NOTA DO ALUNO
select round(avg(pb.nota),2) from aluno a inner join monografia m  on a.id = m.aluno_id
inner join banca b on b.monografia_id = m.id inner join professor_banca pb on pb.banca_id = b.id 
where m.situacao = "APROVADO" 
and a.nome = "Pedro Silva"
and m.tema = "Tema X";


#PEGA O NOME DA ORIENTADORA
select p.nome from aluno a inner join monografia m  on a.id = m.aluno_id
inner join banca b on b.monografia_id = m.id inner join professor_banca pb on pb.banca_id = b.id 
inner join professor p on p.id = pb.professor_id
where m.situacao = "APROVADO" 
and pb.orientador = true
and a.nome = "Pedro Silva"
and m.tema = "Tema X";



