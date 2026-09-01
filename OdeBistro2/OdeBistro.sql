DROP DATABASE IF EXISTS OdeBistro;
CREATE DATABASE OdeBistro;
USE OdeBistro;

CREATE TABLE NamaMenu(
KodeMenu VARCHAR(7) PRIMARY KEY,
NamaMenu VARCHAR(100),
HargaMenu INT
);

CREATE TABLE Pesanan(
NomorAntrian VARCHAR(3),
Meja INT
);

CREATE TABLE DetilPesanan(
NomorAntrian VARCHAR(3),
KodeDetilPesanan VARCHAR(10) PRIMARY KEY,
KodeMenu VARCHAR(100),
Quantity INT,
Notes VARCHAR(255)
);

CREATE TABLE DataPegawai(
KodePegawai VARCHAR(7) PRIMARY KEY,
NamaPegawai VARCHAR(255),
PosisiPegawai VARCHAR(100),
PasswordPegawai VARCHAR(100)
);

CREATE TABLE Ingredients(
KodeBahan VARCHAR(7) PRIMARY KEY,
NamaBahan VARCHAR(255),
StockBahan INT
);

CREATE TABLE Restock(
TanggalRestock DATE PRIMARY KEY,
KodeBahan VARCHAR(7),
JumlahRestock INT,
BuktiPembayaran VARCHAR(255)
);

CREATE TABLE IngredientsMenu(
KodeMenu VARCHAR (10) PRIMARY KEY,
KodeBahan VARCHAR (100),
Jumlah INT
);

CREATE TABLE diskon (
id_diskon VARCHAR(7) PRIMARY KEY,
minimal_pembelanjaan INT NOT NULL,
maksimal_potongan INT NOT NULL,
persen_diskon DECIMAL(5,2) NOT NULL
);

CREATE TABLE Penggajian (
KodePegawai VARCHAR (7),
jumlah DECIMAL(10, 2) PRIMARY KEY
);

CREATE TABLE member (
  no_telp_member VARCHAR(12) NOT NULL,
  nama VARCHAR(255) NOT NULL,
  poin_member VARCHAR(20),
  PRIMARY KEY (no_telp_member)
); 

CREATE TABLE pembayaran (
  id_pembayaran INT PRIMARY KEY,
  tipe_pembayaran VARCHAR(50) NOT NULL,
  tgl_pembelian DATE NOT NULL,
  id_diskon VARCHAR(7),
  deskripsi VARCHAR(255) NOT NULL,
  no_telp_member VARCHAR(12) DEFAULT NULL,
  kasir VARCHAR(7)
  );
  
  CREATE TABLE customer (
  Meja INT,
  NamaPegawai VARCHAR(255)
  );
  
  CREATE TABLE menupage (
  NamaMenu VARCHAR(100) PRIMARY KEY,
  Quantity INT,
  notes VARCHAR(255),
  HargaMenu INT,
  TotalHarga INT
  );

INSERT  INTO member(no_telp_member,nama, poin_member) 
VALUES 
('081234567891','Elroy', 80000),
('081234567892','Sherlina', 15000),
('081234567893','Leony', 18000),
('081234567894','Jesye', 57000),
('081234567895','Jessica', 20000)
;

INSERT  INTO pembayaran(id_pembayaran,tipe_pembayaran,tgl_pembelian,deskripsi,no_telp_member,kasir) 
VALUES 
(3154,'Gopay','2024-06-07','Pembayaran melalui aplikasi Gopay','081234567891','P042202'),
(3215,'Ovo','2024-06-07','Pembayaran dengan aplikasi Ovo','081234567891','P042203'),
(3375,'Cash','2024-06-07','Pembayaran tunai','081234567891','P042202'),
(3412,'Cash','2024-06-07','Pembayaran tunai','081234567891','P042203'),
(3567,'Ovo','2024-06-07','Pembayaran melalui aplikasi Ovo','081234567891','P042203')
;
INSERT INTO diskon(id_diskon, minimal_pembelanjaan, maksimal_potongan, persen_diskon)
VALUES 
("D010203", 200000, 50000, 50),
("D010204", 150000, 50000, 48),
("D010205", 148000, 50000, 46),
("D010206", 145000, 50000, 45), 
("D010207", 138000, 50000, 40),
("D010208", 133000, 50000, 36),
("D010209", 130000, 50000, 33),
("D010210", 127000, 50000, 30)
; 

