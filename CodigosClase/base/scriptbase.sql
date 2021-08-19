-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`persona`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`persona` ;

CREATE TABLE IF NOT EXISTS `mydb`.`persona` (
  `idpersona` INT NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido` VARCHAR(45) NULL DEFAULT NULL,
  `edad` VARCHAR(45) NULL DEFAULT NULL,
  `dirección` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `ciudad` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idpersona`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`producto` ;

CREATE TABLE IF NOT EXISTS `mydb`.`producto` (
  `idProducto` INT NOT NULL,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `precio` INT NULL DEFAULT NULL,
  `descripcion` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idProducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`factura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`factura` ;

CREATE TABLE IF NOT EXISTS `mydb`.`factura` (
  `idFactura` INT NOT NULL,
  `fecha` TIME NOT NULL,
  `fecha2` DATETIME(1) NULL DEFAULT NULL,
  `Producto_idProducto` INT NOT NULL,
  `Persona_idpersona` INT NOT NULL,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`idFactura`),
  INDEX `fk_Factura_Producto_idx` (`Producto_idProducto` ASC) VISIBLE,
  INDEX `fk_Factura_Persona1_idx` (`Persona_idpersona` ASC) VISIBLE,
  CONSTRAINT `fk_Factura_Persona1`
    FOREIGN KEY (`Persona_idpersona`)
    REFERENCES `mydb`.`persona` (`idpersona`),
  CONSTRAINT `fk_Factura_Producto`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `mydb`.`producto` (`idProducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
