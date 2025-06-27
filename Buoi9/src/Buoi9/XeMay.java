package Buoi9;

import java.util.Scanner;

public class XeMay extends PhuongTienGiaoThong{

	private double vanToc;

	public double getVanToc() {
		return vanToc;
	}

	public void setVanToc(double vanToc) {
		this.vanToc = vanToc;
	}
	
	public XeMay() {
		super();
	}
	
	public XeMay(String hangSanXuat, String mauSac, int namSanXuat, double vanToc) {
		super(hangSanXuat, mauSac, namSanXuat);
		this.vanToc = vanToc;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập vận tốc: ");
		vanToc = Double.parseDouble(scanner.nextLine());
	}
	
	public void hienThiThongTin() {
		System.out.println("=== THÔNG TIN XE MÁY ===");
		super.hienThiThongTin();
        System.out.println("Vận tốc: " + vanToc + "km/h");
	}
}
