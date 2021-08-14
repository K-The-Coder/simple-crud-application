-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 14, 2021 at 06:52 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employeedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp_management`
--

CREATE TABLE `emp_management` (
  `id` int(100) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp_management`
--

INSERT INTO `emp_management` (`id`, `full_name`, `password`, `email`, `country`) VALUES
(1, 'Keke', '91dfd9ddb4198affc5c194cd8ce6d338fde470e2', 'kk@mail.com', 'South Africa'),
(3, 'John Daniels', 'c575bfc5ef97d93c218a0d47a2b65011ca1348fa', 'john@mail.com', 'USA'),
(4, 'Mabule', '310440334b7cee3e34f0d3d2250efa5c99c89d38', 'km@email.com', 'South Africa'),
(6, 'John Doe', 'c575bfc5ef97d93c218a0d47a2b65011ca1348fa', 'jd@thismail.com', 'USA'),
(7, 'Jim Row', 'e916f56bdaa7e391abfb54ef46bf485aa91503d9', 'jr@thisemail.com', 'USA'),
(8, 'JonnyB', '155b2b260ba5a59b205dec66636d7a0427ece4d4', 'jb@thismail.com', 'South Africa'),
(11, 'Jackie Chan', '57c67f6fe95dd64fdd0f2c6b57cc01a91a9c02ee', 'jc@mail.com', 'South Africa'),
(12, 'Tony Stark', '466cca774323275df1ec9cbb8425b23d062331cb', 'ts@starkindustries.com', 'USA'),
(13, 'Zuma Jacob', 'ded89dfe44c6ee74a38e87987badd3aa1ae62a1f', 'jz@gmail.com', 'South Africa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emp_management`
--
ALTER TABLE `emp_management`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `emp_management`
--
ALTER TABLE `emp_management`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
