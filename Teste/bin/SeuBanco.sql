-- Crie o banco de dados
CREATE DATABASE SeuBanco;

-- Use o banco de dados
USE SeuBanco;

-- Crie a tabela Usuarios
CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Crie a tabela Produtos
CREATE TABLE Produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    modelo VARCHAR(255),
    descricao TEXT,
    proprietario_id INT,
    FOREIGN KEY (proprietario_id) REFERENCES Usuarios(id)
);

-- Crie a tabela Trocas
CREATE TABLE Trocas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT,
    produto_id INT,
    data DATETIME,
    FOREIGN KEY (usuario_id) REFERENCES Usuarios(id),
    FOREIGN KEY (produto_id) REFERENCES Produtos(id)
);

-- Crie a tabela Chats
CREATE TABLE Chats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuario_id1 INT,
    usuario_id2 INT,
    FOREIGN KEY (usuario_id1) REFERENCES Usuarios(id),
    FOREIGN KEY (usuario_id2) REFERENCES Usuarios(id)
);
