package BaiBuoi7;

import java.util.Scanner;

public class Student {
	private String ten;
	private String mssv;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public Student(String ten, String mssv, double diemToan, double diemLy, double diemHoa) {
		this.ten = ten;
		this.mssv=mssv;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		
	}
	public Student() {}
	
	public String getTen(){
		return ten;
	}
	
	public void setTen(String ten){
		this.ten = ten;
	}
	
	public String getMssv(){
		return mssv;
	}
	
	public void setMssv(String mssv){
		this.mssv = mssv;
	}
	
	public double getDiemToan(){
		return diemToan;
	}
	
	public void setDiemToan(double diemToan){
		this.diemToan = diemToan;
	}
	
	public double getDiemLy(){
		return diemLy;
	}
	
	public void setDiemLy(double diemLy){
		this.diemLy = diemLy;
	}
	
	public double getDiemHoa(){
		return diemHoa;
	}
	
	public void setDiemHoa(double diemHoa){
		this.diemHoa = diemHoa;
	}
	
	public void nhapThongTin(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tên sinh viên:");
		this.ten = scanner.nextLine();			
		System.out.println("Mã sinh viên:");
		this.mssv = scanner.nextLine();				
		System.out.println("Điểm toán:");
		this.diemToan = Double.parseDouble(scanner.nextLine());			
		System.out.println("Điểm lý:");
		this.diemLy = Double.parseDouble(scanner.nextLine());			
		System.out.println("Điểm hóa:");
		this.diemHoa = Double.parseDouble(scanner.nextLine());	
		
		}
	
	public double tinhDiemTrungBinh(){
		return (diemToan + diemLy + diemHoa)/3;
	}
	
	public String xepLoai() {
        double dtb = tinhDiemTrungBinh();
        
        if (dtb >= 9) {
            return "Xuất Sắc";
        } else if (dtb >= 8) {
            return "Giỏi";
        } else if (dtb >= 7) {
            return "Khá";
        } else if (dtb >= 6) {
            return "Trung Bình Khá";
        } else if (dtb >= 5) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }
    }
	
	public void hienThiThongTin() {
        double dtb = tinhDiemTrungBinh();
        String loai = xepLoai();
        
        System.out.println("=== THÔNG TIN SINH VIÊN ===");
        System.out.println("Tên: " + this.ten);
        System.out.println("MSSV: " + this.mssv);
        System.out.println("Điểm Toán: " + this.diemToan);
        System.out.println("Điểm Lý: " + this.diemLy);
        System.out.println("Điểm Hóa: " + this.diemHoa);
        System.out.printf("Điểm TB: %.2f\n", dtb);
        System.out.println("Xếp loại: " + loai);
    }
	
	
}
