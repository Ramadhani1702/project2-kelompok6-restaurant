CREATE TABLE `users` (
  `id` int NOT NULL,
  `name` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `type` varchar(1) NOT NULL DEFAULT 'U'
);

ALTER TABLE `users` ADD PRIMARY KEY (`id`);

INSERT INTO `users` (`id`, `name`, `username`, `password`, `type`) VALUES
(1, 'Rajil', 'Admin1', '123', 'A'),
(2, 'Amel', 'Admin2', '321', 'A');