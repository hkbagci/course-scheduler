INSERT INTO `DAY` (`id`, `day_name`) VALUES (1, 'Cumartesi');
INSERT INTO `DAY` (`id`, `day_name`) VALUES (2, 'Pazar');

INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (8, 8, 9);
INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (9, 9, 10);
INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (10, 10, 11);
INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (11, 11, 12);
INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (13, 13, 14);
INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (14, 14, 15);
INSERT INTO `HOUR` (`id`, `start_hour`, `end_hour`) VALUES (15, 15, 16);

INSERT INTO `LESSON_TYPE` (`id`, `lesson_name`) VALUES (1, 'Türkçe');
INSERT INTO `LESSON_TYPE` (`id`, `lesson_name`) VALUES (2, 'Matematik');

INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (1, 'Ali', 'Yılmaz', 'Ankara');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (2, 'Veli', 'Yıldırım', 'İstanbul');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (3, 'Muhterem', 'Nur', 'İzmir');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (4, 'Mümtaz', 'Kahraman', 'Konya');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (5, 'Kamil', 'Karate', 'Bursa');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (6, 'Paul', 'Gascoigne', 'London');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (7, 'Matthew', 'Le Tissier', 'Southampton');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (8, 'Teddy', 'Sheringham', 'Manchester');

INSERT INTO `TEACHER` (`id`, `name`, `surname`, `lesson_type_id`) VALUES (1, 'Hidayet Kerem', 'Bağcı', 1);
INSERT INTO `TEACHER` (`id`, `name`, `surname`, `lesson_type_id`) VALUES (2, 'Alex', 'Ferguson', 2);
INSERT INTO `TEACHER` (`id`, `name`, `surname`, `lesson_type_id`) VALUES (3, 'Kenny', 'Dalglish', 2);