CREATE SCHEMA IF NOT EXISTS `DBTrain` DEFAULT CHARACTER SET utf8 ;
USE `DBTrain` ;

-- -----------------------------------------------------
-- Table `DBTrain`.`Train`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBTrain`.`Train` (
  `id` INT UNSIGNED NOT NULL,
  `trainNumber` INT UNSIGNED NOT NULL,
  `arrivalStation` VARCHAR(120) NOT NULL,
  `placesCount` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBTrain`.`Station`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBTrain`.`Station` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `stationName` VARCHAR(120) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBTrain`.`ScheduleModel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBTrain`.`Schedule` (
  `id` INT UNSIGNED NOT NULL,
  `Station_id` INT UNSIGNED NOT NULL,
  `Train_id` INT UNSIGNED NOT NULL,
  `departureDate` DATETIME NOT NULL,
  `arrivalDate` DATETIME NOT NULL,
  INDEX `fk_Schedule_Train1_idx` (`Train_id` ASC),
  INDEX `fk_Schedule_Station1_idx` (`Station_id` ASC),
  PRIMARY KEY (`departureDate`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_Schedule_Train1`
  FOREIGN KEY (`Train_id`)
  REFERENCES `DBTrain`.`Train` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Schedule_Station1`
  FOREIGN KEY (`Station_id`)
  REFERENCES `DBTrain`.`Station` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBTrain`.`Passenger`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBTrain`.`Passenger` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `lastName` VARCHAR(120) NOT NULL,
  `firstName` VARCHAR(120) NOT NULL,
  `birthday` DATE NOT NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`))
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBTrain`.`Ticket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBTrain`.`Ticket` (
  `id` INT UNSIGNED NOT NULL,
  `placeNumber` INT UNSIGNED NOT NULL,
  `Passenger_id` INT UNSIGNED NOT NULL,
  `Train_id` INT UNSIGNED NOT NULL,
  `Schedule_departureDate` DATETIME NOT NULL,
  PRIMARY KEY (`id`, `Schedule_departureDate`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_Ticket_Passenger1_idx` (`Passenger_id` ASC),
  INDEX `fk_Ticket_Train1_idx` (`Train_id` ASC),
  INDEX `fk_Ticket_Schedule1_idx` (`Schedule_departureDate` ASC),
  CONSTRAINT `fk_Ticket_Passenger1`
  FOREIGN KEY (`Passenger_id`)
  REFERENCES `DBTrain`.`Passenger` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ticket_Train1`
  FOREIGN KEY (`Train_id`)
  REFERENCES `DBTrain`.`Train` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ticket_Schedule1`
  FOREIGN KEY (`Schedule_departureDate`)
  REFERENCES `DBTrain`.`Schedule` (`departureDate`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBTrain`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBTrain`.`User` (
  `login` VARCHAR(50) NOT NULL,
  `lastName` VARCHAR(50) NOT NULL,
  `firstName` VARCHAR(50) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `userType` ENUM('ADMIN', 'USER') NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`login`))
  ENGINE = InnoDB;