INSERT INTO DataPegawai(KodePegawai, NamaPegawai, PosisiPegawai, PasswordPegawai)
VALUES
("P000001", "Morgan Columbus", "Owner", "OwnerOB2769"),
("P032004", "Jennifer Brenna Harris", "Stocker", "StockerOB1498"),
("P012302", "Morgan Christina", "Server", "ServerOB7813"),
("P022401", "Sammie Garth Webb", "Chef", "ChefOB3492"),
("P012207", "Mackenzie Nicolas", "Server", "ServerOB7345"),
("P032102", "Johnny Jr Stewart", "Stocker", "StockerOB1486"),
("P012002", "Shaquille Mark", "Server", "ServerOB7901"),
("P012001", "Ruth Alaina", "Server", "ServerOB7456"),
("P022103", "Leah Christine Robinson", "Chef", "ChefOB3185"),
("P022304", "Ryleigh Dorothy", "Chef", "ChefOB3906"),
("P022305", "Sanders Bruce", "Chef", "ChefOB3771"),
("P042203", "Caramel Gouwn", "Cashier", "CashierOB1752"),
("P042202", "Doony Wales", "Cashier", "CashierOB4462")
;

INSERT INTO NamaMenu(KodeMenu, NamaMenu, HargaMenu)
VALUES
("MSna001", "Truffle Fries", 25000),
("MSna002", "Tuna Salad", 30000),
("MSna003", "Mushroom Soup", 25000),
("MSna004", "Lime and Chilli Chicken Burger", 35000),
("MPas001", "Spaghetti Carbonara", 40000),
("MPas002", "Mac n Cheese with Truffle", 42000),
("MPas003", "Penne Aglio e Olio", 35000),
("MPas004", "Penne Pesto", 37000),
("MPas005", "Spaghetti Bolognese", 35000),
("MDri001", "Blue Mojito", 20000),
("MDri002", "Lemon Mojito", 22000),
("MDri003", "Milkshake Cookies and Cream", 22000),
("MDri004", "Mineral Water", 10000),
("MDri005", "Ice Lemon Tea", 15000),
("MDes001", "Strawberry Pancake", 23000),
("MDes002", "Matcha Pancake", 22000),
("MDes003", "Choco Yum Cake", 20000),
("MDes004", "Vanilla Gelato", 20000),
("MDes005", "Blueberry Frozen Yogurt", 25000)
;

INSERT INTO Pesanan(NomorAntrian, Meja)
VALUES
("001", 4),
("002", 6),
("003", 1),
("004", 7),
("005", 4)
;

INSERT INTO DetilPesanan(NomorAntrian, KodeDetilPesanan, KodeMenu, Quantity, Notes)
VALUES
('001', '00101', 'MPas003', 2, ''),
('001', '00102', 'MDri004', 1, 'With ice'),
('001', '00103', 'MDri002', 1, ''),
('002', '00201', 'MDes004', 1, ''),
('002', '00202', 'MSna004', 1, 'extra sauce on the side'),
('002', '00203', 'MSna001', 1, ''),
('002', '00204', 'MPas004', 1, ''),
('002', '00205', 'MDri004', 2, ''),
('003', '00301', 'MSna003', 1, 'tanpa roti'),
('003', '00302', 'MPas002', 1, ''),
('003', '00303', 'MDes002', 1, ''),
('003', '00304', 'MDri003', 1, ''),
('004', '00401', 'MPas005', 1, ''),
('004', '00402', 'MPas003', 1, ''),
('004', '00403', 'MDes005', 1, ''),
('004', '00404', 'MDri002', 1, 'less sugar'),
('004', '00405', 'MDri002', 1, ''),
('005', '00501', 'MDes001', 1, ''),
('005', '00502', 'MDri005', 1, '')
;

