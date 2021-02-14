-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : Dim 14 fév. 2021 à 16:08
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `mcdonalds`
--

-- --------------------------------------------------------

--
-- Structure de la table `cardfidele`
--

CREATE TABLE `cardfidele` (
  `id` bigint(20) NOT NULL,
  `pin` varchar(255) DEFAULT NULL,
  `points` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `cardfidele`
--

INSERT INTO `cardfidele` (`id`, `pin`, `points`) VALUES
(17, '1111', 0),
(19, '9362', 20);

-- --------------------------------------------------------

--
-- Structure de la table `categories`
--

CREATE TABLE `categories` (
  `id` bigint(20) NOT NULL,
  `categoryname` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `categories`
--

INSERT INTO `categories` (`id`, `categoryname`, `img`) VALUES
(1, 'MENU', 'menu.png'),
(2, 'SANDWISH', 'sandwish.png'),
(3, 'PETIT FAIM', 'faim.png'),
(4, 'SALADE', 'salade.png'),
(5, 'DESSERT', 'dessert.png'),
(6, 'BOISSON', 'boisson.png'),
(7, 'FRITE', 'frite.png'),
(8, 'SAUCE', 'sauce.png');

-- --------------------------------------------------------

--
-- Structure de la table `codepromos`
--

CREATE TABLE `codepromos` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `codestatus` bit(1) NOT NULL,
  `redu` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `codepromos`
--

INSERT INTO `codepromos` (`id`, `code`, `codestatus`, `redu`) VALUES
(14, 'AAAB', b'1', 45);

-- --------------------------------------------------------

--
-- Structure de la table `commandes`
--

CREATE TABLE `commandes` (
  `id` bigint(20) NOT NULL,
  `cardfidele` varchar(255) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `productid` bigint(20) DEFAULT NULL,
  `promocode` varchar(255) DEFAULT NULL,
  `quantite` int(11) NOT NULL,
  `tableserv` varchar(255) DEFAULT NULL,
  `way` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `commandes`
--

INSERT INTO `commandes` (`id`, `cardfidele`, `price`, `productid`, `promocode`, `quantite`, `tableserv`, `way`) VALUES
(20, '9362', 80, 23, '', 1, '1', 'in');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(21);

-- --------------------------------------------------------

--
-- Structure de la table `ingredients`
--

CREATE TABLE `ingredients` (
  `id` bigint(20) NOT NULL,
  `ingredient_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ingredients`
--

INSERT INTO `ingredients` (`id`, `ingredient_name`) VALUES
(1, '12 chicken McNuggets +3 Chicken Sticks+6 Croquettes fromage poivron+3 sauces au choix'),
(2, 'Sandwich choisi + Frite + boisson soda'),
(3, 'Sandwich choisi + mini salade + desert + Frite + boisson soda'),
(4, 'Sandwich choisi'),
(5, 'Wrap + Frite + boisson soda'),
(6, 'Salade choisi'),
(7, 'McFlurry Choisi'),
(8, 'Milk-shake Choisi'),
(9, 'boisson choisi'),
(10, 'Frite choisi'),
(11, 'Sauce choisi'),
(12, 'Brownie Choisi'),
(13, 'Nuggets choisi + frite + boisson soda');

-- --------------------------------------------------------

--
-- Structure de la table `products`
--

CREATE TABLE `products` (
  `id` bigint(20) NOT NULL,
  `id_ingredient` bigint(20) DEFAULT NULL,
  `id_subcategory` bigint(20) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `products`
--

INSERT INTO `products` (`id`, `id_ingredient`, `id_subcategory`, `img`, `product_name`, `product_price`) VALUES
(1, 1, 4, 'boite.png', 'Boite à Partager', 220),
(2, 2, 1, 'hamburger.png', 'Maxi Best Of (Hamburger)', 120),
(3, 2, 1, 'cheeseburger.png', 'Maxi Best Of (Cheeseburger)', 120),
(4, 2, 1, 'fishburger.png', 'Maxi Best Of (Fishburger)', 120),
(5, 2, 1, 'chickenburger.png', 'Maxi Best Of (Chickenburger)', 120),
(6, 2, 2, 'hamburger.png', 'Best Of (Hamburger)', 100),
(7, 2, 2, 'cheeseburger.png', 'Best Of (Cheeseburger)', 100),
(8, 2, 2, 'fishburger.png', 'Best Of (Fishburger)', 100),
(9, 2, 2, 'chickenburger.png', 'Best Of (Chickenburger)', 100),
(10, 3, 3, 'hamburger.png', 'Happy Meal (Hamburger)', 90),
(11, 3, 3, 'cheeseburger.png', 'Happy Meal (Cheeseburger)', 90),
(12, 3, 3, 'fishburger.png', 'Happy Meal (Fishburger)', 90),
(13, 3, 3, 'chickenburger.png', 'Happy Meal (Chickenburger)', 90),
(14, 4, 5, 'McWrap.png', 'Grand McWrap', 95),
(15, 4, 5, 'frommage.png', 'Recette frommage Fondu', 95),
(16, 4, 5, 'Bigchicken.png', 'Big chicken', 95),
(17, 4, 5, 'DoubleBigMac.png', 'DoubleBigMac', 95),
(18, 4, 5, 'RoyalChesse.png', 'Royal Chesse', 95),
(19, 4, 5, 'BigTasty.png', 'Big Tasty', 95),
(20, 4, 5, 'McChicken.png', 'McChicken', 95),
(21, 4, 5, 'Filet-on-Fish.png', 'Filet-on-Fish', 95),
(23, 2, 6, 'cheeseburger.png', 'CheesseBurger', 80),
(24, 2, 7, 'hamburger.png', 'Hamburger', 80),
(25, 2, 7, 'chickenburger.png', 'Chikenburger', 80),
(26, 13, 8, 'mcnugg.png', 'ChickenNuggets(x4)', 80),
(27, 13, 8, 'mcnugg.png', 'ChickenNuggets(x6)', 80),
(28, 13, 8, 'mcnugg.png', 'ChickenNuggets(x9)', 80),
(29, 5, 9, 'wrap.png', 'WrapMiel', 120),
(30, 6, 10, 'ital.png', 'Salade italienne', 60),
(31, 6, 10, 'cesar.png', 'Salade césar', 60),
(32, 6, 10, 'pecheur.png', 'Salade pécheur', 60),
(33, 7, 11, 'mcnature.png', 'McFlurry-Nature', 55),
(34, 7, 11, 'mckitkat.png', 'McFlurry-Kitkat', 55),
(35, 8, 12, 'mshake.png', 'Milk-Shake', 40),
(36, 12, 12, 'Brownie.png', 'Brownie', 40),
(37, 9, 13, 'boisson.png', 'Coca', 20),
(38, 9, 13, 'hawai.png', 'Hawai', 20),
(39, 9, 13, 'fanta.png', 'Fanta', 20),
(40, 9, 13, 'sprite.png', 'Sprite', 20),
(41, 9, 14, 'express.png', 'Expresso', 25),
(42, 9, 14, 'long.png', 'Long', 25),
(43, 9, 14, 'aulait.png', 'Au lait', 25),
(44, 9, 14, 'cappuc.png', 'Cappucci', 25),
(45, 10, 15, 'shouse.png', 'Steak house', 15),
(46, 10, 15, 'ftirepor.png', 'Frite portion', 15),
(47, 10, 16, 'sauce.png', 'BBQ', 15),
(48, 11, 16, 'sauce.png', 'Chinoise', 15),
(49, 11, 16, 'sauce.png', 'Ketchup', 15);

-- --------------------------------------------------------

--
-- Structure de la table `subcategories`
--

CREATE TABLE `subcategories` (
  `id` bigint(20) NOT NULL,
  `id_category` bigint(20) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `subcategory_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `subcategories`
--

INSERT INTO `subcategories` (`id`, `id_category`, `img`, `subcategory_name`) VALUES
(1, 1, 'maxi best.png', 'Maxi Best Of '),
(2, 1, 'best of.png', 'Best Of'),
(3, 1, 'happym.png', 'Happy Meal'),
(4, 1, 'other.png', 'Other(Menu)'),
(5, 2, 'other.png', 'Other(Sandwish)'),
(6, 3, 'mcheese.png', 'Menu cheese'),
(7, 3, 'mburger.png', 'Menu Burger'),
(8, 3, 'mcnugg.png', 'McNuggets'),
(9, 3, 'other.png', 'Other(Petit faim)'),
(10, 4, 'other.png', 'Other(Salade)'),
(11, 5, 'mflurry.png', 'McFlurry'),
(12, 5, 'other.png', 'Other(Dessert)'),
(13, 6, 'boisson.png', 'Soda'),
(14, 6, 'cafe.png', 'Café'),
(15, 7, 'other.png', 'Other(Frite)'),
(16, 8, 'other.png', 'Other(Sauce)');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `cardfidele`
--
ALTER TABLE `cardfidele`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `codepromos`
--
ALTER TABLE `codepromos`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `commandes`
--
ALTER TABLE `commandes`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `ingredients`
--
ALTER TABLE `ingredients`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `subcategories`
--
ALTER TABLE `subcategories`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
