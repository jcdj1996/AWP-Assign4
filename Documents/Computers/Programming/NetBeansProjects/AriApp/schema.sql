-- phpMyAdmin SQL Dump
-- version 3.3.10.4
-- http://www.phpmyadmin.net
--
-- Host: sql.computerstudi.es
-- Generation Time: Dec 18, 2015 at 06:28 AM
-- Server version: 5.6.25
-- PHP Version: 5.5.26

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `gc020087918`
--

-- --------------------------------------------------------

--
-- Table structure for table `java_employee`
--

CREATE TABLE IF NOT EXISTS `java_employee` (
  `empID` int(8) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `fName` varchar(25) NOT NULL,
  `lName` varchar(25) NOT NULL,
  `dob` varchar(8) NOT NULL,
  `gender` varchar(12) NOT NULL,
  `add` varchar(35) NOT NULL,
  `city` varchar(25) NOT NULL,
  `postal` varchar(6) NOT NULL,
  `province` varchar(2) NOT NULL,
  `country` varchar(10) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `email` varchar(35) NOT NULL,
  `hireDate` varchar(8) NOT NULL,
  `payType` varchar(25) NOT NULL,
  `salary` double NOT NULL,
  `comm` double DEFAULT NULL,
  `position` varchar(30) NOT NULL,
  `department` varchar(30) NOT NULL,
  PRIMARY KEY (`empID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `java_employee`
--

INSERT INTO `java_employee` (`empID`, `fName`, `lName`, `dob`, `gender`, `add`, `city`, `postal`, `province`, `country`, `phone`, `email`, `hireDate`, `payType`, `salary`, `comm`, `position`, `department`) VALUES
(00000001, 'Test', 'Test', 'May14,19', 'female', '123 Boo Street', 'Sarnia', '1A2S3D', 'ON', 'Canada', '666-666-66', 'test@test.com', 'Jan 1, 2', 'salary', 25, 0, 'Administration', 'HR');
