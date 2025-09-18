CREATE TABLE autor(
    id uuid not null primary key,
    nome varchar(100),
    data_nascimento date not null,
    nacionalidade varchar(100)
);