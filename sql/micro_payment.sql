/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - micro_payment
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`micro_payment` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `micro_payment`;

/*Table structure for table `tb_pay_record` */

DROP TABLE IF EXISTS `tb_pay_record`;

CREATE TABLE `tb_pay_record` (
  `tid` varchar(32) NOT NULL,
  `serial_no` varchar(16) DEFAULT NULL COMMENT '流水号',
  `type` char(10) DEFAULT NULL COMMENT '支付方式,Alipay|Wechat|Card',
  `status` varchar(30) DEFAULT NULL COMMENT '支付状态',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易支付记录';

/*Data for the table `tb_pay_record` */

LOCK TABLES `tb_pay_record` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
