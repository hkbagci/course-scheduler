DROP TABLE IF EXISTS `DAY`;
CREATE TABLE `DAY`
(
    `id`       INTEGER AUTO_INCREMENT PRIMARY KEY,
    `day_name` VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS `HOUR`;
CREATE TABLE `HOUR`
(
    `id`   INTEGER AUTO_INCREMENT PRIMARY KEY,
    `startHour` INTEGER NOT NULL,
    `endHour` INTEGER NOT NULL
);

DROP TABLE IF EXISTS `LESSON_TYPE`;
CREATE TABLE `LESSON_TYPE`
(
    `id`          INTEGER AUTO_INCREMENT PRIMARY KEY,
    `lesson_name` VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS `STUDENT`;
CREATE TABLE `STUDENT`
(
    `student_number` INTEGER AUTO_INCREMENT PRIMARY KEY,
    `name`           VARCHAR(50) NOT NULL,
    `surname`        VARCHAR(50) NOT NULL,
    `address`        VARCHAR(200)
);

DROP TABLE IF EXISTS `TEACHER`;
CREATE TABLE `TEACHER`
(
    `id`             INTEGER AUTO_INCREMENT PRIMARY KEY,
    `name`           VARCHAR(50) NOT NULL,
    `surname`        VARCHAR(50) NOT NULL,
    `lesson_type_id` INTEGER     NOT NULL
);

DROP TABLE IF EXISTS `COURSE`;
CREATE TABLE `COURSE`
(
    `id`         INTEGER AUTO_INCREMENT PRIMARY KEY,
    `day_id`     INTEGER NOT NULL,
    `hour_id`    INTEGER NOT NULL,
    `teacher_id` INTEGER NOT NULL
);

DROP TABLE IF EXISTS `COURSE_STUDENT`;
CREATE TABLE `COURSE_STUDENT`
(
    `id`         INTEGER AUTO_INCREMENT PRIMARY KEY,
    `course_id`  INTEGER NOT NULL,
    `student_id` INTEGER NOT NULL
);