INSERT INTO Ingredients (KodeBahan, NamaBahan, StockBahan)
VALUES
("BMea001", "Chicken Breast", 0),
("BMea002", "Pork Belly", 0 ),
("BMea003", "Minced Beef", 0 ),
("BMea004", "Canned Tuna", 0 ),
("BPou001", "Egg", 0 ),
("BPou002", "Chicken Stock", 0 ),
("BSau001", "Mayonaise", 0 ),
("BSau002", "Tomato Sauce", 0 ),
("BSau003", "Strawberry Paste", 0 ),
("BSau004", "Honey", 0 ),
("BDai001", "Cooking Cream", 0 ),
("BDai002", "Whipped Cream", 0 ),
("BDai003", "Heavy Cream", 0 ),
("BDai004", "Sweetened Condensed Milk", 0 ),
("BDai005", "Milk", 0 ),
("BDai006", "Greek Yogurt", 0 ),
("BDai007", "Butter", 0 ),
("BDai008", "Cheddar Cheese", 0 ),
("BDai009", "Parmesan Cheese", 0 ),
("BDai010", "Pecorino Cheese", 0 ),
("BDai011", "Smoked Gouda Cheese", 0 ),
("BDai012", "Swiss Cheese", 0 ),
("BLiq001", "Tea", 0 ),
("BLiq002", "Blue Pepsi", 0 ),
("BLiq003", "Soda", 0 ),
("BLiq004", "Liquid Sugar", 0 ),
("BNfg001", "Truffle Oil", 0 ),
("BNfg002", "Olive Oil", 0 ),
("BNfg003", "Cooking Oil", 0 ),
("BCon001", "Truffle Salt", 0 ),
("BCon002", "Salt", 0 ),
("BCon003", "Black Pepper", 0 ),
("BCon004", "Granulated Sugar", 0 ),
("BCon005", "Garlic Powder", 0 ),
("BCon006", "Chicken Bouillon", 0 ),
("BVeg001", "Fresh Parsley", 0 ),
("BVeg002", "Fresh Basil", 0 ),
("BVeg003", "Mint Leaf", 0 ),
("BVeg004", "Oregano", 0 ),
("BVeg005", "Coriander Leaf", 0 ),
("BVeg006", "Celery", 0 ),
("BVeg007", "Tomato", 0 ),
("BVeg008", "Onion", 0 ),
("BVeg009", "Ginger", 0 ),
("BVeg010", "Garlic", 0 ),
("BVeg011", "Red Chilli", 0 ),
("BVeg012", "Red Cayenne Peper", 0 ),
("BVeg013", "Potato", 0 ),
("BVeg014", "Button Mushroom", 0 ),
("BGra001", "Bread", 0 ),
("BGra002", "Spaghetti", 0 ),
("BGra003", "Corkscrew Macaroni", 0 ),
("BGra004", "Pasta Penne", 0 ),
("BGra005", "Wheat Flour", 0 ),
("BFru001", "Lemon", 0 ),
("BFru002", "Lemon Juice", 0 ),
("BFru003", "Strawberry", 0 ),
("BFru004", "Blueberry", 0 ),
("BFru005", "Avocado", 0 ),
("BFru006", "Lime", 0 ),
("BFru007", "Frozen Blueberry", 0 ),
("BOth001", "Baking Powder", 0 ),
("BOth002", "Vanilla", 0 ),
("BOth003", "Matcha Powder", 0 ),
("BOth004", "Cocoa Powder", 0 ),
("BTop001", "Sprinkle", 0 ),
("BTop002", "Chocolate Bar", 0 ),
("BTop003", "Cookie", 0 ),
("BTop004", "Oreo", 0 )
;

SELECT *
FROM menupage;

SELECT *
FROM member;

DELETE FROM member WHERE nama = 'Novan' AND no_telp_member = '08123456789';
