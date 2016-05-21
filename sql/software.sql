/*
 Navicat Premium Data Transfer

 Source Server         : ali
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : www.ctguqmx.com
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : utf-8

 Date: 05/21/2016 11:12:48 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `soft_download_link`
-- ----------------------------
DROP TABLE IF EXISTS `soft_download_link`;
CREATE TABLE `soft_download_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version_id` int(11) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `description` text,
  `remark` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(11) DEFAULT NULL,
  `deleted_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `soft_software_version`
-- ----------------------------
DROP TABLE IF EXISTS `soft_software_version`;
CREATE TABLE `soft_software_version` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `soft_id` int(11) DEFAULT NULL,
  `version_id` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `deleted_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `soft_tag`
-- ----------------------------
DROP TABLE IF EXISTS `soft_tag`;
CREATE TABLE `soft_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `ident` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted_status` tinyint(1) DEFAULT '0' COMMENT '逻辑删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `soft_tag_ref`
-- ----------------------------
DROP TABLE IF EXISTS `soft_tag_ref`;
CREATE TABLE `soft_tag_ref` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tag_id` int(11) DEFAULT NULL,
  `obj_id` int(11) DEFAULT NULL COMMENT '被贴标签的项目',
  `obj_type` int(2) DEFAULT NULL COMMENT '被贴标签的项目类型',
  `0deleted_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `soft_user`
-- ----------------------------
DROP TABLE IF EXISTS `soft_user`;
CREATE TABLE `soft_user` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `level` int(1) DEFAULT NULL COMMENT '用户级别',
  `deleted_status` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `soft_version`
-- ----------------------------
DROP TABLE IF EXISTS `soft_version`;
CREATE TABLE `soft_version` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `soft_id` int(11) DEFAULT NULL COMMENT '关联软件',
  `version_number` varchar(50) DEFAULT NULL COMMENT '版本号',
  `description` text COMMENT '描述',
  `log` text COMMENT '更新日志',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `user_id` int(11) DEFAULT NULL COMMENT '提交用户',
  `deleted_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `soft_version_link`
-- ----------------------------
DROP TABLE IF EXISTS `soft_version_link`;
CREATE TABLE `soft_version_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version_id` int(11) DEFAULT NULL,
  `download_link_id` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `deleted_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `sort_software`
-- ----------------------------
DROP TABLE IF EXISTS `sort_software`;
CREATE TABLE `sort_software` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '软件名',
  `common_name` varchar(100) DEFAULT NULL COMMENT '软件别名',
  `url` varchar(150) DEFAULT NULL COMMENT '软件官网',
  `company_name` varchar(100) DEFAULT NULL COMMENT '软件所属公司名',
  `description` text COMMENT '软件描述',
  `remark` text COMMENT '备注',
  `create_time` timestamp NULL DEFAULT NULL,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `default_version_id` int(11) DEFAULT NULL COMMENT '默认版本id',
  `user_id` int(11) DEFAULT NULL COMMENT '提交软件的用户',
  `deleted_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
