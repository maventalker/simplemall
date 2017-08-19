/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.7.13 : Database - micro_product
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`micro_product` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `micro_product`;

/*Table structure for table `tb_prd_extend` */

DROP TABLE IF EXISTS `tb_prd_extend`;

CREATE TABLE `tb_prd_extend` (
  `tid` varchar(32) NOT NULL,
  `supplier_name` varchar(11) DEFAULT NULL COMMENT '供应商',
  `long_desc` varchar(30) DEFAULT NULL COMMENT '长描述',
  `weight` varchar(16) DEFAULT NULL COMMENT '重量',
  `origin` varchar(16) DEFAULT NULL COMMENT '产地',
  `saled_qty` int(11) DEFAULT NULL COMMENT '售出数量',
  `create_by` varchar(32) DEFAULT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品扩展信息';

/*Data for the table `tb_prd_extend` */

LOCK TABLES `tb_prd_extend` WRITE;

insert  into `tb_prd_extend`(`tid`,`supplier_name`,`long_desc`,`weight`,`origin`,`saled_qty`,`create_by`,`create_date`,`update_by`,`update_date`,`remark`,`version`,`state`) values ('16cc3bda7eea11e7bb31be2e44b06b34','苏宁','long describtion','32','CHINA',1,NULL,'2017-08-12 07:13:54',NULL,'2017-08-12 07:13:54',NULL,0,1),('16cc3f047eea11e7bb31be2e44b06b34','京东','long describtion','12','CHINA',1,NULL,'2017-08-12 07:13:51',NULL,'2017-08-12 07:13:51',NULL,0,1),('16cc41027eea11e7bb31be2e44b06b34','Amazon','long describtion','32','USA',1,NULL,'2017-08-12 07:14:01',NULL,'2017-08-12 07:14:01',NULL,0,1),('16cc46707eea11e7bb31be2e44b06b34','facebook','long describtion','43','EUA',1,NULL,'2017-08-12 07:14:04',NULL,'2017-08-12 07:14:04',NULL,0,1),('16cc49407eea11e7bb31be2e44b06b34','google','long describtion','54','USA',1,NULL,'2017-08-12 07:14:06',NULL,'2017-08-12 07:14:06',NULL,0,1);

UNLOCK TABLES;

/*Table structure for table `tb_prd_info` */

DROP TABLE IF EXISTS `tb_prd_info`;

CREATE TABLE `tb_prd_info` (
  `tid` varchar(32) NOT NULL,
  `label_name` varchar(50) DEFAULT NULL COMMENT '对外展示名称',
  `short_desc` varchar(300) DEFAULT NULL COMMENT '短描述',
  `price` varchar(16) DEFAULT NULL COMMENT '库存',
  `store` int(10) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remark` varchar(1000) DEFAULT NULL,
  `version` int(2) DEFAULT '0',
  `state` int(2) DEFAULT '1',
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息';

/*Data for the table `tb_prd_info` */

LOCK TABLES `tb_prd_info` WRITE;

insert  into `tb_prd_info`(`tid`,`label_name`,`short_desc`,`price`,`store`,`create_by`,`create_date`,`update_by`,`update_date`,`remark`,`version`,`state`) values ('16cc3bda7eea11e7bb31be2e44b06b34','荣耀8青春版 全网通 标配版 3GB+32GB 珠光白','双面2.5D玻璃，美品潮搭，颜值小担当','1099',34567,NULL,'2017-08-12 07:09:23',NULL,'2017-08-12 07:09:23',NULL,0,1),('16cc3f047eea11e7bb31be2e44b06b34','Apple iPhone 6s Plus (A1699) 32G 玫瑰金色 移动联通电信4G手机','8月热卖iPhone','3999',22,NULL,'2017-08-12 07:09:29',NULL,'2017-08-12 07:09:29',NULL,0,1),('16cc41027eea11e7bb31be2e44b06b34','小米Max2 全网通 4GB+64GB 金色 移动联通电信4G手机 双卡双待','购机赠小米方盒子蓝牙音箱+保护壳+米粉卡(含100元话费)','1699',4000,NULL,'2017-08-12 07:09:32',NULL,'2017-08-12 07:09:32',NULL,0,1),('16cc46707eea11e7bb31be2e44b06b34','一加手机5 (A5000) 8GB+128GB 星辰黑 全网通 双卡双待 移动联通电信4G手机','2000+1600万高清双摄，8GB大内存+高通骁龙835处理器','3466',222,NULL,'2017-08-12 07:09:34',NULL,'2017-08-12 07:09:34',NULL,0,1),('16cc49407eea11e7bb31be2e44b06b34','华为 HUAWEI nova 2 Plus 4GB+128GB 玫瑰金','高颜值，爱自拍！','2899',3333,NULL,'2017-08-12 07:09:36',NULL,'2017-08-12 07:09:36',NULL,0,1);

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
