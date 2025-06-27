package Buoi9;

import java.util.Scanner;

public class XeHoi2 extends PhuongTienGiaoThong {
	private int soChoNgoi;
	private double vanToc;
	
	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public double getVanToc() {
		return vanToc;
	}

	public void setVanToc(double vanToc) {
		this.vanToc = vanToc;
	}

	public XeHoi2() {
		super();
	}
	
	public XeHoi2(String hangSanXuat, String mauSac, int namSanXuat, int soChoNgoi, double vanToc) {
		super(hangSanXuat, mauSac, namSanXuat);
		this.soChoNgoi= soChoNgoi;
		this.vanToc= vanToc;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("\nNhập số chỗ ngồi: ");
		soChoNgoi = Integer.parseInt(scanner.nextLine());
		System.err.println("Nhập vân tốc: ");
		vanToc = Double.parseDouble(scanner.nextLine());
	}
	
	public void hienThiThongTin() {
		System.out.println("=== THÔNG TIN XE HƠI ===");
		super.hienThiThongTin();
		System.out.println("Số chỗ ngồi " + soChoNgoi);
        System.out.println("Vận tốc: " + vanToc +"km/h");
	}

}
