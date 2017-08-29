/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - micro_order
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`micro_order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `micro_order`;

/*Table structure for table `tb_ord_inf` */

DROP TABLE IF EXISTS `tb_ord_inf`;

CREATE TABLE `tb_ord_inf` (
  `tid` varchar(32) NOT NULL,
  `serial_no` varchar(18) DEFAULT NULL COMMENT '流水号',
  `status` varchar(30) DEFAULT NULL COMMENT '订单状态',
  `pay_type` char(10) DEFAULT NULL COMMENT '支付类型',
  `pay_status` varchar(16) DEFAULT NULL COMMENT '支付状态',
  `shipping_account` varchar(32) DEFAULT NULL COMMENT '账户',
  `account_id` varchar(32) DEFAULT NULL COMMENT '账户编号',
  `shipping_name` varchar(200) DEFAULT NULL COMMENT '收货人',
  `shipping_address` varchar(200) DEFAULT NULL COMMENT '收货地址',
  `shipping_phone` varchar(15) DEFAULT NULL COMMENT '收货电话',
  `post_way` char(10) DEFAULT NULL COMMENT '发货方式',
  `post_fee` decimal(18,2) DEFAULT NULL COMMENT '配送费',
  `price` decimal(18,2) DEFAULT NULL COMMENT '订单总价',
  `create_by` varchar(32) DEFAULT NULL,
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息表';

/*Data for the table `tb_ord_inf` */

LOCK TABLES `tb_ord_inf` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_ord_produt` */

DROP TABLE IF EXISTS `tb_ord_produt`;

CREATE TABLE `tb_ord_produt` (
  `tid` varchar(32) NOT NULL,
  `serial_no` varchar(32) DEFAULT NULL COMMENT '流水号',
  `prd_name` varchar(200) DEFAULT NULL COMMENT '商品名',
  `prd_price` decimal(18,2) DEFAULT NULL COMMENT '商品价',
  `prd_qty` int(4) DEFAULT NULL COMMENT '数量',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单商品表';

/*Data for the table `tb_ord_produt` */

LOCK TABLES `tb_ord_produt` WRITE;

UNLOCK TABLES;

/*Table structure for table `tb_ord_state` */

DROP TABLE IF EXISTS `tb_ord_state`;

CREATE TABLE `tb_ord_state` (
  `tid` varchar(32) NOT NULL,
  `serial_no` varchar(32) DEFAULT NULL COMMENT '流水号',
  `status` varchar(30) DEFAULT NULL COMMENT '订单状态',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单状态变更';

/*Data for the table `tb_ord_state` */

LOCK TABLES `tb_ord_state` WRITE;

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
