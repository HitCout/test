-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1:3306
-- Время создания: Окт 29 2021 г., 07:14
-- Версия сервера: 8.0.19
-- Версия PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `cartsql`
--

-- --------------------------------------------------------

--
-- Структура таблицы `bucket`
--

CREATE TABLE `bucket` (
  `id` bigint NOT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `loginb` varchar(255) DEFAULT NULL,
  `names` varchar(255) DEFAULT NULL,
  `sum` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `bucket`
--

INSERT INTO `bucket` (`id`, `adress`, `loginb`, `names`, `sum`) VALUES
(21, 'Трудовая 8', 'ААС', 'Диск литой 6x14 4/100 ET49 D56.6:1|КОЛЕСО В СБОРЕ:1|NOKIAN TYRES Nordman SX 2:1|', '22500');

-- --------------------------------------------------------

--
-- Структура таблицы `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(22);

-- --------------------------------------------------------

--
-- Структура таблицы `product`
--

CREATE TABLE `product` (
  `id` bigint NOT NULL,
  `about` varchar(255) DEFAULT NULL,
  `bucket` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `opisanie` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `teg` varchar(255) DEFAULT NULL,
  `tegb` varchar(255) DEFAULT NULL,
  `tegg` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `product`
--

INSERT INTO `product` (`id`, `about`, `bucket`, `img`, `name`, `opisanie`, `price`, `teg`, `tegb`, `tegg`) VALUES
(12, 'Диск литой 6x14 4/100 ET49 D56.6', '', 'https://pubimg.4mycar.ru/images/0102c8d8240838cc67a3f82a1723635e4c2f170002.png', 'Диск литой 6x14 4/100 ET49 D56.6', 'Диаметр ЦО (DIA), мм 56.6/\r\nДиаметр, дюймы 14/\r\nКоличество отверстий 4/\r\nДиаметр окружности отверстий 100/\r\nВылет, мм 49/\r\nТип литой/\r\nШирина, дюймы 6', '2000 ', 'd', 'Adore', 'man'),
(13, 'КОЛЕСО В СБОРЕ', '', 'https://pubimg.4mycar.ru/images/091afd88f3f1d9a0fdf7f082ac311fa36eec290002.jpeg', 'КОЛЕСО В СБОРЕ', 'Диаметр ЦО (DIA), мм\r\n58.6/\r\nДиаметр, дюймы\r\n14/\r\nКоличество отверстий\r\n4/\r\nДиаметр окружности отверстий\r\n98/\r\nВылет, мм\r\n35/\r\nТип\r\nштампованный/\r\nШирина, дюймы\r\n5/\r\nВысота, мм\r\n381/\r\nДлина, мм\r\n381/\r\nМасса, кг\r\n7.2/\r\nЦвет\r\nЧерный/\r\nШирина, мм\r\n165', '2500', 'd', 'Baldi', 'man'),
(14, 'Диск литой 6x15 4/98 ET32 D58.6', '', 'https://pubimg.4mycar.ru/images/012473e4f7ce93f595a7bc50e896761f6c5fc80002.jpeg', 'Диск литой 6x15 4/98 ET32 D58.6', 'Диаметр ЦО (DIA), мм\r\n58.6/\r\nДиаметр, дюймы\r\n15/\r\nКоличество отверстий\r\n4/\r\nДиаметр окружности отверстий\r\n98/\r\nВылет, мм\r\n32/\r\nТип\r\nлитой/\r\nШирина, дюймы\r\n6/', '2 100', 'd', 'Cactus', 'wman'),
(15, 'NOKIAN TYRES Nordman SX 2', '', 'https://pubimg.4mycar.ru/images/02f9c5d7567a7c1f9967e3cd60a860141c39500002.jpeg', 'NOKIAN TYRES Nordman SX 2', 'Бренд\r\nNOKIAN TYRES/\r\nМодель\r\nNordman SX 2/\r\nДиаметр, дюймы\r\n15/\r\nВысота профиля, %\r\n65/\r\nШирина, мм\r\n185/\r\nСезонность\r\nлетняя/\r\nВысота, мм\r\n622', '18000', 'l', 'Daigo', 'man'),
(16, 'NOKIAN TYRES Nordman SX 2', '', 'https://pubimg.4mycar.ru/images/02f9c5d7567a7c1f9967e3cd60a860141c39500002.jpeg', 'NOKIAN TYRES Nordman SX 2', '\r\nМодель\r\nNordman SX 2/\r\nДиаметр, дюймы\r\n15/\r\nВысота профиля, %\r\n65/\r\nШирина, мм\r\n195/\r\nСезонность\r\nлетняя/\r\nВысота, мм\r\n635/', '15 000', 'l', 'Cactus', 'wman'),
(17, 'Батарея аккумуляторная 60А/ч 500А 12В обратная поляр. стандартные (Европа) клеммы', '', 'https://pubimg.4mycar.ru/images/00be92c5f9be4a055ed6c02c64375a176514310002.jpeg', 'Батарея аккумуляторная 60А/ч 500А 12В обратная поляр. стандартные (Европа) клеммы', 'Бренд\r\nBOLK/\r\nВысота, мм\r\n190/\r\nДлина, мм\r\n242/\r\nМасса, кг\r\n16.4/\r\nМодель\r\nStandart/\r\nНоминальная ёмкость, А/ч\r\n60/\r\nНоминальное напряжение, В\r\n12В', '15 000', 'v', 'Baldi', 'man'),
(18, 'Батарея аккумуляторная 70А/ч 720А 12V обратная поляр. стандартные клеммы', '', 'https://pubimg.4mycar.ru/images/06aa3494085c2fbf6badbdbf07322d26a011880002.jpeg', 'Батарея аккумуляторная 70А/ч 720А 12V обратная поляр. стандартные клеммы', 'Бренд\r\nRENAULT/\r\nВысота, мм\r\n170/\r\nДлина, мм\r\n275/\r\nМасса, кг\r\n18.5/\r\nНоминальная ёмкость, А/ч\r\n70/\r\nНоминальное напряжение, В\r\n12В', '17 000', 'v', 'Daigo', 'wman'),
(19, '623 Масло гидравлическое LUXE Gidro-R минерал. (1л)/15', '', 'https://pubimg.4mycar.ru/images/0697d7d0acdca1e1f92b7625abe56793998aa40002.jpeg', 'Масло гидравлическое OIL RIGHT ВМГ3 (20л)', 'Бренд\r\nOILRIGHT/\r\nВысота, мм\r\n404/\r\nДлина, мм\r\n258/\r\nМасса, кг\r\n16.4', '2000 ', 'm', 'Daigo', 'wman'),
(20, 'Свеча зажигания', '', 'https://pubimg.4mycar.ru/images/0880956e9e793cb247a956aeb502ff0be91c5f0002.png', 'Свеча зажигания', 'Б/У Свеча зажигания', '100', 'm', 'Adore', 'man');

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `id` bigint NOT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `fio` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nomer` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `adress`, `fio`, `login`, `nomer`, `pass`) VALUES
(2, 'Трудовая 8', 'ААС', 'ken123@bk.ru', '+79638155550', '123');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `bucket`
--
ALTER TABLE `bucket`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
