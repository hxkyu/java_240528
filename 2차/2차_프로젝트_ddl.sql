DROP TABLE IF EXISTS `community`;

CREATE TABLE `community` (
	`co_num`	int primary key auto_increment	NOT NULL,
	`co_name`	varchar(50) unique	NULL
);

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
	`po_num`	int primary key auto_increment	NOT NULL,
	`po_title`	varchar(50)	NULL,
	`po_content`	longtext	NULL,
	`po_date`	datetime	NULL,
	`po_view`	int	NULL,
	`po_co_num`	int	NOT NULL,
	`po_me_id`	varchar(13)	NOT NULL
);

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
	`cm_num`	int primary key auto_increment	NOT NULL,
	`cm_content`	varchar(200)	NULL,
	`cm_ori_num`	int	NULL,
	`cm_date`	datetime	NULL,
	`cm_state`	int	NULL,
	`cm_po_num`	int	NOT NULL,
	`cm_me_id`	varchar(13)	NOT NULL
);

DROP TABLE IF EXISTS `recommend`;

CREATE TABLE `recommend` (
	`re_num`	int primary key auto_increment	NOT NULL,
	`re_state`	int	NULL,
	`re_me_id`	varchar(13)	NOT NULL,
	`re_po_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `member_state`;

CREATE TABLE `member_state` (
	`ms_name`	varchar(10) primary key	NOT NULL
);

DROP TABLE IF EXISTS `memeber`;

CREATE TABLE `memeber` (
	`me_id`	varchar(13)  primary key	NOT NULL,
	`me_pw`	varchar(255)	NULL,
	`me_email`	varchar(50) unique	NULL,
	`me_authority`	varchar(5)	NULL,
	`me_point`	int	NULL,
	`me_cookie`	varchar(255)	NULL,
	`me_limit`	varchar(255)	NULL,
	`me_ms_name`	varchar(10)	NOT NULL
);

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
	`fi_num`	int primary key auto_increment	NOT NULL,
	`fi_ori_name`	varchar(255)	NULL,
	`fi_name`	varchar(255)	NULL,
	`fi_po_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `quiz`;

CREATE TABLE `quiz` (
	`qu_num`	int primary key auto_increment	NOT NULL,
	`qu_content`	longtext	NULL,
	`qu_answer1`	varchar(400)	NULL,
	`qu_answer2`	varchar(400)	NULL,
	`qu_answer3`	varchar(400)	NULL,
	`qu_answer4`	varchar(400)	NULL,
	`qu_correct_answer`	varchar(1)	NULL
);

DROP TABLE IF EXISTS `quiz_attempt`;

CREATE TABLE `quiz_attempt` (
	`qa_num`	int primary key auto_increment	NOT NULL,
	`qa_me_id`	varchar(13)	NOT NULL,
	`qa_qu_num`	int	NOT NULL,
	`qa_submitted_answer`	varchar(1)	NULL,
	`qa_correct_yn`	varchar(1)	NULL
);