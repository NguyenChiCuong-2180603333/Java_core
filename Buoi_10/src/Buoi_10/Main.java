package Buoi_10;

import java.util.Scanner;

public class Main {
	// Anh mentor chấm xong bài buổi 10 thì sẳn chấm giúp em bài buổi 7 ( không truy cập được link) 
	// và bài buổi 9 với ạ. Em cảm ơn anh

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== MENU CHƯƠNG TRÌNH ===");
            System.out.println("1. Bài 1: Phân Số");
            System.out.println("2. Bài 2: Vận Động Viên");
            System.out.println("3. Bài 3: Quản lý Nhân Viên");
            System.out.println("4. Bài 4: Phương Tiện Giao Thông");
            System.out.println("0. Thoát");
            System.out.print("Chọn bài: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    Management management = new Management();
                    management.bai1();
                    break;
                case 2:
                    Management management2 = new Management();
                    management2.bai2();
                    break;
                case 3:
                    Management management3 = new Management();
                    management3.bai3();
                    break;
                case 4:
                    Management management4 = new Management();
                    management4.bai4();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
	}

}
