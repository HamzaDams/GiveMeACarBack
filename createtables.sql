-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 23 fév. 2021 à 15:44
-- Version du serveur :  5.7.31
-- Version de PHP : 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `dbgiveme`
--

-- --------------------------------------------------------

--
-- Structure de la table `agence`
--

DROP TABLE IF EXISTS `agence`;
CREATE TABLE IF NOT EXISTS `agence` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `administrateur` varchar(255) DEFAULT NULL,
    `adresse` varchar(255) DEFAULT NULL,
    `is_siege` bit(1) NOT NULL,
    `ville` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


--
-- Structure de la table `agence_list_contrat`
--

DROP TABLE IF EXISTS `agence_list_contrat`;
CREATE TABLE IF NOT EXISTS `agence_list_contrat` (
    `id` bigint(20) NOT NULL,
    `contrat_id` bigint(20) NOT NULL,
    UNIQUE KEY `UK_so9aodh88ssfmcsckelrnno1v` (`contrat_id`),
    KEY `FKb9a5v90br9w0w8a5xosgs4v8n` (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `carte_bancaire`
--

DROP TABLE IF EXISTS `carte_bancaire`;
CREATE TABLE IF NOT EXISTS `carte_bancaire` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `cvv` int(11) NOT NULL,
    `date_expiration` varchar(255) DEFAULT NULL,
    `num_carte_bancaire` int(11) NOT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `client_givemeacar`
--

DROP TABLE IF EXISTS `client_givemeacar`;
CREATE TABLE IF NOT EXISTS `client_givemeacar` (
    `client_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `adresse` varchar(255) DEFAULT NULL,
    `mot_de_passe` varchar(255) DEFAULT NULL,
    `nom` varchar(255) DEFAULT NULL,
    `prenom` varchar(255) DEFAULT NULL,
    `carte_bancaire_id` bigint(20) DEFAULT NULL,
    `forfait_id` bigint(20) DEFAULT NULL,
    PRIMARY KEY (`client_id`),
    KEY `FK4c8yu3bks84w4uswbh2bptgrq` (`carte_bancaire_id`),
    KEY `FK4suhif7owhevjlu6pjsdo67r1` (`forfait_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `contrat_location`
--

DROP TABLE IF EXISTS `contrat_location`;
CREATE TABLE IF NOT EXISTS `contrat_location` (
    `contrat_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `carte_bancaire_id` varchar(255) DEFAULT NULL,
    `date` datetime(6) DEFAULT NULL,
    `tarfication` int(11) NOT NULL,
    `client_client_id` bigint(20) DEFAULT NULL,
    PRIMARY KEY (`contrat_id`),
    KEY `FKrvpyksqfaphw1q947n27mqdt6` (`client_client_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `forfait`
--

DROP TABLE IF EXISTS `forfait`;
CREATE TABLE IF NOT EXISTS `forfait` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `nom` varchar(255) DEFAULT NULL,
    `prix` int(11) NOT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `list_location`
--

DROP TABLE IF EXISTS `list_location`;
CREATE TABLE IF NOT EXISTS `list_location` (
    `id` bigint(20) NOT NULL,
    `location_id` bigint(20) NOT NULL,
    UNIQUE KEY `UK_rheljok0km7b63gn0i64jgrcv` (`location_id`),
    KEY `FKa5g6af88pwmxoeqprl8ld8xlg` (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `location_vehicule`
--

DROP TABLE IF EXISTS `location_vehicule`;
CREATE TABLE IF NOT EXISTS `location_vehicule` (
    `location_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `debut_date_horaire_location` datetime(6) DEFAULT NULL,
    `debut_localisation_gps` varchar(255) DEFAULT NULL,
    `fin_date_horaire_location` datetime(6) DEFAULT NULL,
    `fin_localisation_gps` varchar(255) DEFAULT NULL,
    `vehicule_id_vehicule_id` bigint(20) DEFAULT NULL,
    PRIMARY KEY (`location_id`),
    KEY `FKf0b4ixs00yus1rgqyk6evrnqd` (`vehicule_id_vehicule_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `stock_agence`
--

DROP TABLE IF EXISTS `stock_agence`;
CREATE TABLE IF NOT EXISTS `stock_agence` (
    `id` bigint(20) NOT NULL,
    `vehicule_id` bigint(20) NOT NULL,
    UNIQUE KEY `UK_mgrjb0bke03drptgmgfn2jlmx` (`vehicule_id`),
    KEY `FKnx09myo4quyuom2ilj4u79k2r` (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

DROP TABLE IF EXISTS `vehicule`;
CREATE TABLE IF NOT EXISTS `vehicule` (
    `vehicule_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `couleur` varchar(255) DEFAULT NULL,
    `etat` bit(1) DEFAULT NULL,
    `immat` varchar(255) DEFAULT NULL,
    `kilometrage` int(11) NOT NULL,
    `localisation` varchar(255) DEFAULT NULL,
    `marque` varchar(255) DEFAULT NULL,
    `modele` varchar(255) DEFAULT NULL,
    `niv_carburant` int(11) NOT NULL,
    `id` bigint(20) DEFAULT NULL,
    PRIMARY KEY (`vehicule_id`),
    KEY `FKcowrq6uxhkuostw4rukuu2d3n` (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Contraintes pour la table `agence_list_contrat`
--
ALTER TABLE `agence_list_contrat`
    ADD CONSTRAINT `FK4sl032si74iejtm30p4cg3jom` FOREIGN KEY (`contrat_id`) REFERENCES `contrat_location` (`contrat_id`),
    ADD CONSTRAINT `FKb9a5v90br9w0w8a5xosgs4v8n` FOREIGN KEY (`id`) REFERENCES `agence` (`id`);

--
-- Contraintes pour la table `client_givemeacar`
--
ALTER TABLE `client_givemeacar`
    ADD CONSTRAINT `FK4c8yu3bks84w4uswbh2bptgrq` FOREIGN KEY (`carte_bancaire_id`) REFERENCES `carte_bancaire` (`id`),
    ADD CONSTRAINT `FK4suhif7owhevjlu6pjsdo67r1` FOREIGN KEY (`forfait_id`) REFERENCES `forfait` (`id`);

--
-- Contraintes pour la table `contrat_location`
--
ALTER TABLE `contrat_location`
    ADD CONSTRAINT `FKrvpyksqfaphw1q947n27mqdt6` FOREIGN KEY (`client_client_id`) REFERENCES `client_givemeacar` (`client_id`);

--
-- Contraintes pour la table `list_location`
--
ALTER TABLE `list_location`
    ADD CONSTRAINT `FKa5g6af88pwmxoeqprl8ld8xlg` FOREIGN KEY (`id`) REFERENCES `client_givemeacar` (`client_id`),
    ADD CONSTRAINT `FKe311walvi2lv17npx8i8duti2` FOREIGN KEY (`location_id`) REFERENCES `location_vehicule` (`location_id`);

--
-- Contraintes pour la table `location_vehicule`
--
ALTER TABLE `location_vehicule`
    ADD CONSTRAINT `FKf0b4ixs00yus1rgqyk6evrnqd` FOREIGN KEY (`vehicule_id_vehicule_id`) REFERENCES `vehicule` (`vehicule_id`);

--
-- Contraintes pour la table `stock_agence`
--
ALTER TABLE `stock_agence`
    ADD CONSTRAINT `FK9x0axdmfniaqej92c6bdqgk8` FOREIGN KEY (`vehicule_id`) REFERENCES `vehicule` (`vehicule_id`),
    ADD CONSTRAINT `FKnx09myo4quyuom2ilj4u79k2r` FOREIGN KEY (`id`) REFERENCES `agence` (`id`);

--
-- Contraintes pour la table `vehicule`
--
ALTER TABLE `vehicule`
    ADD CONSTRAINT `FKcowrq6uxhkuostw4rukuu2d3n` FOREIGN KEY (`id`) REFERENCES `agence` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;