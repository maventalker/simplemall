/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - micro_account
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`micro_account` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `micro_account`;

/*Table structure for table `tb_acc_account` */

DROP TABLE IF EXISTS `tb_acc_account`;

CREATE TABLE `tb_acc_account` (
  `tid` varchar(32) NOT NULL,
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `email` varchar(30) DEFAULT NULL COMMENT '邮件',
  `password` varchar(16) DEFAULT NULL COMMENT '密码',
  `create_by` varchar(32) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本用户信息';

/*Data for the table `tb_acc_account` */

LOCK TABLES `tb_acc_account` WRITE;

insert  into `tb_acc_account`(`tid`,`phone`,`email`,`password`,`create_by`,`create_date`,`update_by`,`update_date`,`remark`,`version`,`state`) values ('0838bbe7846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:25',NULL,'2017-08-19 06:51:25',NULL,0,1),('15e20903846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:47',NULL,'2017-08-19 06:51:47',NULL,0,1),('162faa3c846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:48',NULL,'2017-08-19 06:51:48',NULL,0,1),('1662bb05846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:48',NULL,'2017-08-19 06:51:48',NULL,0,1),('1682e6e7846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:49',NULL,'2017-08-19 06:51:49',NULL,0,1),('169f2bbf846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:49',NULL,'2017-08-19 06:51:49',NULL,0,1),('16baba72846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:49',NULL,'2017-08-19 06:51:49',NULL,0,1),('16d491a3846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:49',NULL,'2017-08-19 06:51:49',NULL,0,1),('16eae491846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:49',NULL,'2017-08-19 06:51:49',NULL,0,1),('1707fdd0846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:51:49',NULL,'2017-08-19 06:51:49',NULL,0,1),('1d5a51ba846711e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:44:51',NULL,'2017-08-19 06:44:51',NULL,0,1),('42fd61a7825b11e787bb507b9dde98b7','1212',NULL,'21312',NULL,'2017-08-16 16:15:27',NULL,'2017-08-16 16:15:27',NULL,0,1),('4e78583d846e11e787bb507b9dde98b7','1321312312',NULL,'1321312312',NULL,'2017-08-19 07:36:19',NULL,'2017-08-19 07:36:19',NULL,0,1),('56aba27a825b11e787bb507b9dde98b7','1111111111',NULL,'21312',NULL,'2017-08-16 16:16:00',NULL,'2017-08-16 16:16:00',NULL,0,1),('6e6e0543832311e787bb507b9dde98b7','1212',NULL,'2323',NULL,'2017-08-17 16:08:13',NULL,'2017-08-17 16:08:13',NULL,0,1),('73ca6f0f832311e787bb507b9dde98b7','fsdfsdf',NULL,'2323',NULL,'2017-08-17 16:08:22',NULL,'2017-08-17 16:08:22',NULL,0,1),('9bf45516846711e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:48:23',NULL,'2017-08-19 06:48:23',NULL,0,1),('af52ae32846811e787bb507b9dde98b7','asdf',NULL,'asfdasfd',NULL,'2017-08-19 06:56:05',NULL,'2017-08-19 06:56:05',NULL,0,1);

UNLOCK TABLES;

/*Table structure for table `tb_acc_address` */

DROP TABLE IF EXISTS `tb_acc_address`;

CREATE TABLE `tb_acc_address` (
  `tid` varchar(32) NOT NULL,
  `account_id` varchar(32) DEFAULT NULL COMMENT '账户',
  `real_name` varchar(11) DEFAULT NULL COMMENT '姓名',
  `detail_address` varchar(30) DEFAULT NULL COMMENT '详细地址',
  `is_flu` varchar(16) DEFAULT NULL COMMENT '是否常用地址',
  `create_by` varchar(32) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户收货地址';

/*Data for the table `tb_acc_address` */

LOCK TABLES `tb_acc_address` WRITE;

insert  into `tb_acc_address`(`tid`,`account_id`,`real_name`,`detail_address`,`is_flu`,`create_by`,`create_date`,`update_by`,`update_date`,`remark`,`version`,`state`) values ('56aba27a825b11e787bb507b9dds98b7','56aba27a825b11e787bb507b9dde98b7','大本营','和笔的的的',NULL,NULL,'2017-08-19 06:56:35',NULL,'2017-08-19 06:56:35',NULL,0,1);

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
