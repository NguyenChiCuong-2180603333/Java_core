package Buoi9;

import java.util.Scanner;

public class PhuongTienGiaoThong {

	protected String hangSanXuat;
    protected String mauSac;
    protected int namSanXuat;
    
    public PhuongTienGiaoThong()
    {
    	
    }
    
    public PhuongTienGiaoThong(String hangSanXuat, String mauSac, int namSanXuat) {
    	this.hangSanXuat = hangSanXuat;
    	this.mauSac = mauSac;
    	this.namSanXuat = namSanXuat;
    }
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	
	public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hãng sản xuất: ");
        hangSanXuat = scanner.nextLine();
        System.out.print("Nhập màu sắc: ");
        mauSac = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        namSanXuat = scanner.nextInt();
    }
	
	public void hienThiThongTin() {
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Năm sản xuất: " + namSanXuat);
    }
}
