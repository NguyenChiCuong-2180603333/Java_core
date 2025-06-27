package Buoi9;

import java.util.Scanner;

public class MaySay extends ThietBiDien{

	private String kieuSay;

	public String getKieuSay() {
		return kieuSay;
	}

	public void setKieuSay(String kieuSay) {
		this.kieuSay = kieuSay;
	}
	public MaySay() {
		super();
	}
	public MaySay(double congSuat, String hangSanXuat, String chucNang, String kieuSay) {
		super(congSuat, hangSanXuat, chucNang);
		this.kieuSay = kieuSay;
	}
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập kiểu sấy: ");
		kieuSay = scanner.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Kiểu sấy: " + kieuSay + " HP");
	}
	
	public void say() {
        System.out.println("Máy sấy đang hoạt động");
    }

}
