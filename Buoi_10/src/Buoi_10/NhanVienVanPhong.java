package Buoi_10;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {

	private int soNgayLamViec;
	
	public NhanVienVanPhong() {
		super();
	}
	public NhanVienVanPhong(String hoTen, String ngaySinh, double luongCoBan, int soNgayLamViec) {
		super(hoTen, ngaySinh, luongCoBan);
		this.soNgayLamViec = soNgayLamViec;
	}
	public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày làm việc: ");
        soNgayLamViec = sc.nextInt();
    }
	
	public void xuat() {
        super.xuat();
        System.out.println("Số ngày làm việc: " + soNgayLamViec);
        System.out.println("Lương: " + tinhLuong());
    }
	
	@Override
    public double tinhLuong() {
        return soNgayLamViec * 100000;
    }
    

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	


}
