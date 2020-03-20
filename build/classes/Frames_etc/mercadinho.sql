create database  mercadinho;

use mercadinho;

create table produto(
    codigo int,
    valor double,
    descricao varchar(100),
    tipo varchar(100),
    qtd int,
    primary key (codigo,descricao)
);

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
