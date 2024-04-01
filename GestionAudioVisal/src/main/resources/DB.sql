--  Tablas 
DROP DATABASE IF EXISTS gestionAudiovisual;

CREATE DATABASE IF NOT EXISTS gestionAudiovisual;

USE gestionAudiovisual; 

CREATE TABLE usuario (
  idUsuario int PRIMARY KEY,
  nombre varchar(100),
  correoElectronico varchar(255),
  contraseña varchar(155)
);

CREATE TABLE contenido (
  idContenido int PRIMARY KEY,
  idGenero int,
  nombre varchar(255),
  tipoContenido varchar(255),
  estadoVisualizacion varchar(50),
  plataforma varchar(50),
  calificacion int,
  comentario text
);

CREATE TABLE contenidoGeneros (
  idContenido int,
  idUsuario int
);

CREATE TABLE genero (
  idGenero int PRIMARY KEY,
  nombreGenero varchar(75)
);

ALTER TABLE contenidoGeneros ADD FOREIGN KEY (idUsuario) REFERENCES usuario (idUsuario);

ALTER TABLE contenidoGeneros ADD FOREIGN KEY (idContenido) REFERENCES contenido (idContenido);

ALTER TABLE contenido ADD FOREIGN KEY (idGenero) REFERENCES genero (idGenero);


-- indexs 

CREATE INDEX idx_id_usuario ON usuario (id_usuario);
CREATE INDEX idx_id_contenido ON contenido (id_contenido);