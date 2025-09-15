create table livro(
    id uuid not null primary key,
    isbn varchar(13) not null,
    titulo varchar(250) not null,
    data_publicacao date not null,
    genero varchar (30) not null,
    constraint chk_genero check ( genero in ('FICCAO', 'FANTASIA', 'MISTERIO', 'ROMANCE', 'BIOGRAFIA', 'CIENCIA')),
    preco numeric(18,2) not null,
    id_autor UUID not null,
    foreign key (id_autor) references autor(id)
);