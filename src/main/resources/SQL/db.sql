CREATE DATABASE /*!32312 IF NOT EXISTS*/`zlflovemm` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `zlflovemm`;
CREATE TABLE `sys_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `role_code` VARCHAR(255) NOT NULL,
  `role_name` VARCHAR(255) NOT NULL,
  `gmt_create` DATETIME NOT NULL,
  `gmt_update` DATETIME NOT NULL,
  `nickname` VARCHAR(255) DEFAULT NULL,
  `user_create` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

INSERT  INTO `sys_user`(`id`,`username`,`password`,`email`,`role_code`,`role_name`,`gmt_create`,`gmt_update`,`nickname`,`user_create`) VALUES (1,'admin','123456','345849402@qq.com','admin','管理员','2019-03-21 14:30:57','2019-03-21 14:30:57','admin',1);




DROP TABLE IF EXISTS `scheduled`;
CREATE TABLE `scheduled`  (
  `cron_id` varchar(30) NOT NULL PRIMARY KEY,
  `cron` varchar(30) NOT NULL
);
INSERT INTO `cron` VALUES ('1', '0/6 * * * * ?');

CREATE DATABASE /*!32312 IF NOT EXISTS*/`zlfdb` /*!40100 DEFAULT CHARACTER SET utf8 */;


USE `zlfdb`;
CREATE TABLE `sys_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `role_code` VARCHAR(255) NOT NULL,
  `role_name` VARCHAR(255) NOT NULL,
  `gmt_create` DATETIME NOT NULL,
  `gmt_update` DATETIME NOT NULL,
  `nickname` VARCHAR(255) DEFAULT NULL,
  `user_create` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

INSERT  INTO `sys_user`(`id`,`username`,`password`,`email`,`role_code`,`role_name`,`gmt_create`,`gmt_update`,`nickname`,`user_create`) VALUES (1,'admin','123456','345849402@qq.com','admin','管理员','2019-03-21 14:30:57','2019-03-21 14:30:57','admin',1);
