CREATE DATABASE bd_filmes;

USE bd_filmes;

CREATE TABLE tb_filme(
	codigo INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(200),
    diretor VARCHAR(200),
    ator VARCHAR(200),
    genero VARCHAR(200)
);

SELECT*FROM tb_filme;

    