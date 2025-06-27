package Buoi_10;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {

	private int soSanPham;
	
	public NhanVienSanXuat() {
		super();
	}
	public NhanVienSanXuat(String hoTen, String ngaySinh, double luongCoBan, int soSanPham) {
		super(hoTen, ngaySinh, luongCoBan);
		this.soSanPham = soSanPham;
	}

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số sản phẩm");
		soSanPham = sc.nextInt();
	}
	public void xuat() {
        super.xuat();
        System.out.println("Số sản phẩm: " + soSanPham);
        System.out.println("Lương: " + tinhLuong());
    }
	@Override
	public double tinhLuong() {
		return luongCoBan + soSanPham * 5000;
	}

}
