package Buoi_10;

import java.util.Scanner;

public class VanDongVien {

	private String hoTen;
    private int tuoi;
    private String monThiDau;
    private double canNang;
    private double chieuCao;
    
    public VanDongVien() {
    	
    }
    public VanDongVien(String hoTen, int tuoi, String monThiDau, Double canNang, Double chieuCao) {
    	this.hoTen=hoTen;
    	this.tuoi=tuoi;
    	this.monThiDau = monThiDau;
    	this.canNang = canNang;
    	this.chieuCao = chieuCao;
    }
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getMonThiDau() {
		return monThiDau;
	}
	public void setMonThiDau(String monThiDau) {
		this.monThiDau = monThiDau;
	}
	public double getCanNang() {
		return canNang;
	}
	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}
	public double getChieuCao() {
		return chieuCao;
	}
	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}
	public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Nhập môn thi đấu: ");
        monThiDau = sc.nextLine();
        System.out.print("Nhập cân nặng: ");
        canNang = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều cao: ");
        chieuCao = Double.parseDouble(sc.nextLine());
    }
	
	public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Môn thi đấu: " + monThiDau);
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.println("Chiều cao: " + chieuCao + " m");
    }
	
	public boolean soSanh(VanDongVien vdv) {
        if (chieuCao > vdv.chieuCao) {
            return true;
        } else if (chieuCao == vdv.chieuCao) {
            return canNang > vdv.canNang;
        }
        return false;
    }

}
