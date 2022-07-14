SELECT * FROM biblioteca.biblioteca;
SELECT * FROM biblioteca.biblioteca WHERE (`direccion` != 'Medellín');

INSERT INTO `biblioteca`.`biblioteca` (`idbiblioteca`, `nombre`, `direccion`)
VALUES ('1', 'Julio Barco', 'Medellín');
INSERT INTO `biblioteca`.`biblioteca` (`idbiblioteca`, `nombre`, `direccion`)
VALUES ('2', 'Julio Barco', 'Cali');
INSERT INTO `biblioteca`.`biblioteca` (`idbiblioteca`, `nombre`, `direccion`)
VALUES ('3', 'Julio Barco', 'Bogotá');
INSERT INTO `biblioteca`.`biblioteca` (`idbiblioteca`, `nombre`, `direccion`)
VALUES ('4', 'Julio Barco', 'Bogotá');

DELETE FROM `biblioteca`.`biblioteca` WHERE (`idbiblioteca` != '0');
