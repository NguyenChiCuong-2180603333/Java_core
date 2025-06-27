package Buoi9;

import java.util.Scanner;

public class Student {

	private String ten;
	private int tuoi;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public Student() {
		
	}
	
	public Student(String ten, int tuoi, double diemToan, double diemLy, double diemHoa) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemToan=diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public void nhapThongTin(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tên sinh viên:");
		ten = scanner.nextLine();			
		System.out.println("Tuổi sinh viên:");
		tuoi = Integer.parseInt(scanner.nextLine());			
		System.out.println("Điểm toán:");
		diemToan = Double.parseDouble(scanner.nextLine());			
		System.out.println("Điểm lý:");
		diemLy = Double.parseDouble(scanner.nextLine());			
		System.out.println("Điểm hóa:");
		diemHoa = Double.parseDouble(scanner.nextLine());	
		
		}
	public void xuatThongTin() {
		System.out.printf("Tên HS: %-8s | Tuổi: %-20d\n", ten, tuoi);
		System.out.printf("Toán: %-4.1f | Lý: %-4.1f | Hóa: %-4.1f | ĐTB: %-4.1f",
			diemToan, diemLy, diemHoa, tinhDiemTrungBinh());
		
	}
	
	public double tinhDiemTrungBinh(){
		return (diemToan + diemLy + diemHoa)/3;
	}
	
	
	
}
