-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2021 at 04:32 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `phoenix_airline`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `U_id` int(10) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `grade_id` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`U_id`, `first_name`, `last_name`, `password`, `grade_id`, `email`, `user_type`) VALUES
(1, 'Sandali', 'Rajasuriya', '123', 'C01', 'sandalirajasuriya@gmail.com', 'client'),
(2, 'himalka', 'rajasuriya', '1234', 'C01', 'sandalirajasuriya@gmail.com', 'client'),
(3, 'dulara', 'vithana', 'dula', 'S01', 'dulara@staffg1.com', 'staff one'),
(4, 'thehara', 'vithana', 'theha123', 'S02', 'thehara@staffg2.com', 'staff two'),
(5, 'ruchika', 'wickramasinghe', '123', 'S01', 'ruchika@staffg1.com', 'staff one'),
(6, 'sandali', '', '123', 'A01', 'Sandali@admin.com', 'admin'),
(7, 'Chrishawn', 'Perera', '2001', 'C01', 'Chrishawn@gmail.com', NULL),
(8, 'Hiruni', 'Eshani', '1999', 'S01', 'Hiruni@staffg1.com', 'Staff Two'),
(9, 'Veranjana', 'Sooriarachchi', 'vsg2', 'S02', 'Verajana@staffg2.com', 'Staff Two'),
(10, 'nikila', 'gimhan', '123', 'C01', 'nikila@gmail.com', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`U_id`),
  ADD KEY `FKUser313312` (`grade_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `U_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FKUser313312` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
