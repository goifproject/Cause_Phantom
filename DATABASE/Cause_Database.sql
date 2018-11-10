-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 52.79.117.73    Database: Cause
-- ------------------------------------------------------
-- Server version	5.7.24-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company_info`
--

DROP TABLE IF EXISTS `company_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_info` (
  `company_key` varchar(255) NOT NULL,
  `company_id` varchar(45) DEFAULT NULL,
  `company_pw` varchar(45) DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  `ceo_name` varchar(45) DEFAULT NULL,
  `ceo_gender` varchar(45) DEFAULT NULL,
  `ceo_birth_year` varchar(45) DEFAULT NULL,
  `ceo_birth_month` varchar(45) DEFAULT NULL,
  `ceo_birth_day` varchar(45) DEFAULT NULL,
  `ceo_phone` varchar(45) DEFAULT NULL,
  `company_email` varchar(45) DEFAULT NULL,
  `company_bln` varchar(45) DEFAULT NULL,
  `company_phone` varchar(45) DEFAULT NULL,
  `company_address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`company_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `donation_category`
--

DROP TABLE IF EXISTS `donation_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_category` (
  `category_name` varchar(45) NOT NULL,
  `category_profile` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `donation_comment`
--

DROP TABLE IF EXISTS `donation_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_comment` (
  `comment_key` varchar(45) NOT NULL,
  `donation_key` varchar(45) DEFAULT NULL,
  `comment_user` varchar(45) DEFAULT NULL,
  `comment_context` varchar(45) DEFAULT NULL,
  `comment_likenum` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`comment_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `donation_history`
--

