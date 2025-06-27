package Buoi_10;

import java.util.Scanner;


public class Phanso {

	private double tuSo;
	private double mauSo;
	
	public Phanso () {}
	
	
	public void nhapPhanSo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tử số: ");
		this.tuSo = scanner.nextDouble();
		do {
		System.out.println("Nhập mẫu số (khác 0)");
		this.mauSo = scanner.nextDouble();
		}while(mauSo == 0);
	}
	
	public void xuatPhanSo() {
		
			System.out.println(tuSo +"/"+mauSo);
	}
	
	public void cong(Phanso phanso2) {
		double result = (tuSo* phanso2.mauSo + phanso2.tuSo*mauSo) / (mauSo*phanso2.mauSo);
		System.out.println("Kết quả cộng: " + result);
	}
	
	public void tru(Phanso phanso2) {
		double result = (tuSo* phanso2.mauSo - phanso2.tuSo*mauSo) / (mauSo*phanso2.mauSo);
		System.out.println("Kết quả trừ: " + result);
	}
	
	public void nhan(Phanso phanso2) {
		double result = (tuSo*phanso2.tuSo) / (phanso2.mauSo*mauSo);
		System.out.println("Kết quả nhân: " + result);
	}
	
	public void chia(Phanso phanso2) {
		if(phanso2.mauSo == 0) {
			System.out.println("Không thể chia cho phân số có tử số bằng 0");
		}
		double result = (tuSo*phanso2.mauSo) / (phanso2.tuSo*mauSo);
		System.out.println("Kết quả chia: " + result);
	}
	
	
	public double getTuso() {
		return tuSo;
	}
	public void setTuso(double tuso) {
		this.tuSo = tuSo;
	}
	public double getMauso() {
		return mauSo;
	}
	public void setMauso(double mauso) {
		this.mauSo = mauSo;
	}
	

}
