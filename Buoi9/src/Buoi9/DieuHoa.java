package Buoi9;

import java.util.Scanner;

public class DieuHoa extends ThietBiDien{
	private double congSuatLamLanh;

	public double getCongSuatLamLanh() {
		return congSuatLamLanh;
	}

	public void setCongSuatLamLanh(double congSuatLamLanh) {
		this.congSuatLamLanh = congSuatLamLanh;
	}
	
	public DieuHoa() {
		super();
	}
	
	public DieuHoa(double congSuat, String hangSanXuat, String chucNang, double congSuatLamLanh) {
		super(congSuatLamLanh, hangSanXuat, chucNang);
		this.congSuatLamLanh = congSuatLamLanh;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập công suất làm lạnh: ");
		congSuatLamLanh = Double.parseDouble(scanner.nextLine());
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Công suất làm lạnh: " + congSuatLamLanh + " HP");
	}
	
	public void lamLanh() {
        System.out.println("Điều hòa đang làm lạnh");
    }
	
	public void cheDeTietKiem() {
        System.out.println("Bật chế độ tiết kiệm điện");
    }

}
