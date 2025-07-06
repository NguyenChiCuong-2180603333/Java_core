package Buoi11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CongTy congTy = new CongTy("Công ty ABC", "123456789", 1000000);
        
        congTy.themNhanVien(new NhanVienThuong("NV001", "Nguyễn Văn A", "0123456789", 22, null));
        congTy.themNhanVien(new NhanVienThuong("NV002", "Nguyễn Văn B", "0987654321", 25, null));
        congTy.themNhanVien(new TruongPhong("TP001", "Nguyễn Văn C", "0111222333", 26, 0));
        congTy.themNhanVien(new TruongPhong("TP002", "Nguyễn Văn D", "0444555666", 28, 0));
        congTy.themNhanVien(new GiamDoc("GD001", "Nguyễn Văn E", "0777888999", 30, 15.5));
        congTy.themNhanVien(new GiamDoc("GD002", "Nguyễn Văn F", "0333444555", 29, 20.0));
        
        congTy.phanBoNhanVienVaoTruongPhong("TP001", "NV001");
        congTy.phanBoNhanVienVaoTruongPhong("TP002", "NV002");
        
        Scanner scanner = new Scanner(System.in);
        int luaChon;
        
        do {
            System.out.println("\n=== HỆ THỐNG QUẢN LÝ NHÂN SỰ ===");
            System.out.println("1. Nhập thông tin công ty");
            System.out.println("2. Phân bổ nhân viên vào trưởng phòng");
            System.out.println("3. Thêm/xóa nhân viên");
            System.out.println("4. Xuất thông tin toàn bộ người trong công ty");
            System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
            System.out.println("6. Tìm nhân viên thường có lương cao nhất");
            System.out.println("7. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
            System.out.println("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
            System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
            System.out.println("10. Tìm giám đốc có số lượng cổ phần nhiều nhất");
            System.out.println("11. Tính và xuất tổng thu nhập của từng giám đốc");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            
            luaChon = scanner.nextInt();
            
            switch (luaChon) {
                case 1:
                    congTy.nhapThongTinCongTy();
                    break;
                case 2:
                    System.out.print("Nhập mã trưởng phòng: ");
                    String maTp = scanner.next();
                    System.out.print("Nhập mã nhân viên: ");
                    String maNv = scanner.next();
                    congTy.phanBoNhanVienVaoTruongPhong(maTp, maNv);
                    break;
                case 3:
                    System.out.println("3.1. Thêm nhân viên");
                    System.out.println("3.2. Xóa nhân viên");
                    System.out.print("Chọn: ");
                    int chon = scanner.nextInt();
                    scanner.nextLine(); 
                    if (chon == 1) {
                        congTy.themNhanVienMoi();
                    } else if (chon == 2) {
                        System.out.print("Nhập mã số nhân viên cần xóa: ");
                        String ma = scanner.nextLine();
                        congTy.xoaNhanVien(ma);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;
                case 4:
                    congTy.xuatThongTinToanBoNguoi();
                    break;
                case 5:
                    congTy.tinhVaXuatTongLuongCongTy();
                    break;
                case 6:
                    congTy.timNhanVienThuongLuongCaoNhat();
                    break;
                case 7:
                    congTy.timTruongPhongCoNhieuNhanVienNhat();
                    break;
                case 8:
                    congTy.sapXepNhanVienTheoTen();
                    break;
                case 9:
                    congTy.sapXepNhanVienTheoLuongGiamDan();
                    break;
                case 10:
                    congTy.timGiamDocCoCoPhanNhieuNhat();
                    break;
                case 11:
                    congTy.tinhVaXuatTongThuNhapGiamDoc();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);
        
    }

}
