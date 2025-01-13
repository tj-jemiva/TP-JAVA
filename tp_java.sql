-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 13 jan. 2025 à 17:39
-- Version du serveur : 9.1.0
-- Version de PHP : 8.3.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tp_java`
--

-- --------------------------------------------------------

--
-- Structure de la table `solutions`
--

DROP TABLE IF EXISTS `solutions`;
CREATE TABLE IF NOT EXISTS `solutions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `coefficient_a` double NOT NULL,
  `coefficient_b` double NOT NULL,
  `coefficient_c` double NOT NULL,
  `solution` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `solutions`
--

INSERT INTO `solutions` (`id`, `coefficient_a`, `coefficient_b`, `coefficient_c`, `solution`) VALUES
(1, 1, 2, 0, 'Deux solutions: S = {0.0, -2.0}'),
(2, 0, 1, 0, 'Pas une équation de second degré (a = 0)'),
(3, -1, 0, -2, '0.0 ± -1.4142135623730951i'),
(4, -1, 1, -1, '0.5 ± -0.8660254037844386i'),
(5, -1, 3, 0, 'Deux solutions: S = {-0.0, 3.0}');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

DROP TABLE IF EXISTS `utilisateurs`;
CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `sexe` varchar(255) NOT NULL,
  `tel` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`id`, `nom`, `sexe`, `tel`) VALUES
(1, 'Jemiva Escard', 'Masculin', 322482929),
(2, 'Rakotoson', 'Masculin', 343236535),
(3, 'Rasoa', 'Feminin', 333233325),
(4, 'Anita', 'Feminin', 23554562),
(5, '', '', 0),
(6, '', '', 0),
(7, 'Rome', 'F', 340714652),
(8, 'Chamir', 'F', 325658454),
(9, 'Jemi', 'M', 236521458);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
