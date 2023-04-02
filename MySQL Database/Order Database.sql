CREATE TABLE order_database (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(200) NOT NULL,
   nomor_table INT DEFAULT 0,
   id_payment INT DEFAULT 0,
   payment_method VARCHAR(200) NOT NULL,
   payment_date DATE NULL
);



