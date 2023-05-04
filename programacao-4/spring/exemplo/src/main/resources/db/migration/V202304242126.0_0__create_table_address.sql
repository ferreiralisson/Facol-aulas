CREATE TABLE `address` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cep` varchar(10) DEFAULT NULL,
  `logradouro` varchar(255),
  `complemento` varchar(255),
  `bairro` varchar(255),
  `localidade` varchar(200),
  `uf` varchar(3),
  `gia` varchar(10),
  `ddd` varchar(15),
  `siafi` varchar(10),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
