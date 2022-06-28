-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-09-2021 a las 06:16:04
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `academico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `codigo` int(11) NOT NULL,
  `id` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `grado` int(11) NOT NULL,
  `nota1` double(10,2) DEFAULT 0.00,
  `nota2` double(10,2) DEFAULT 0.00,
  `nota3` double(10,2) DEFAULT 0.00,
  `promedio` double(10,2) DEFAULT 0.00,
  `descuento` double(10,2) DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`codigo`, `id`, `grado`, `nota1`, `nota2`, `nota3`, `promedio`, `descuento`) VALUES
(0, '11532224', 5, 4.50, 4.20, 4.80, 4.53, 226800.00),
(36, '101111', 1, 3.40, 3.40, 3.40, NULL, NULL),
(37, '102222', 2, 0.00, 0.00, 0.00, NULL, NULL),
(38, '103333', 4, 4.50, 3.20, 2.80, 3.43, 126000.00),
(39, '249999444', 10, 4.50, 4.60, 4.70, 4.61, 226800.00);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `codigo` int(11) NOT NULL,
  `tipoDocumento` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `id` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `nombres` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `nacionalidad` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `celular` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `edad` int(11) NOT NULL,
  `estrato` int(11) DEFAULT NULL,
  `estado` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`codigo`, `tipoDocumento`, `id`, `nombres`, `apellidos`, `nacionalidad`, `direccion`, `celular`, `edad`, `estrato`, `estado`) VALUES
(36, 'TI', '101111', 'aurelio', 'tamayo', 'Ext', 'altos de  uno', '3216136666', 11, 1, 'ACTIVO'),
(37, 'TI', '102222', 'camilo', 'vasquez', 'Nal', 'altos de  dos', '321222222', 12, 2, 'ACTIVO'),
(38, 'TI', '103333', 'ramiro', 'perez', 'Nal', 'altos de  tres', '3212323', 13, 3, 'ACTIVO'),
(39, 'CE', '249999444', 'elena', 'cruz', 'Ext', 'jardines locos', '32455555', 22, 5, 'ACTIVO'),
(40, 'TI', '11532224', 'wilder', 'certuche', 'Ext', 'cali valle', '3215544', 36, 6, 'ACTIVO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
