﻿
CREATE DATABASE QLQCP
use QLQCP

--Le Anh Duc create table Khach Hang
create table KhachHang( 
 id_khach_hang nvarchar(100) primary key not null,
 ten_khach_hang nvarchar(100) not null,
 email nvarchar(100) not null,
 sdt nvarchar(100) not null
 )
--Do Trong Kien create table San Pham
 create table SanPham(
    id_san_pham nvarchar(100) NOT NULL PRIMARY KEY,
    ten_san_pham nvarchar(100) NOT NULL,
    so_luong int NOT NULL,
    gia_ban money NOT NULL,
);

--Do Trung Kien create table Hoa Don va Nhan Vien
create table HoaDon(
id_hoa_don nvarchar(100) not null,
id_nhan_vien nvarchar(100) not null,
id_san_pham nvarchar(100) not null,
id_khach_hang nvarchar(100) not null,
so_luong_san_pham_mua int not null,
tong_tien money not null,
thoi_gian_xuat_hoa_don datetime not null,
primary key(id_hoa_don),
foreign key (id_san_pham) references SanPham(id_san_pham),
foreign key (id_khach_hang) references KhachHang(id_khach_hang),
foreign key (id_nhan_vien) references NhanVien(id_nhan_vien)
)


create table NhanVien(
id_nhan_vien nvarchar(100) primary key not null,
ten_nhan_vien nvarchar(100) not null,
ca_lam datetime not null,
dia_chi nvarchar(100) not null,
email nvarchar(100) not null,
sdt nvarchar(100) not null

)

--Le Anh Duc insert table Khach Hang
 insert into KhachHang values
 ('1','duc','duc123@gmail.com','0961702083'),
 ('2','kien A','kienA123@gmail.com','0961702083'),
 ('3','kien E','kienE123@gmail.com','0961702083');
--Do Trong Kien insert table San Pham
 INSERT INTO SanPham(id_san_pham, ten_san_pham, so_luong, gia_ban) VALUES
('SanPham 1','Tra Sua',20,35000),
('SanPham 2','Ca Phe',10,25000),
('SanPham 3','Sinh To Hoa Qua',15,40000);
--Do Trung Kien insert table Hoa Don va Nhan Vien
insert into HoaDon(id_hoa_don,id_nhan_vien,id_san_pham,id_khach_hang,so_luong_san_pham_mua,tong_tien,thoi_gian_xuat_hoa_don) values
('01','10','SanPham 1','1',10,1000,'2024-11-13 08:08:00'),
('02','20','SanPham 2','2',20,1500,'2024-11-13 10:10:00'),
('03','30','SanPham 3','3',5,100,'2024-11-13 12:12:00');

insert into NhanVien(id_nhan_vien,ten_nhan_vien,ca_lam,dia_chi,email,sdt) values
(10,'Nguyen Van A','2024-11-13 08:08:00','Ha Noi','nguyena@gmail.com' , '0987654321'),
(20,'Nguyen Van B','2024-11-13 10:10:00','Ha Noi','nguyenb@gmail.com' , '0123456789'),
(30,'Nguyen Van C','2024-11-13 12:12:00','Ha Noi','nguyenc@gmail.com' , '0987612312');


select * from SanPham​
select *from KhachHang
select * from HoaDon
select * from NhanVien

