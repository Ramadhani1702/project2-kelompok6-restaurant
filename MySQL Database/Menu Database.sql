CREATE TABLE menu_database (
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(200) NOT NULL,
   ayam_bakar INT DEFAULT 0,
   ikan_goreng INT DEFAULT 0,
   sushi INT DEFAULT 0,
   tongseng INT DEFAULT 0,
   es_teh INT DEFAULT 0,
   jus_alpukat INT DEFAULT 0,
   thai_tea INT DEFAULT 0,
   matcha INT DEFAULT 0
);