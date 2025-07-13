CREATE DATABASE quanlysach;

USE quanlysach;

CREATE TABLE tacgia(
	id int auto_increment,
	ten_tac_gia varchar(100) NOT NULL,
	quoc_tich varchar(50),
	primary key(id)
);

CREATE TABLE sach(
	id int auto_increment,
	tieu_de varchar(200) NOT NULL,
	nam_xuat_ban int,
	id_tac_gia int,
	
	primary key(id),
	foreign KEY (id_tac_gia) references tacgia(id)
);

INSERT INTO tacgia(ten_tac_gia, quoc_tich) VALUES ('Nguyễn Nhật Ánh','Việt Nam');
INSERT INTO tacgia(ten_tac_gia, quoc_tich) VALUES ('Haruki Murakami','Nhật Bản');
INSERT INTO tacgia(ten_tac_gia, quoc_tich) VALUES ('J.K. Rowling','Anh');

INSERT INTO sach(tieu_de, nam_xuat_ban, id_tac_gia) VALUES ('Mắt Biếc','1990','1');
INSERT INTO sach(tieu_de, nam_xuat_ban, id_tac_gia) VALUES ('Tôi thấy hoa vàng trên cỏ xanh','2005','1');
INSERT INTO sach(tieu_de, nam_xuat_ban, id_tac_gia) VALUES ('Rừng Na Uy','1987','2');
INSERT INTO sach(tieu_de, nam_xuat_ban, id_tac_gia) VALUES ('Harry Potter và Hòn đá Phù thủy','1997','3');

-- 3
-- cau 1
SELECT *
FROM sach
-- cau 2
SELECT *
FROM tacgia
Where quoc_tich = 'Việt Nam'
-- cau 3
SELECT s.tieu_de, tg.ten_tac_gia
FROM sach s
Join tacgia tg ON s.id_tac_gia = tg.id

SELECT *
FROM sach, tacgia
WHERE sach.id_tac_gia = tacgia.id

-- cau 4
SELECT *
FROM sach
WHERE nam_xuat_ban > 1990

-- cau 5
SELECT tg.ten_tac_gia, COUNT(*) soluongsach
FROM sach s
JOIN tacgia tg ON tg.id = s.id_tac_gia
GROUP BY tg.ten_tac_gia
-- cau 6
SELECT tg.ten_tac_gia, COUNT(*) as so_luong_sach
FROM sach s
JOIN tacgia tg ON tg.id = s.id_tac_gia
GROUP BY tg.ten_tac_gia
ORDER BY COUNT(*) DESC
LIMIT 1;