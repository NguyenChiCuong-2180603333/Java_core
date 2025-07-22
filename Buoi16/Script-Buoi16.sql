CREATE DATABASE IF NOT EXISTS buoi16 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE buoi16;

-- Bảng khách hàng
CREATE TABLE customers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    registered_at DATE NOT NULL
);

-- Bảng sản phẩm
CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
);

-- Bảng đơn hàng
CREATE TABLE orders (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT NOT NULL,
    order_date DATE NOT NULL,
    total_amount DECIMAL(12,2) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

-- Bảng chi tiết đơn hàng (mỗi dòng là 1 sản phẩm thuộc 1 đơn)
CREATE TABLE order_items (
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT NOT NULL,
    product_id INT NOT NULL,
    quantity INT NOT NULL,
    price DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO customers (name, email, registered_at) VALUES
('Trần Văn An', 'an.tran@gmail.com', '2024-01-03'),
('Nguyễn Minh B', 'minhb@gmail.com', '2024-01-05'),
('Lê Thị C', 'c.let@gmail.com', '2024-01-10'),
('Phạm Hoàng D', 'd.pham@gmail.com', '2024-01-13'),
('Đỗ Thúy E', 'thuydo@gmail.com', '2024-01-15'),
('Hoàng Văn F', 'f.hoang@gmail.com', '2024-02-03'),
('Bùi Đức G', 'g.bui@gmail.com', '2024-02-07'),
('Trịnh Mai H', 'h.trinh@gmail.com', '2024-02-09'),
('Vũ Hải I', 'i.vu@gmail.com', '2024-02-12'),
('Đặng Nhật K', 'k.dang@gmail.com', '2024-02-14'),
('Nguyễn Thị L', 'l.nguyen@gmail.com', '2024-02-17'),
('Phan Văn M', 'm.phan@gmail.com', '2024-03-01'),
('Đoàn Thị N', 'n.doan@gmail.com', '2024-03-05'),
('Trương Minh O', 'o.truong@gmail.com', '2024-03-10'),
('Võ Gia P', 'p.vo@gmail.com', '2024-03-15'),
('Lý Hải Q', 'q.ly@gmail.com', '2024-03-21'),
('Tạ Văn R', 'r.ta@gmail.com', '2024-03-25'),
('Cao Thị S', 's.cao@gmail.com', '2024-04-01'),
('Ngô Văn T', 't.ngo@gmail.com', '2024-04-08'),
('Dương Thu U', 'u.duong@gmail.com', '2024-04-13');

INSERT INTO products (name, price, stock) VALUES
('Bút bi Thiên Long', 5000, 100),
('Vở Campus', 20000, 50),
('Kéo nhỏ', 12000, 30),
('Thước kẻ 20cm', 7000, 60),
('Tẩy Student', 3000, 100),
('Gôm Pentel', 4000, 90),
('Bìa nhựa', 15000, 70),
('Bút chì 2B', 3500, 80),
('Gọt bút chì', 6000, 40),
('Tập A4', 25000, 40),
('Giấy note', 8000, 55),
('Bút dạ quang', 12000, 35),
('Compas', 30000, 25),
('Bảng con', 18000, 50),
('Bút lông bảng', 7000, 80),
('Kẹp giấy', 4000, 100),
('Hồ dán', 6000, 60),
('Sổ tay', 15000, 90),
('Mực bút máy', 20000, 25),
('Kẹp tài liệu', 18000, 30);

INSERT INTO orders (customer_id, order_date, total_amount) VALUES
(1, '2024-01-05', 150000),
(2, '2024-01-07', 230000),
(3, '2024-01-12', 50000),
(4, '2024-01-14', 110000),
(5, '2024-01-16', 72000),
(6, '2024-02-05', 135000),
(7, '2024-02-09', 98000),
(8, '2024-02-13', 128000),
(9, '2024-02-17', 60000),
(10, '2024-02-19', 157000),
(11, '2024-02-21', 81000),
(12, '2024-03-03', 44000),
(13, '2024-03-06', 205000),
(14, '2024-03-12', 157000),
(15, '2024-03-16', 129000),
(16, '2024-03-22', 143000),
(17, '2024-03-27', 95000),
(18, '2024-04-03', 128000),
(19, '2024-04-09', 100000),
(20, '2024-04-14', 132000);

INSERT INTO order_items (order_id, product_id, quantity, price) VALUES
(1, 1, 10, 5000),    (1, 2, 2, 20000),      (1, 3, 3, 12000),
(2, 2, 5, 20000),    (2, 4, 4, 7000),       (2, 5, 2, 3000),
(3, 1, 3, 5000),     (3, 8, 2, 3500),       (3, 9, 1, 6000),
(4, 2, 1, 20000),    (4, 3, 6, 12000),      (4, 7, 1, 15000),
(5, 5, 7, 3000),     (5, 6, 5, 4000),       (5, 10, 1, 25000),
(6, 1, 5, 5000),     (6, 2, 1, 20000),      (6, 12, 2, 12000),
(7, 3, 8, 12000),    (7, 4, 2, 7000),       (7, 5, 3, 3000),
(8, 2, 3, 20000),    (8, 11, 4, 8000),      (8, 15, 5, 7000),
(9, 1, 2, 5000),     (9, 3, 4, 12000),      (9, 6, 3, 4000),
(10, 1, 7, 5000),    (10, 13, 2, 30000),    (10, 18, 1, 15000),
(11, 2, 2, 20000),   (11, 5, 5, 3000),      (11, 8, 3, 3500),
(12, 3, 5, 12000),   (12, 7, 2, 15000),     (12, 14, 1, 18000),
(13, 2, 3, 20000),   (13, 9, 2, 6000),      (13, 17, 2, 15000),
(14, 1, 5, 5000),    (14, 10, 3, 25000),    (14, 11, 1, 8000),
(15, 1, 2, 5000),    (15, 4, 7, 7000),      (15, 5, 5, 3000),
(16, 2, 6, 20000),   (16, 3, 1, 12000),     (16, 6, 3, 4000),
(17, 7, 3, 15000),   (17, 8, 5, 3500),      (17, 12, 2, 12000),
(18, 1, 4, 5000),    (18, 13, 1, 30000),    (18, 14, 2, 18000),
(19, 2, 1, 20000),   (19, 16, 4, 4000),     (19, 17, 3, 15000),
(20, 3, 6, 12000),   (20, 15, 2, 7000),     (20, 19, 2, 20000);

-- câu 1
SELECT o.id, c.name, o.total_amount, o.order_date
FROM orders o
JOIN customers c ON o.customer_id = c.id;
-- câu 2
SELECT o.id, c.name, p.name AS 'tensanpham', oi.quantity, oi.price
FROM order_items oi
JOIN orders o ON oi.order_id = o.id
JOIN customers c ON o.customer_id = c.id
JOIN products p ON oi.product_id = p.id
ORDER BY o.id, p.name;
-- câu 3
SELECT c.name , COUNT(o.id) AS 'sodon', SUM(o.total_amount) AS 'tongtien'
FROM customers c
JOIN orders o ON c.id = o.customer_id
GROUP BY c.id, c.name
ORDER BY c.name;
-- câu 4
SELECT DATE_FORMAT(order_date, '%Y-%m') AS 'thang', COUNT(id) AS 'sodonhang'
FROM orders
WHERE YEAR(order_date) = YEAR(CURDATE())
GROUP BY DATE_FORMAT(order_date, '%Y-%m')
ORDER BY 'thang';
--câu 5
SELECT p.name, SUM(oi.quantity) AS 'soluongban'
FROM products p
JOIN order_items oi ON p.id = oi.product_id
GROUP BY p.id, p.name
ORDER BY SUM(oi.quantity) DESC;
-- câu 6
SELECT DATE_FORMAT(order_date, '%Y-%m') AS 'thang', SUM(total_amount) AS 'tongdoanhthu'
FROM orders
GROUP BY DATE_FORMAT(order_date, '%Y-%m')
ORDER BY 'thang';
-- câu 7
SELECT c.name, SUM(o.total_amount) AS 'tongchitieu'
FROM customers c
JOIN orders o ON c.id = o.customer_id
GROUP BY c.id, c.name
ORDER BY SUM(o.total_amount) DESC
LIMIT 5;
-- câu 8
SELECT c.name, p.name AS 'tensanpham', SUM(oi.quantity) AS 'tongsoluong'
FROM customers c
JOIN orders o ON c.id = o.customer_id
JOIN order_items oi ON o.id = oi.order_id
JOIN products p ON oi.product_id = p.id
GROUP BY c.id, c.name, p.id, p.name
ORDER BY c.name, p.name;
-- câu 9
SELECT c.name
FROM customers c
JOIN orders o ON c.id = o.customer_id
JOIN order_items oi ON o.id = oi.order_id
GROUP BY c.id, c.name
HAVING COUNT(DISTINCT oi.product_id) >= 2;
-- câu 10
SELECT p.name, DATE_FORMAT(o.order_date, '%Y-%m') AS 'thang', SUM(oi.quantity) AS 'soluongban'
FROM products p
JOIN order_items oi ON p.id = oi.product_id
JOIN orders o ON oi.order_id = o.id
GROUP BY p.id, p.name, DATE_FORMAT(o.order_date, '%Y-%m')
ORDER BY p.name, 'thang';