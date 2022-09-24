-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: academias
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_academias`
--

DROP TABLE IF EXISTS `tb_academias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_academias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `telefono` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `web` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_academias`
--

LOCK TABLES `tb_academias` WRITE;
/*!40000 ALTER TABLE `tb_academias` DISABLE KEYS */;
INSERT INTO `tb_academias` VALUES (1,'Cibertec','980302648','Cibertec.com');
/*!40000 ALTER TABLE `tb_academias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_alumnos`
--

DROP TABLE IF EXISTS `tb_alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_alumnos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `apellido` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `telefono` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `academia_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `academia_id_idx` (`academia_id`),
  KEY `academia_id2_idx` (`academia_id`),
  CONSTRAINT `academia_id2` FOREIGN KEY (`academia_id`) REFERENCES `tb_academias` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_alumnos`
--

LOCK TABLES `tb_alumnos` WRITE;
/*!40000 ALTER TABLE `tb_alumnos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_alumnos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_alumnos_x_cursos`
--

DROP TABLE IF EXISTS `tb_alumnos_x_cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_alumnos_x_cursos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `alumno_id` int DEFAULT NULL,
  `curso_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `alumno_id_idx` (`alumno_id`),
  KEY `curso_idx` (`curso_id`),
  CONSTRAINT `alumno_id` FOREIGN KEY (`alumno_id`) REFERENCES `tb_alumnos` (`id`),
  CONSTRAINT `curso` FOREIGN KEY (`curso_id`) REFERENCES `tb_cursos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_alumnos_x_cursos`
--

LOCK TABLES `tb_alumnos_x_cursos` WRITE;
/*!40000 ALTER TABLE `tb_alumnos_x_cursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_alumnos_x_cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cursos`
--

DROP TABLE IF EXISTS `tb_cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cursos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `descripcion` text COLLATE utf8_bin,
  `profesor_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `profesor_id_idx` (`profesor_id`),
  CONSTRAINT `profesor_id` FOREIGN KEY (`profesor_id`) REFERENCES `tb_profesores` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cursos`
--

LOCK TABLES `tb_cursos` WRITE;
/*!40000 ALTER TABLE `tb_cursos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_notas`
--

DROP TABLE IF EXISTS `tb_notas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_notas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nota` float DEFAULT NULL,
  `curso_id` int DEFAULT NULL,
  `alumno_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `curso_id2_idx` (`curso_id`),
  KEY `alumno_id2_idx` (`alumno_id`),
  CONSTRAINT `alumno_id2` FOREIGN KEY (`alumno_id`) REFERENCES `tb_alumnos` (`id`),
  CONSTRAINT `curso_id2` FOREIGN KEY (`curso_id`) REFERENCES `tb_cursos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_notas`
--

LOCK TABLES `tb_notas` WRITE;
/*!40000 ALTER TABLE `tb_notas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_notas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_profesores`
--

DROP TABLE IF EXISTS `tb_profesores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_profesores` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `apellido` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `telefono` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `academia_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `academia_id_idx` (`academia_id`),
  CONSTRAINT `academia_id` FOREIGN KEY (`academia_id`) REFERENCES `tb_academias` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_profesores`
--

LOCK TABLES `tb_profesores` WRITE;
/*!40000 ALTER TABLE `tb_profesores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_profesores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'academias'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-24  8:48:58
