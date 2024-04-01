--  Tablas 
DROP DATABASE IF EXISTS gestionAudiovisual;

CREATE DATABASE IF NOT EXISTS gestionAudiovisual;

USE gestionAudiovisual; 

CREATE TABLE usuario (
  idUsuario int PRIMARY KEY AUTO_INCREMENT,
  nombre varchar(100),
  correoElectronico varchar(255),
  contraseña varchar(155)
);

CREATE TABLE contenido (
  idContenido int PRIMARY KEY AUTO_INCREMENT,
  idGenero int,
  nombre varchar(255),
  tipoContenido varchar(255),
  estadoVisualizacion varchar(50),
  plataforma varchar(50),
  calificacion int,
  comentario text
);


CREATE TABLE genero (
  idGenero int PRIMARY KEY AUTO_INCREMENT,
  nombreGenero varchar(75)
);

-- Esta tabla no se agrega en la base de datos, ya que el ORM se encargara de crearla cuando la aplicacion se ejecute con la relacion de muchos a muchos
--CREATE TABLE contenidoGeneros (
--  idContenido int,
-- idUsuario int
--);

ALTER TABLE contenido ADD FOREIGN KEY (idGenero) REFERENCES genero (idGenero);



--Inserts 
--Usuario
INSERT INTO usuario (idUsuario, nombre, correoElectronico, contraseña) VALUES (1, 'Juan Perez', 'juanperez@example.com', 'contraseña123'); 
INSERT INTO usuario (idUsuario, nombre, correoElectronico, contraseña) VALUES (2, 'María López', 'marialopez@example.com', 'clave456'); 
INSERT INTO usuario (idUsuario, nombre, correoElectronico, contraseña) VALUES (3, 'Pedro Ramirez', 'pedroramirez@example.com', 'password789'); 

--Genero 
INSERT INTO genero (idGenero, nombreGenero) VALUES (1, 'Acción'); 
INSERT INTO genero (idGenero, nombreGenero) VALUES (2, 'Drama'); 
INSERT INTO genero (idGenero, nombreGenero) VALUES (3, 'Documental'); 

--Contenido

INSERT INTO contenido (idContenido, idGenero, nombre, tipoContenido, estadoVisualizacion, plataforma, calificacion, comentario) VALUES (1, 1, 'Película A', 'Película', 'Visto', 'Netflix', 4, 'Buena película'); 
INSERT INTO contenido (idContenido, idGenero, nombre, tipoContenido, estadoVisualizacion, plataforma, calificacion, comentario) VALUES (2, 2, 'Serie B', 'Serie', 'No visto', 'HBO', 5, 'Muy recomendada'); 
INSERT INTO contenido (idContenido, idGenero, nombre, tipoContenido, estadoVisualizacion, plataforma, calificacion, comentario) VALUES (3, 1, 'Documental C', 'Documental', 'Visto', 'Amazon Prime', 3, 'Interesante pero corto'); 
  




-- indexs se deben meter des

CREATE INDEX idx_id_usuario ON usuario (id_usuario);
CREATE INDEX idx_id_contenido ON contenido (id_contenido);
CREATE INDEX idx_id_genero ON genero (id_genero);