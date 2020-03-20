create database  mercadinho;

use mercadinho;

create table venda(
    nome varchar(255),
    data_v varchar(255),
    hora_v varchar(255),
    total double,
    tipo varchar(255)
);


create table backup_p(
    codigo int primary key,
    valor double,
    descricao varchar(100),
    tipo varchar(100),
    qtd int
);

create table compra(
    codigo int primary key,
    valor double,
    descricao varchar(100),
    tipo varchar(100),
    qtd int
);

create table produto(
    codigo int primary key,
    valor double,
    descricao varchar(100),
    tipo varchar(100),
    qtd int
);

insert into produto value(1 , '1','militos', 'salgadinho', 4);
insert into produto value(2 , '0.5','pirulito', 'doces', 30);
insert into produto value(3 , '3','fanta', 'refrigerante', 24);
insert into produto value(4 , '3','fanta', 'refrigerante', 24);
insert into produto value(5 , '2','negresco', 'biscoito', 11);
insert into produto value(6 , '2','escureto', 'biscoito', 11);
insert into produto value(7 , '1.5','mentos', 'doces', 14);
insert into produto value(8 , '3','baré', 'refrigerante', 21);
insert into produto value(9 , '1','denitos', 'salgadinho', 4);
insert into produto value(10 , '3','sprite', 'refrigerante', 18);