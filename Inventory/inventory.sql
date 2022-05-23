-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2022 at 05:09 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `dailysales`
--

CREATE TABLE `dailysales` (
  `id` int(11) NOT NULL,
  `transaction_number` varchar(32) NOT NULL,
  `description` varchar(16) NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `discount` double DEFAULT NULL,
  `total` double NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dailysales`
--

INSERT INTO `dailysales` (`id`, `transaction_number`, `description`, `price`, `quantity`, `discount`, `total`, `date`) VALUES
(24, '', 'Nescafe Classic', 38, 3, NULL, 114, '2022-05-04'),
(25, '202205040002', 'Nescafe Puro', 22, 5, NULL, 110, '2022-05-04'),
(26, '202205040003', 'Nescafe Classic', 38, 5, NULL, 190, '2022-05-04');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `product_code` varchar(16) NOT NULL,
  `product` varchar(16) NOT NULL,
  `category` varchar(16) NOT NULL,
  `price` double(11,0) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `product_code`, `product`, `category`, `price`, `quantity`) VALUES
(1, 'P0001', 'Nescafe Classic', 'Coffee', 38, 65),
(2, 'P0002', 'Nescafe Puro', 'Coffee', 22, 100);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `position` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `position`) VALUES
(1, 'cashier', '12345', 'cashier'),
(2, 'rubby', '123', 'cashier'),
(3, 'admin', '12345', 'admin'),
(4, 'clerk', '12345', 'inventory person');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dailysales`
--
ALTER TABLE `dailysales`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dailysales`
--
ALTER TABLE `dailysales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
