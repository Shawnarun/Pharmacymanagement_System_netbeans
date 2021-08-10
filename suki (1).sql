-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2021 at 02:34 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `suki`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE `bank` (
  `describtion` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `amountcash` double DEFAULT NULL,
  `datecash` date DEFAULT NULL,
  `debitcash` double NOT NULL DEFAULT 0,
  `creaditcash` double NOT NULL DEFAULT 0,
  `cashid` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`describtion`, `amountcash`, `datecash`, `debitcash`, `creaditcash`, `cashid`) VALUES
('sales', 12360, '2021-06-11', 12360, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `cashinhand`
--

CREATE TABLE `cashinhand` (
  `describtion` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `amountcash` double DEFAULT NULL,
  `datecash` date DEFAULT NULL,
  `debitcash` double DEFAULT 0,
  `creaditcash` double DEFAULT 0,
  `cashid` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `cashinhand`
--

INSERT INTO `cashinhand` (`describtion`, `amountcash`, `datecash`, `debitcash`, `creaditcash`, `cashid`) VALUES
('sales', 14500, '2021-06-05', 0, 14500, 4),
('sales', 14500, '2021-06-05', 14500, 0, 8),
('sales', 25000, '2021-06-03', 0, 25000, 12),
('sales', 25000, '2021-06-05', 25000, 0, 13);

-- --------------------------------------------------------

--
-- Table structure for table `cheque`
--

CREATE TABLE `cheque` (
  `name` varchar(25) COLLATE utf8_bin NOT NULL,
  `idate` date NOT NULL,
  `rdate` date NOT NULL,
  `num` varchar(25) COLLATE utf8_bin NOT NULL,
  `chid` int(25) NOT NULL,
  `amount` double NOT NULL,
  `status` varchar(25) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `cheque`
--

INSERT INTO `cheque` (`name`, `idate`, `rdate`, `num`, `chid`, `amount`, `status`) VALUES
('Sharon David', '2021-06-05', '2021-06-18', '25', 4, 25600, 'Passed'),
('rajeevf', '2021-06-11', '2021-06-12', '123', 6, 1212, 'Passed');

-- --------------------------------------------------------

--
-- Table structure for table `distributors`
--

CREATE TABLE `distributors` (
  `coname` varchar(25) COLLATE utf8_bin NOT NULL,
  `cnum` varchar(25) COLLATE utf8_bin NOT NULL,
  `salesrn` varchar(25) COLLATE utf8_bin NOT NULL,
  `due` varchar(25) COLLATE utf8_bin DEFAULT 'No due',
  `did` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `distributors`
--

INSERT INTO `distributors` (`coname`, `cnum`, `salesrn`, `due`, `did`) VALUES
('Jana Bran', 'Contact No', 'Shawn', '30 Days', 1);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(25) COLLATE utf8_bin NOT NULL,
  `password` varchar(25) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('sharon', '123456'),
('s', 's');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `dname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `drid` varchar(50) COLLATE utf8_bin NOT NULL,
  `bname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `expdate` date DEFAULT NULL,
  `distributor` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `quantity` int(50) DEFAULT NULL,
  `unprice` double NOT NULL DEFAULT 0,
  `dedate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`dname`, `drid`, `bname`, `expdate`, `distributor`, `quantity`, `unprice`, `dedate`) VALUES
('pandol', '1', 'unilever', '2021-06-01', 'xyz', 100, 10, '2021-06-02');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bank`
--
ALTER TABLE `bank`
  ADD PRIMARY KEY (`cashid`);

--
-- Indexes for table `cashinhand`
--
ALTER TABLE `cashinhand`
  ADD PRIMARY KEY (`cashid`);

--
-- Indexes for table `cheque`
--
ALTER TABLE `cheque`
  ADD PRIMARY KEY (`chid`);

--
-- Indexes for table `distributors`
--
ALTER TABLE `distributors`
  ADD PRIMARY KEY (`did`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`drid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bank`
--
ALTER TABLE `bank`
  MODIFY `cashid` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `cashinhand`
--
ALTER TABLE `cashinhand`
  MODIFY `cashid` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `cheque`
--
ALTER TABLE `cheque`
  MODIFY `chid` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `distributors`
--
ALTER TABLE `distributors`
  MODIFY `did` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
