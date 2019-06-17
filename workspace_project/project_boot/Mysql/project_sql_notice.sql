CREATE TABLE notice (
  `nidx` INT NOT NULL AUTO_INCREMENT,
  `ntitle` VARCHAR(10) NOT NULL,
  `nwriter` VARCHAR(10) NULL DEFAULT NULL,
  `ncontent` TEXT NOT NULL,
  `nregdate` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`nidx`));