CREATE TABLE `blog` (
  `id` int AUTO_INCREMENT NOT NULL,
  `userId` int(11) unsigned NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` TEXT DEFAULT NULL,
  `lastUpdateTime` DATETIME DEFAULT now(),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `blog`(userId,title, content) VALUES (1,'博客标题1','博客正文1');
INSERT INTO `blog`(userId,title, content) VALUES (1,'博客标题2','博客正文2');
INSERT INTO `blog`(userId,title, content) VALUES (1,'博客标题3','博客正文3');
