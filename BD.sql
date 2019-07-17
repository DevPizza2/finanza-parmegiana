create table usuario(
	nome varchar(255),
    idade int,
    email varchar(255),
    id int primary key AUTO_INCREMENT
);

create table despesa(
	nome varchar(255),
    valor float,
    descricao varchar(255),
    duracao int,
    usuario_id int,
    foreign key(usuario_id) references usuario(id),
    id int primary key auto_increment
);

insert into despesa values("conta de luz", 50.7, "a conta de luz do mes", 5, 1, 0);
insert into usuario values("jose", 19, "zezinho@ifc.com", 0);

select * from usuario;

drop table usuario;
use teste;
show tables;