package Buoi_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {

	public void bai1() {
		Scanner scanner = new Scanner(System.in);
		Phanso phanso = new Phanso();
		phanso.nhapPhanSo();
		phanso.xuatPhanSo();
		
		Phanso phanso2 = new Phanso();
		phanso2.nhapPhanSo();
		phanso2.xuatPhanSo();
		
		phanso.cong(phanso2);
		phanso.tru(phanso2);
		phanso.nhan(phanso2);
		phanso.chia(phanso2);
	}
	
	public void bai2() {
		Scanner sc = new Scanner(System.in);
		VanDongVien vanDongVien = new VanDongVien();
		VanDongVien vanDongVien2 = new VanDongVien();
		
		vanDongVien.nhap();
		vanDongVien.xuat();
		
		vanDongVien2.nhap();
		vanDongVien2.xuat();
		
		System.out.println("\n--- SO SÁNH ---");
		if(vanDongVien.soSanh(vanDongVien2)) {
			System.out.println(vanDongVien.getHoTen() + " lớn hơn " + vanDongVien2.getHoTen());
		}else if(vanDongVien2.soSanh(vanDongVien)){
            System.out.println(vanDongVien2.getHoTen() + " lớn hơn " + vanDongVien.getHoTen());
		}else{
			System.out.println("Hai vận động viên bằng nhau");
		}
	}
	
	public void bai3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số lượng nhân viên: ");
		int n = sc.nextInt();
		ArrayList<NhanVien> danhSach = new ArrayList<NhanVien>();
		for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            System.out.println("1. Nhân viên sản xuất");
            System.out.println("2. Nhân viên văn phòng");
            System.out.print("Chọn loại nhân viên: ");
            int loai = sc.nextInt();
            
            if (loai == 1) {
                NhanVienSanXuat nvsx = new NhanVienSanXuat();
                nvsx.nhap();
                danhSach.add(nvsx);
            } else {
                NhanVienVanPhong nvvp = new NhanVienVanPhong();
                nvvp.nhap();
                danhSach.add(nvvp);
            }
        }
        
        System.out.println("\n--- DANH SÁCH NHÂN VIÊN ---");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Nhân viên " + (i + 1) + ":");
            danhSach.get(i).xuat();
            System.out.println("---");
        }		
	}
	
	public void bai4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thông tin phương tiện giao thông:");
        PhuongTienGiaoThong pt = new PhuongTienGiaoThong();
        pt.nhap();
        System.out.println("\n--- THÔNG TIN PHƯƠNG TIỆN ---");
        pt.xuat();
        
        System.out.print("\nNhập số lượng ô tô: ");
        int n = sc.nextInt();
        ArrayList<Oto> danhSachOto = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin ô tô thứ " + (i + 1) + ":");
            Oto oto = new Oto();
            oto.nhap();
            danhSachOto.add(oto);
        }
        
        System.out.println("\n--- DANH SÁCH Ô TÔ ---");
        for (int i = 0; i < danhSachOto.size(); i++) {
            System.out.println("Ô tô " + (i + 1) + ":");
            danhSachOto.get(i).xuat();
            System.out.println("---");
        }
        
        System.out.println("\n--- CÁC Ô TÔ CÓ CÙNG VẬN TỐC ---");
        for (int i = 0; i < danhSachOto.size(); i++) {
            for (int j = i + 1; j < danhSachOto.size(); j++) {
                if (danhSachOto.get(i).getVanTocToiDa() == danhSachOto.get(j).getVanTocToiDa()) {
                    System.out.println(danhSachOto.get(i).getTenPhuongTien() + " và " + 
                                     danhSachOto.get(j).getTenPhuongTien() + 
                                     " có cùng vận tốc: " + danhSachOto.get(i).getVanTocToiDa() + " km/h");
                }
            }
        }
    }


}
