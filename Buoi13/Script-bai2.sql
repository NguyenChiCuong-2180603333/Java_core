CREATE DATABASE cybersoft_shop;
USE cybersoft_shop;

CREATE TABLE loaisanpham (
    maloaisp INT PRIMARY KEY AUTO_INCREMENT,
    tenloaisp VARCHAR(100) NOT NULL
);

CREATE TABLE sanpham (
    masp INT PRIMARY KEY AUTO_INCREMENT,
    tensp VARCHAR(255) NOT NULL,
    gia DECIMAL(10,2) NOT NULL,
    mota VARCHAR(255),
    maloaisp INT,
    FOREIGN KEY (maloaisp) REFERENCES loaisanpham(maloaisp)
);

CREATE TABLE khachhang (
    makh INT PRIMARY KEY AUTO_INCREMENT,
    ho VARCHAR(50) NOT NULL,
    ten VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    diachi VARCHAR(255),
    sodt VARCHAR(15)
);

CREATE TABLE hoadon (
    mahoadon INT PRIMARY KEY AUTO_INCREMENT,
    ngaymua DATE NOT NULL,
    makh INT,
    FOREIGN KEY (makh) REFERENCES khachhang(makh)
);

CREATE TABLE chitiethoadon (
    mahoadon INT,
    masp INT,
    soluong INT NOT NULL,
    giaban DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (mahoadon, masp),
    FOREIGN KEY (mahoadon) REFERENCES hoadon(mahoadon),
    FOREIGN KEY (masp) REFERENCES sanpham(masp)
);