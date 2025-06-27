package Buoi9;

import java.util.Scanner;

public class TroChoi {
	private String tenTroChoi;
    private int soLuotChoi;
    
	public String getTenTroChoi() {
		return tenTroChoi;
	}
	public void setTenTroChoi(String tenTroChoi) {
		this.tenTroChoi = tenTroChoi;
	}
	public int getSoLuotChoi() {
		return soLuotChoi;
	}
	public void setSoLuotChoi(int soLuotChoi) {
		this.soLuotChoi = soLuotChoi;
	}
	
	public TroChoi(String tenTroChoi, int soLuotChoi) {
		this.tenTroChoi = tenTroChoi;
        this.soLuotChoi = soLuotChoi;
	}
	
	public TroChoi() {

	}
	
	public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên trò chơi: ");
        tenTroChoi = scanner.nextLine();
        System.out.print("Nhập số lượt chơi: ");
        soLuotChoi = scanner.nextInt();
    }
    
    public void batDau() {
        System.out.println("Bắt đầu trò chơi: " + tenTroChoi);
        System.out.println("Số lượt chơi: " + soLuotChoi);
    }
    
    public void ketThuc() {
        System.out.println("Kết thúc trò chơi: " + tenTroChoi);
    }
}
