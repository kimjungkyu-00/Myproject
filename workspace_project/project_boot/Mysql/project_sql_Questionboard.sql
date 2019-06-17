CREATE TABLE `mydb`.`tbl_questionboard` (
  `idx` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `content` TEXT NOT NULL,
  `writer` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idx`));
