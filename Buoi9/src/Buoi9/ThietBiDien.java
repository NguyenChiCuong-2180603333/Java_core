package Buoi9;

import java.util.Scanner;

public class ThietBiDien {

	private double congSuat;      
	private String hangSanXuat;   
	private String chucNang;
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getChucNang() {
		return chucNang;
	}
	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	} 
	
	public ThietBiDien() {
		
	}
	
	public ThietBiDien(double congSuat, String hangSanXuat, String chucNang) {
		this.congSuat = congSuat;
		this.hangSanXuat = hangSanXuat;
		this.chucNang = chucNang;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập công suất: ");
		congSuat = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhập hãng sản xuất: ");
		hangSanXuat = scanner.nextLine();
		System.out.println("Nhập chức năng: ");
		chucNang = scanner.nextLine();
	}
	
	public void hienThiThongTin() {
	    System.out.println("===== Thông Tin Thiết Bị Điện =====");
	    System.out.println("Công suất        : " + congSuat + " W");
	    System.out.println("Hãng sản xuất    : " + hangSanXuat);
	    System.out.println("Chức năng        : " + chucNang);
	}
}
