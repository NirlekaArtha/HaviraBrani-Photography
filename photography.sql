/*M!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19  Distrib 10.11.13-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: photography
-- ------------------------------------------------------
-- Server version	10.11.13-MariaDB-0ubuntu0.24.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `ID_Invoice` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Jadwal` int(11) DEFAULT NULL,
  `Biaya_Lainnya` int(11) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Invoice`),
  KEY `ID_Jadwal` (`ID_Jadwal`),
  CONSTRAINT `invoice_ibfk_4` FOREIGN KEY (`ID_Jadwal`) REFERENCES `jadwal_foto` (`ID_Jadwal`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES
(1,1,100000,10100000),
(2,5,990000,10990000);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jadwal_foto`
--

DROP TABLE IF EXISTS `jadwal_foto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `jadwal_foto` (
  `ID_Jadwal` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Pelanggan` int(11) DEFAULT NULL,
  `ID_Fotografer` int(11) DEFAULT NULL,
  `Tanggal_Waktu` datetime DEFAULT NULL,
  `Lokasi` varchar(500) DEFAULT NULL,
  `Tanggal_Booking` date DEFAULT NULL,
  `ID_Paket` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Jadwal`),
  KEY `ID_Pelanggan` (`ID_Pelanggan`),
  KEY `ID_Fotografer` (`ID_Fotografer`),
  KEY `ID_Paket` (`ID_Paket`),
  CONSTRAINT `jadwal_foto_ibfk_1` FOREIGN KEY (`ID_Pelanggan`) REFERENCES `pelanggan` (`ID_Pelanggan`),
  CONSTRAINT `jadwal_foto_ibfk_2` FOREIGN KEY (`ID_Fotografer`) REFERENCES `pegawai` (`ID_Pegawai`),
  CONSTRAINT `jadwal_foto_ibfk_3` FOREIGN KEY (`ID_Paket`) REFERENCES `paket` (`ID_Paket`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jadwal_foto`
--

LOCK TABLES `jadwal_foto` WRITE;
/*!40000 ALTER TABLE `jadwal_foto` DISABLE KEYS */;
INSERT INTO `jadwal_foto` VALUES
(1,3,6,'2025-06-24 19:00:00','Gedung B unpam','2025-06-24',1),
(3,2,3,'2025-06-27 14:00:00','di jonggol','2025-06-08',2),
(4,3,6,'2025-06-30 18:00:00','Perumahan Alam mbah dukun','2025-06-02',3),
(5,2,6,'2025-06-30 18:30:00','Perumahan Alam mbah surip','2025-06-02',3);
/*!40000 ALTER TABLE `jadwal_foto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paket`
--

DROP TABLE IF EXISTS `paket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `paket` (
  `ID_Paket` int(11) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(64) DEFAULT NULL,
  `Harga` int(11) DEFAULT NULL,
  `Deskripsi` text DEFAULT NULL,
  `DP` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Paket`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paket`
--

LOCK TABLES `paket` WRITE;
/*!40000 ALTER TABLE `paket` DISABLE KEYS */;
INSERT INTO `paket` VALUES
(1,'Lite',500000,'deskrippsi dummy\nbiasalah hehee\n',100000),
(2,'Pertamax',10000000,'deskrippsi dummy\nbiasalah hehee\nCihuyyaaa',300000),
(3,'Premium',700000,'deskrippsi dummy\nbiasalah hehee\nCihuyyaaa',100000);
/*!40000 ALTER TABLE `paket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pegawai`
--

DROP TABLE IF EXISTS `pegawai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `pegawai` (
  `ID_Pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `Jabatan` varchar(32) DEFAULT NULL,
  `Nama` varchar(64) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Tanggal_Gabung` date DEFAULT NULL,
  `Alamat` varchar(500) DEFAULT NULL,
  `Telepon` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ID_Pegawai`),
  UNIQUE KEY `Nama` (`Nama`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pegawai`
--

LOCK TABLES `pegawai` WRITE;
/*!40000 ALTER TABLE `pegawai` DISABLE KEYS */;
INSERT INTO `pegawai` VALUES
(1,'admin','Hafizh','Laki-Laki','2025-06-17','Muncul','08994515511'),
(3,'fotografer','Alvito','Laki-Laki','2025-06-17','Parung Panjang','089654657816'),
(5,'fotografer','Laylania','Perempuan','2025-06-19','Depok','089999999999'),
(6,'fotografer','Hafizah','Perempuan','2019-06-08','karawang','08994555511'),
(7,'admin','Milad','Perempuan','2013-06-21','Bandung','08524555511');
/*!40000 ALTER TABLE `pegawai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pelanggan`
--

DROP TABLE IF EXISTS `pelanggan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `pelanggan` (
  `ID_Pelanggan` int(11) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(64) DEFAULT NULL,
  `Telepon` varchar(15) DEFAULT NULL,
  `Jenis_Kelamin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_Pelanggan`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pelanggan`
--

LOCK TABLES `pelanggan` WRITE;
/*!40000 ALTER TABLE `pelanggan` DISABLE KEYS */;
INSERT INTO `pelanggan` VALUES
(2,'gilang','089912344321','Laki-Laki'),
(3,'Latifah','089912912321','Perempuan');
/*!40000 ALTER TABLE `pelanggan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID_User` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Pegawai` int(11) NOT NULL,
  `Nama_User` varchar(64) NOT NULL,
  `Password_Hash` varchar(64) DEFAULT NULL,
  `Is_Admin` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID_User`),
  UNIQUE KEY `Nama_User` (`Nama_User`),
  KEY `ID_Pegawai` (`ID_Pegawai`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`ID_Pegawai`) REFERENCES `pegawai` (`ID_Pegawai`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES
(1,1,'nirleka','240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9',1),
(3,3,'saughto','2d5e92edb981bb426429c3aa2d57d9ed550a1b1637bcd1996512ccd1ca9dc723',0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-07-02 21:02:09
