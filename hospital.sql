-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2025 at 11:38 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `patientId` int(11) NOT NULL,
  `patientName` varchar(150) NOT NULL,
  `patientPhone` varchar(250) NOT NULL,
  `patientAge` int(11) NOT NULL,
  `patientSex` varchar(10) NOT NULL,
  `patientAddress` varchar(100) NOT NULL,
  `patientDisease` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patientId`, `patientName`, `patientPhone`, `patientAge`, `patientSex`, `patientAddress`, `patientDisease`) VALUES
(10, 'Hiwot Asegdom', '0988997766', 43, 'Female', 'Debre Brhan', 'Malaria'),
(23, 'Habtamu Amare', '0988776655', 24, 'Male', 'Dessie', 'Hypertension');

-- --------------------------------------------------------

--
-- Table structure for table `patientinformation`
--

CREATE TABLE `patientinformation` (
  `id` int(11) NOT NULL,
  `patientId` int(11) NOT NULL,
  `symptom` varchar(500) NOT NULL,
  `diagnosis` varchar(500) NOT NULL,
  `medicine` varchar(500) NOT NULL,
  `wardRequired` varchar(50) DEFAULT NULL,
  `wardType` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patientinformation`
--

INSERT INTO `patientinformation` (`id`, `patientId`, `symptom`, `diagnosis`, `medicine`, `wardRequired`, `wardType`) VALUES
(4, 10, 'increasing body temprature', 'laboratory  test  ', 'anti-malaria ', 'no', '---'),
(5, 23, 'head ach', 'high  temprature around the brian', 'paracitamole', 'yes', 'Single');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userId` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `pasword` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userId`, `name`, `userName`, `pasword`, `role`) VALUES
(2, 'SEID ENDRIS', 'SEID', 'seid34', 'ADMIN'),
(4, 'Bilal Mulugeta', 'BILAL', 'bilal', 'DOCTOR');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`patientId`);

--
-- Indexes for table `patientinformation`
--
ALTER TABLE `patientinformation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `patientId` (`patientId`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userId`),
  ADD UNIQUE KEY `userName` (`userName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patientinformation`
--
ALTER TABLE `patientinformation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `patientinformation`
--
ALTER TABLE `patientinformation`
  ADD CONSTRAINT `patientinformation_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