DROP TABLE IF EXISTS `donation_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_history` (
  `history_key` varchar(45) NOT NULL,
  `donation_user` varchar(45) DEFAULT NULL,
  `donation_key` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`history_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `donation_info`
--

DROP TABLE IF EXISTS `donation_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_info` (
  `donation_key` varchar(45) NOT NULL,
  `donation_title` varchar(45) DEFAULT NULL,
  `donation_context` varchar(45) DEFAULT NULL,
  `donation_donator` varchar(45) DEFAULT NULL,
  `donation_profile` varchar(45) DEFAULT NULL,
  `donation_period` varchar(45) DEFAULT NULL,
  `donation_supportornum` varchar(45) DEFAULT NULL,
  `donation_goal` varchar(45) DEFAULT NULL,
  `donation_schedule` varchar(45) DEFAULT NULL,
  `donation_likenum` varchar(45) DEFAULT NULL,
  `donation_category` varchar(45) DEFAULT NULL,
  `donation_achieve` varchar(45) DEFAULT NULL,
  `donation_progress` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`donation_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `donation_subs`
--

DROP TABLE IF EXISTS `donation_subs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donation_subs` (
  `donation_key` varchar(45) NOT NULL,
  `subs_title` varchar(45) DEFAULT NULL,
  `subs_photo` varchar(45) DEFAULT NULL,
  `subs_context` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`donation_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `donator_info`
--

DROP TABLE IF EXISTS `donator_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `donator_info` (
  `donator_key` varchar(45) NOT NULL,
  `donator_name` varchar(45) DEFAULT NULL,
  `donator_phone` varchar(45) DEFAULT NULL,
  `donator_email` varchar(45) DEFAULT NULL,
  `donator_address` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`donator_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funding_category`
--

DROP TABLE IF EXISTS `funding_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funding_category` (
  `category_name` varchar(45) NOT NULL,
  PRIMARY KEY (`category_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funding_comment`
--

DROP TABLE IF EXISTS `funding_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funding_comment` (
  `comment_key` varchar(45) NOT NULL,
  `funding_key` varchar(45) DEFAULT NULL,
  `comment_user` varchar(45) DEFAULT NULL,
  `comment_context` varchar(45) DEFAULT NULL,
  `comment_likenum` varchar(45) DEFAULT '"0"',
  `comment_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`comment_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funding_history`
--

DROP TABLE IF EXISTS `funding_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funding_history` (
  `history_key` varchar(45) NOT NULL,
  `funding_user` varchar(45) DEFAULT NULL,
  `funding_key` varchar(45) DEFAULT NULL,
  `reward_key` varchar(45) DEFAULT NULL,
  `reward_num` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`history_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funding_info`
--

DROP TABLE IF EXISTS `funding_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funding_info` (
  `funding_key` varchar(255) NOT NULL,
  `funding_profile` varchar(255) DEFAULT NULL,
  `funding_company` varchar(45) DEFAULT NULL,
  `funding_title` varchar(45) DEFAULT NULL,
  `funding_context` varchar(255) DEFAULT NULL,
  `funding_progress` varchar(45) DEFAULT NULL,
  `funding_restoration` varchar(45) DEFAULT NULL,
  `funding_supporternum` varchar(45) DEFAULT NULL,
  `funding_period` varchar(45) DEFAULT NULL,
  `funding_goal` varchar(45) DEFAULT NULL,
  `funding_likenum` varchar(45) DEFAULT NULL,
  `funding_category` varchar(45) DEFAULT NULL,
  `funding_schedule` longtext,
  `funding_intro` varchar(45) DEFAULT NULL,
  `funding_achieve` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`funding_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funding_reward`
--

DROP TABLE IF EXISTS `funding_reward`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funding_reward` (
  `reward_key` varchar(45) NOT NULL,
  `funding_key` varchar(45) DEFAULT NULL,
  `reward_name` varchar(45) DEFAULT NULL,
  `reward_price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`reward_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `funding_subs`
--

DROP TABLE IF EXISTS `funding_subs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funding_subs` (
  `funding_key` varchar(255) NOT NULL,
  `subs_title` varchar(255) NOT NULL,
  `subs_photo` varchar(255) NOT NULL,
  `subs_context` varchar(255) NOT NULL,
  PRIMARY KEY (`funding_key`,`subs_title`,`subs_photo`,`subs_context`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `point_history`
--

DROP TABLE IF EXISTS `point_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `point_history` (
  `history_key` varchar(45) NOT NULL,
  `history_title` varchar(45) DEFAULT NULL,
  `history_user` varchar(45) DEFAULT NULL,
  `history_year` varchar(45) DEFAULT NULL,
  `history_month` varchar(45) DEFAULT NULL,
  `history_day` varchar(45) DEFAULT NULL,
  `history_usedpoint` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`history_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `question_info`
--

DROP TABLE IF EXISTS `question_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `question_info` (
  `question_key` varchar(45) NOT NULL,
  `question_title` varchar(45) DEFAULT NULL,
  `question_user` varchar(45) DEFAULT NULL,
  `question_context` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`question_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sponsor_info`
--

DROP TABLE IF EXISTS `sponsor_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sponsor_info` (
  `user_key` varchar(45) NOT NULL,
  `sponsor_name` varchar(45) DEFAULT NULL,
  `sponsor_birth` varchar(45) DEFAULT NULL,
  `sponsor_gender` varchar(45) DEFAULT NULL,
  `sponsor_email` varchar(45) DEFAULT NULL,
  `sponsor_phone` varchar(45) DEFAULT NULL,
  `sponsor_address` varchar(45) DEFAULT NULL,
  `sponsor_address_detail` varchar(45) DEFAULT NULL,
  `sponsor_verifycode` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_info` (
  `user_key` varchar(45) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `user_birth` varchar(45) DEFAULT NULL,
  `user_gender` varchar(45) DEFAULT NULL,
  `user_email` varchar(45) DEFAULT NULL,
  `user_phone` varchar(45) DEFAULT NULL,
  `user_address` varchar(45) DEFAULT NULL,
  `user_address_detail` varchar(45) DEFAULT NULL,
  `user_point` varchar(45) DEFAULT '0',
  PRIMARY KEY (`user_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-11  4:48:12
