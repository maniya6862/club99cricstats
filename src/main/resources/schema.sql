--
-- Table structure for table `batting_style`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `batting_style` (
  `id` int NOT NULL,
  `style` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bowling_style` (
  `id` int NOT NULL,
  `style` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

--
-- Table structure for table `player`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `batting` varchar(12) DEFAULT NULL,
  `bowling` varchar(12) DEFAULT NULL,
  `phone` varchar(12) DEFAULT NULL,
  `age` int DEFAULT '20',
  PRIMARY KEY (`id`)
);


--
-- Table structure for table `team_bowling`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team_bowling` (
  `id` int NOT NULL,
  `match_id` int DEFAULT NULL,
  `player_id` int DEFAULT NULL,
  `over_no` int DEFAULT NULL,
  `scores` int DEFAULT NULL,
  `wickets` int DEFAULT NULL,
  `wides` int DEFAULT NULL,
  `nbs` int DEFAULT NULL,
  `economy` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `match_info` (
  `id` int NOT NULL,
  `match_date` varchar(50) DEFAULT NULL,
  `venue` varchar(45) DEFAULT NULL,
  `opponent` varchar(45) DEFAULT NULL,
  `toss` varchar(45) DEFAULT NULL,
  `mom` int DEFAULT NULL,
  `result` varchar(45) DEFAULT NULL,
  `diff` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `extras` (
  `id` int NOT NULL,
  `match_id` int DEFAULT NULL,
  `wides` int DEFAULT NULL,
  `nb` int DEFAULT NULL,
  `byes` int DEFAULT NULL,
  `others` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
 );
 
 CREATE TABLE `team_batting` (
  `id` int NOT NULL AUTO_INCREMENT,
  `match_id` int DEFAULT NULL,
  `player_id` int DEFAULT NULL,
  `runs` int unsigned DEFAULT '0',
  `balls_faced` int unsigned DEFAULT '0',
  `ones` int unsigned DEFAULT '0',
  `twos` int unsigned DEFAULT '0',
  `threes` int unsigned DEFAULT '0',
  `fours` int unsigned DEFAULT '0',
  `sixes` int unsigned DEFAULT '0',
  `strike_rate` double unsigned DEFAULT '0',
  `batting_pos` int DEFAULT NULL,
  `kind_out` varchar(45) DEFAULT NULL,
  `economy` int DEFAULT NULL,
  `nbs` int DEFAULT NULL,
  `over_no` int DEFAULT NULL,
  `wickets` int DEFAULT NULL,
  `wides` int DEFAULT NULL,
  `scores` int DEFAULT NULL,
  `maiden` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE `match_info` 
	ADD COLUMN `total` VARCHAR(45) NULL AFTER `diff`;
