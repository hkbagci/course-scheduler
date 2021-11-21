INSERT INTO `DAY` (`id`, `day_name`) VALUES (1, 'Cumartesi');
INSERT INTO `DAY` (`id`, `day_name`) VALUES (2, 'Pazar');

INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (8, 8, 9);
INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (9, 9, 10);
INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (10, 10, 11);
INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (11, 11, 12);
INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (13, 13, 14);
INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (14, 14, 15);
INSERT INTO `HOUR` (`id`, `startHour`, `endHour`) VALUES (15, 15, 16);

INSERT INTO `LESSON_TYPE` (`id`, `lesson_name`) VALUES (1, 'Türkçe');
INSERT INTO `LESSON_TYPE` (`id`, `lesson_name`) VALUES (2, 'Matematik');

INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (1, 'Birinci', 'Öğrenci', 'Ankara');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (2, 'İkinci', 'Öğrenci', 'İstanbul');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (3, 'Üçüncü', 'Öğrenci', 'İzmir');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (4, 'Dördüncü', 'Öğrenci', 'Konya');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (5, 'Beşinci', 'Öğrenci', 'Bursa');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (6, 'Altıncı', 'Öğrenci', 'Adana');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (7, 'Yedinci', 'Öğrenci', 'Gaziantep');
INSERT INTO `STUDENT` (`student_number`, `name`, `surname`, `address`) VALUES (8, 'Sekizinci', 'Öğrenci', 'Ardahan');

INSERT INTO `TEACHER` (`id`, `name`, `surname`, `lesson_type_id`) VALUES (1, 'Birinci', 'Öğretmen', 1);
INSERT INTO `TEACHER` (`id`, `name`, `surname`, `lesson_type_id`) VALUES (2, 'İkinci', 'Öğretmen', 2);
INSERT INTO `TEACHER` (`id`, `name`, `surname`, `lesson_type_id`) VALUES (3, 'Üçüncü', 'Öğretmen', 2);