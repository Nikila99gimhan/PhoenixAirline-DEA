-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 28, 2021 at 05:04 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.31

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
-- Table structure for table `activity`
--

CREATE TABLE `activity` (
  `lat_login_time` datetime DEFAULT NULL,
  `u_id` int(10) NOT NULL,
  `functionfunction_id` int(10) NOT NULL,
  `ip_address` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `booking_id` int(10) NOT NULL,
  `u_id` int(10) NOT NULL,
  `total_price` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`booking_id`, `u_id`, `total_price`) VALUES
(111, 4, '$70');

-- --------------------------------------------------------

--
-- Table structure for table `flight`
--

CREATE TABLE `flight` (
  `flight_no` int(255) NOT NULL,
  `departure` date DEFAULT NULL,
  `returnd` date DEFAULT NULL,
  `airport` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `eco_seat_no` int(11) DEFAULT NULL,
  `bclass_seat_no` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `flight`
--

INSERT INTO `flight` (`flight_no`, `departure`, `returnd`, `airport`, `destination`, `eco_seat_no`, `bclass_seat_no`) VALUES
(1, '2021-04-27', '2021-04-29', 'Katunayake', 'Istambul', 10, 200),
(2, '2021-04-28', '2021-04-29', 'russia', 'mosko', 10, 200),
(3, '2021-05-03', '2021-04-30', 'russia', 'cairo', NULL, 200),
(5, '2021-05-01', '2021-04-28', 'turkey', 'istambul', NULL, 12),
(102, '2021-04-30', '2021-04-27', 'turkey', 'cairo', 300, 10),
(104, '2021-04-30', '2021-04-27', 'russia', 'cairo', 300, 10);

-- --------------------------------------------------------

--
-- Table structure for table `function`
--

CREATE TABLE `function` (
  `function_id` int(10) NOT NULL,
  `function_desc` varchar(255) DEFAULT NULL,
  `u_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `grade`
--

CREATE TABLE `grade` (
  `grade_id` int(10) NOT NULL,
  `grade_desc` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `grade`
--

INSERT INTO `grade` (`grade_id`, `grade_desc`) VALUES
(3, 'client'),
(4, 'staff_01'),
(5, 'staff_02'),
(6, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `grade_function`
--

CREATE TABLE `grade_function` (
  `grade_id` int(10) NOT NULL,
  `function_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `seat`
--

CREATE TABLE `seat` (
  `seat_no` int(10) NOT NULL,
  `flight_no` int(10) NOT NULL,
  `class_id` int(10) NOT NULL,
  `class_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seat`
--

INSERT INTO `seat` (`seat_no`, `flight_no`, `class_id`, `class_name`) VALUES
(54, 104, 2, 'Economy class');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `ticket_id` int(10) NOT NULL,
  `seat_no` int(11) NOT NULL,
  `flight_no` int(10) NOT NULL,
  `booking_id` int(10) NOT NULL,
  `price` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`ticket_id`, `seat_no`, `flight_no`, `booking_id`, `price`, `date`) VALUES
(123, 54, 104, 111, '$70', '2021-04-30');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `u_id` int(10) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `grade_id` int(10) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_id`, `first_name`, `last_name`, `password`, `grade_id`, `email`, `user_type`) VALUES
(3, 'nikila', 'gimhan', '1234', 3, 'nikila@h.com', NULL),
(4, 'gimhan', 'asasdasd', '123', 3, 'gimhan@client.com', NULL),
(5, 'gimhan', 'sdfsdf', '123', 4, 'gimhan@staffg1.com', NULL),
(6, 'gimhan', 'fernando', '123', 3, 'gimhan@gmail.com', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`booking_id`),
  ADD KEY `FKbooking492632` (`u_id`);

--
-- Indexes for table `flight`
--
ALTER TABLE `flight`
  ADD PRIMARY KEY (`flight_no`);

--
-- Indexes for table `function`
--
ALTER TABLE `function`
  ADD PRIMARY KEY (`function_id`),
  ADD KEY `FKfunction868122` (`u_id`);

--
-- Indexes for table `grade`
--
ALTER TABLE `grade`
  ADD PRIMARY KEY (`grade_id`);

--
-- Indexes for table `grade_function`
--
ALTER TABLE `grade_function`
  ADD PRIMARY KEY (`grade_id`,`function_id`),
  ADD KEY `FKgrade_func917098` (`function_id`);

--
-- Indexes for table `seat`
--
ALTER TABLE `seat`
  ADD PRIMARY KEY (`seat_no`,`flight_no`),
  ADD KEY `FKseat102183` (`flight_no`);

--
-- Indexes for table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`ticket_id`),
  ADD KEY `FKticket766624` (`seat_no`,`flight_no`),
  ADD KEY `FKticket572359` (`booking_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`),
  ADD KEY `FKUser313312` (`grade_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `booking_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1012;

--
-- AUTO_INCREMENT for table `function`
--
ALTER TABLE `function`
  MODIFY `function_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `grade`
--
ALTER TABLE `grade`
  MODIFY `grade_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `ticket`
--
ALTER TABLE `ticket`
  MODIFY `ticket_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `activity`
--
ALTER TABLE `activity`
  ADD CONSTRAINT `FKactivity162218` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`);

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `FKbooking492632` FOREIGN KEY (`u_id`) REFERENCES `user` (`u_id`);

--
-- Constraints for table `function`
--
ALTER TABLE `function`
  ADD CONSTRAINT `FKfunction868122` FOREIGN KEY (`u_id`) REFERENCES `activity` (`u_id`);

--
-- Constraints for table `grade_function`
--
ALTER TABLE `grade_function`
  ADD CONSTRAINT `FKgrade_func394293` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`),
  ADD CONSTRAINT `FKgrade_func917098` FOREIGN KEY (`function_id`) REFERENCES `function` (`function_id`);

--
-- Constraints for table `seat`
--
ALTER TABLE `seat`
  ADD CONSTRAINT `FKseat102183` FOREIGN KEY (`flight_no`) REFERENCES `flight` (`flight_no`);

--
-- Constraints for table `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `FKticket572359` FOREIGN KEY (`booking_id`) REFERENCES `booking` (`booking_id`),
  ADD CONSTRAINT `FKticket766624` FOREIGN KEY (`seat_no`,`flight_no`) REFERENCES `seat` (`seat_no`, `flight_no`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FKUser313312` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
