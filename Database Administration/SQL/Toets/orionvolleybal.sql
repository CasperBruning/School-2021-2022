-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Gegenereerd op: 20 feb 2022 om 14:36
-- Serverversie: 10.4.21-MariaDB
-- PHP-versie: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `orionvolleybal`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `coaches`
--

CREATE TABLE `coaches` (
  `coachnr` int(2) NOT NULL,
  `lidnr` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Gegevens worden geëxporteerd voor tabel `coaches`
--

INSERT INTO `coaches` (`coachnr`, `lidnr`) VALUES
(1, 1),
(2, 3),
(3, 18),
(4, 21),
(5, 25),
(6, 30);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `leden`
--

CREATE TABLE `leden` (
  `lidnr` int(3) NOT NULL,
  `lidvoornaam` varchar(20) NOT NULL,
  `lidtussenvoegsel` varchar(10) NOT NULL,
  `lidachternaam` varchar(25) NOT NULL,
  `lidgebdatum` date NOT NULL,
  `lidgeslacht` char(1) NOT NULL,
  `email` varchar(50) NOT NULL,
  `coach` tinyint(1) DEFAULT NULL,
  `trainer` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Gegevens worden geëxporteerd voor tabel `leden`
--

INSERT INTO `leden` (`lidnr`, `lidvoornaam`, `lidtussenvoegsel`, `lidachternaam`, `lidgebdatum`, `lidgeslacht`, `email`, `coach`, `trainer`) VALUES
(1, 'Jeffrey', 'de', 'Boer', '1986-02-18', 'm', 'j.boer@orion.nl', 1, 1),
(2, 'Francis', '', 'Rechters', '1976-03-12', 'v', 'r.rechters@orion.nl', 0, 1),
(3, 'Agnes', 'de', 'Bruijn', '1986-06-24', 'v', 'a.bruijn@orion.nl', 1, 0),
(4, 'Bert', 'van der', 'Pluijm', '2012-07-23', 'm', 'b.pluijm@orion.nl', 0, 0),
(5, 'Carla', '', 'Egberts', '1994-08-30', 'v', 'c.egberts@orion.nl', 0, 1),
(6, 'Hein', '', 'Pietersen', '1995-11-04', 'm', 'h.pietersen@orion.nl', 0, 0),
(7, 'Frank', '', 'Otterspeer', '1998-07-23', 'm', 'f.otterspeer@orion.nl', 0, 0),
(8, 'Gerda', '', 'Haverkamp', '1998-09-20', 'v', 'g.heverkamp@orion.nl', 0, 0),
(9, 'Els', '', 'Achterhoek', '1996-11-11', 'v', 'Achterhoek@orion.nl', 0, 0),
(10, 'Eveline', '', 'Tuitert', '2003-12-05', 'v', 'e.tuitert@orion.nl', 0, 0),
(11, 'Patricia', 'de', 'Pater', '2004-06-30', 'v', 'p.pater@orion.nl', 0, 0),
(12, 'Sandra', '', 'Kruitsteeg', '1997-01-12', 'v', 's.kruitsteeg@orion.nl', 0, 0),
(13, 'Jannie', '', 'Leegwater', '1994-03-15', 'v', 'j.leegwater@orion.nl', 0, 0),
(14, 'Lana', '', 'Strickwerda', '1989-10-03', 'v', 'l.strickwerda@orion.nl', 0, 0),
(15, 'Marja', '', 'Verstegen', '1985-08-14', 'v', 'm.verstegen@orion.nl', 0, 1),
(16, 'Nicolette', '', 'Slachter', '1994-09-17', 'v', 'n.slachter@orion.nl', 0, 0),
(17, 'Pauline', '', 'Pottebakker', '1998-07-23', 'v', 'p.potterbakker@orion.nl', 0, 0),
(18, 'Ria', '', 'Straver', '1993-10-30', 'v', 'r.straver@orion.nl', 1, 0),
(19, 'Thea', '', 'oortveld', '2001-07-08', 'v', 't.oortveld@orion.nl', 0, 0),
(20, 'Viola', '', 'Overdam', '2001-05-05', 'v', 'v.overdam@orion.nl', 0, 0),
(21, 'Zena', '', 'Arendsen', '2000-02-16', 'v', 'z.arendsen@orion.nl', 1, 0),
(22, 'Alex', '', 'Brummers', '2000-04-06', 'm', 'a.brummers@orion.nl', 0, 0),
(23, 'Lex', '', 'Overschie', '1999-01-26', 'm', 'l.overschie@orion.nl', 0, 0),
(24, 'Ferry', '', 'Kersenboom', '1992-11-12', 'm', 'f.kersenboom@orion.nl', 0, 0),
(25, 'Bart', '', 'Elschot', '1987-07-14', 'm', 'b.elschot@orion.nl', 1, 0),
(26, 'Kars', 'van', 'Welzenis', '1992-12-16', 'm', 'k.welzenis@orion.nl', 0, 0),
(27, 'Cees', '', 'Smit', '1991-05-21', 'm', 'c.smit@orion.nl', 0, 1),
(28, 'Mark', '', 'Uitkijk', '1997-06-25', 'm', 'm.uitkijk@orion.nl', 0, 0),
(29, 'Stefan', 'de', 'Zwart', '1989-08-06', 'm', 's.zwart@orion.nl', 0, 0),
(30, 'Dirk', '', 'Vriezen', '1984-09-20', 'm', 'd.vriezen@orion.nl', 1, 0),
(31, 'Otto', 'van', 'Lingen', '1985-05-31', 'm', 'o.lingen@orion.nl', 0, 0),
(32, 'Rick', '', 'Riesen', '1987-02-19', 'm', 'r.riesen@orion.nl', 0, 0),
(33, 'Nico', '', 'Slangenburg', '2001-12-03', 'm', 'n.slangenburg@orion.nl', 0, 0);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `teamindeling`
--

CREATE TABLE `teamindeling` (
  `teamnummer` int(2) NOT NULL,
  `lidnr` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Gegevens worden geëxporteerd voor tabel `teamindeling`
--

INSERT INTO `teamindeling` (`teamnummer`, `lidnr`) VALUES
(93, 2),
(93, 3),
(93, 5),
(93, 8),
(93, 9),
(93, 10),
(93, 12),
(93, 13),
(97, 11),
(97, 14),
(97, 15),
(97, 16),
(97, 17),
(97, 18),
(97, 19),
(97, 20),
(97, 21),
(98, 22),
(98, 23),
(98, 25),
(98, 28),
(98, 29),
(98, 30),
(98, 32),
(98, 33),
(99, 1),
(99, 4),
(99, 6),
(99, 7),
(99, 24),
(99, 26),
(99, 27),
(99, 31);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `teams`
--

CREATE TABLE `teams` (
  `teamnummer` int(2) NOT NULL,
  `teamcode` varchar(4) NOT NULL,
  `maxaantal` int(2) NOT NULL,
  `trainernr` int(2) DEFAULT NULL,
  `coachnr` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Gegevens worden geëxporteerd voor tabel `teams`
--

INSERT INTO `teams` (`teamnummer`, `teamcode`, `maxaantal`, `trainernr`, `coachnr`) VALUES
(93, 'ma1', 8, 1, 1),
(97, 'mb1', 10, 1, 2),
(98, 'ha1', 8, 3, 5),
(99, 'hb1', 10, 4, 6);

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `trainers`
--

CREATE TABLE `trainers` (
  `trainernr` int(2) NOT NULL,
  `lidnr` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Gegevens worden geëxporteerd voor tabel `trainers`
--

INSERT INTO `trainers` (`trainernr`, `lidnr`) VALUES
(1, 1),
(2, 2),
(3, 5),
(4, 15),
(5, 27);

--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `coaches`
--
ALTER TABLE `coaches`
  ADD PRIMARY KEY (`coachnr`);

--
-- Indexen voor tabel `leden`
--
ALTER TABLE `leden`
  ADD PRIMARY KEY (`lidnr`);

--
-- Indexen voor tabel `teamindeling`
--
ALTER TABLE `teamindeling`
  ADD PRIMARY KEY (`teamnummer`,`lidnr`),
  ADD KEY `lidnr` (`lidnr`);

--
-- Indexen voor tabel `teams`
--
ALTER TABLE `teams`
  ADD PRIMARY KEY (`teamnummer`),
  ADD KEY `coachnr` (`coachnr`),
  ADD KEY `trainernr` (`trainernr`);

--
-- Indexen voor tabel `trainers`
--
ALTER TABLE `trainers`
  ADD PRIMARY KEY (`trainernr`);

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `coaches`
--
ALTER TABLE `coaches`
  MODIFY `coachnr` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT voor een tabel `leden`
--
ALTER TABLE `leden`
  MODIFY `lidnr` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT voor een tabel `teams`
--
ALTER TABLE `teams`
  MODIFY `teamnummer` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=100;

--
-- AUTO_INCREMENT voor een tabel `trainers`
--
ALTER TABLE `trainers`
  MODIFY `trainernr` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Beperkingen voor geëxporteerde tabellen
--

--
-- Beperkingen voor tabel `teamindeling`
--
ALTER TABLE `teamindeling`
  ADD CONSTRAINT `teamindeling_ibfk_1` FOREIGN KEY (`lidnr`) REFERENCES `leden` (`lidnr`),
  ADD CONSTRAINT `teamindeling_ibfk_2` FOREIGN KEY (`teamnummer`) REFERENCES `teams` (`teamnummer`);

--
-- Beperkingen voor tabel `teams`
--
ALTER TABLE `teams`
  ADD CONSTRAINT `teams_ibfk_1` FOREIGN KEY (`trainernr`) REFERENCES `trainers` (`trainernr`),
  ADD CONSTRAINT `teams_ibfk_2` FOREIGN KEY (`coachnr`) REFERENCES `coaches` (`coachnr`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
