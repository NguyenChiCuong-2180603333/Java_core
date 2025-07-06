package Buoi11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CongTy {
	private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    private List<NhanVien> danhSachNhanVien;  
    
    
    
    public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public double getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(double doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public List<NhanVien> getDanhSachNhanVien() {
		return danhSachNhanVien;
	}

	public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
	public CongTy() {
		
	}

	public CongTy(String tenCongTy, String maSoThue, double doanhThuThang) {
        this.tenCongTy = tenCongTy;
        this.maSoThue = maSoThue;
        this.doanhThuThang = doanhThuThang;
        this.danhSachNhanVien = new ArrayList<>();
    }
    
    // 1. Nhập thông tin công ty
    public void nhapThongTinCongTy() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tên công ty: ");
        this.tenCongTy = scanner.nextLine();
        
        System.out.print("Nhập mã số thuế: ");
        this.maSoThue = scanner.nextLine();
        
        System.out.print("Nhập doanh thu tháng: ");
        this.doanhThuThang = scanner.nextDouble();
        
        System.out.println("Đã nhập thông tin công ty thành công!");
    }
    
    // 2. Phân bố nhân viên vào trưởng phòng
    public void phanBoNhanVienVaoTruongPhong(String maTruongPhong, String maNhanVien) {
        NhanVien truongPhong = timNhanVienTheoMa(maTruongPhong);
        NhanVien nhanVien = timNhanVienTheoMa(maNhanVien);
        
        if (truongPhong instanceof TruongPhong && nhanVien instanceof NhanVienThuong) {
            ((NhanVienThuong) nhanVien).setTruongPhongQuanLy(truongPhong.getHoTen());
            TruongPhong tp = (TruongPhong) truongPhong;
            tp.setSoLuongNhanVienDuoiQuyen(tp.getSoLuongNhanVienDuoiQuyen() + 1);
            System.out.println("Đã phân bổ nhân viên " + nhanVien.getHoTen() + " vào trưởng phòng " + truongPhong.getHoTen());
        } else {
            System.out.println("Không thể phân bổ! Kiểm tra lại mã số hoặc loại nhân viên.");
        }
    }
    
    // 3. Thêm, xóa thông tin một nhân sự
    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
        System.out.println("Đã thêm nhân viên: " + nhanVien.getHoTen());
    }
    
    public void xoaNhanVien(String maSo) {
        NhanVien nhanVien = timNhanVienTheoMa(maSo);
        if (nhanVien != null) {
            if (nhanVien instanceof TruongPhong) {
                for (NhanVien nv : danhSachNhanVien) {
                    if (nv instanceof NhanVienThuong && 
                        nhanVien.getHoTen().equals(((NhanVienThuong) nv).getTruongPhongQuanLy())) {
                        ((NhanVienThuong) nv).setTruongPhongQuanLy(null);
                    }
                }
            }
            danhSachNhanVien.remove(nhanVien);
            System.out.println("Đã xóa nhân viên: " + nhanVien.getHoTen());
        } else {
            System.out.println("Không tìm thấy nhân viên có mã số: " + maSo);
        }
    }
    
    // 4. Xuất ra thông tin toàn bộ người trong công ty
    public void xuatThongTinToanBoNguoi() {
        System.out.println("\n=== THÔNG TIN TOÀN BỘ NHÂN VIÊN ===");
        System.out.println("Công ty: " + tenCongTy);
        System.out.println("Mã số thuế: " + maSoThue);
        System.out.println("Doanh thu tháng: " + doanhThuThang);
        System.out.println("Tổng số nhân viên: " + danhSachNhanVien.size());
        System.out.println("----------------------------------------");
        
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }
    
    // 5. Tính và xuất tổng lương cho toàn công ty
    public void tinhVaXuatTongLuongCongTy() {
        int tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuongThang();
        }
        
        System.out.println("\n=== TỔNG LƯƠNG TOÀN CÔNG TY ===");
        System.out.println("Tổng lương tháng: " + tongLuong);
        System.out.println("Lợi nhuận công ty: " + (int)(doanhThuThang - tongLuong));
    }
    
    // 6. Tìm nhân viên thường có lương cao nhất
    public void timNhanVienThuongLuongCaoNhat() {
        Optional<NhanVien> nvMax = danhSachNhanVien.stream()
                .filter(nv -> nv instanceof NhanVienThuong)
                .max(Comparator.comparingDouble(NhanVien::tinhLuongThang));
        
        if (nvMax.isPresent()) {
            System.out.println("\n=== NHÂN VIÊN THƯỜNG CÓ LƯƠNG CAO NHẤT ===");
            System.out.println(nvMax.get());
        } else {
            System.out.println("Không có nhân viên thường nào trong công ty.");
        }
    }
    
    // 7. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất
    public void timTruongPhongCoNhieuNhanVienNhat() {
        Optional<TruongPhong> tpMax = danhSachNhanVien.stream()
                .filter(nv -> nv instanceof TruongPhong)
                .map(nv -> (TruongPhong) nv)
                .max(Comparator.comparingInt(TruongPhong::getSoLuongNhanVienDuoiQuyen));
        
        if (tpMax.isPresent()) {
            System.out.println("\n=== TRƯỞNG PHÒNG CÓ NHIỀU NHÂN VIÊN DƯỚI QUYỀN NHẤT ===");
            System.out.println(tpMax.get());
        } else {
            System.out.println("Không có trưởng phòng nào trong công ty.");
        }
    }
    
    // 8. Sắp xếp nhân viên toàn công ty theo thứ tự abc
    public void sapXepNhanVienTheoTen() {
        danhSachNhanVien.sort(Comparator.comparing(NhanVien::getHoTen));
        System.out.println("\n=== DANH SÁCH NHÂN VIÊN THEO THỨ TỰ ABC ===");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }
    
    // 9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần
    public void sapXepNhanVienTheoLuongGiamDan() {
        danhSachNhanVien.sort(Comparator.comparingDouble(NhanVien::tinhLuongThang).reversed());
        System.out.println("\n=== DANH SÁCH NHÂN VIÊN THEO LƯƠNG GIẢM DẦN ===");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }
    }
    
    // 10. Tìm giám đốc có số lượng cổ phần nhiều nhất
    public void timGiamDocCoCoPhanNhieuNhat() {
        Optional<GiamDoc> gdMax = danhSachNhanVien.stream()
                .filter(nv -> nv instanceof GiamDoc)
                .map(nv -> (GiamDoc) nv)
                .max(Comparator.comparingDouble(GiamDoc::getCoPhanTrongCongTy));
        
        if (gdMax.isPresent()) {
            System.out.println("\n=== GIÁM ĐỐC CÓ CỔ PHẦN NHIỀU NHẤT ===");
            System.out.println(gdMax.get());
        } else {
            System.out.println("Không có giám đốc nào trong công ty.");
        }
    }
    
    // 11. Tính và xuất tổng thu nhập của từng giám đốc
    public void tinhVaXuatTongThuNhapGiamDoc() {
        System.out.println("\n=== TỔNG THU NHẬP CỦA TỪNG GIÁM ĐỐC ===");
        List<GiamDoc> danhSachGiamDoc = danhSachNhanVien.stream()
                .filter(nv -> nv instanceof GiamDoc)
                .map(nv -> (GiamDoc) nv)
                .collect(Collectors.toList());
        
        if (danhSachGiamDoc.isEmpty()) {
            System.out.println("Không có giám đốc nào trong công ty.");
            return;
        }
        
        for (GiamDoc gd : danhSachGiamDoc) {
            double thuNhapCoPhan = (doanhThuThang - tongLuongToanCongTy()) * gd.getCoPhanTrongCongTy() / 100;
            double tongThuNhap = gd.tinhLuongThang() + thuNhapCoPhan;
            
            System.out.println("Giám đốc: " + gd.getHoTen());
            System.out.println("  - Lương tháng: " + gd.tinhLuongThang());
            System.out.println("  - Thu nhập từ cổ phần: " + (int)thuNhapCoPhan);
            System.out.println("  - Tổng thu nhập: " + (int)tongThuNhap);
            System.out.println("----------------------------------------");
        }
    }
    
    private NhanVien timNhanVienTheoMa(String maSo) {
        return danhSachNhanVien.stream()
                .filter(nv -> nv.getMaSo().equals(maSo))
                .findFirst()
                .orElse(null);
    }
    
    private int tongLuongToanCongTy() {
        int tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuongThang();
        }
        return tongLuong;
    }
    
    public void themNhanVienMoi() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nChọn loại nhân viên:");
        System.out.println("1. Nhân viên thường");
        System.out.println("2. Trưởng phòng");
        System.out.println("3. Giám đốc");
        System.out.print("Nhập lựa chọn: ");
        
        int loai = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Nhập mã số: ");
        String maSo = scanner.nextLine();
        
        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Nhập số điện thoại: ");
        String soDienThoai = scanner.nextLine();
        
        System.out.print("Nhập số ngày làm việc: ");
        int soNgayLamViec = scanner.nextInt();
        scanner.nextLine();
        
        NhanVien nhanVienMoi = null;
        
        switch (loai) {
            case 1:
                nhanVienMoi = new NhanVienThuong(maSo, hoTen, soDienThoai, soNgayLamViec, null);
                break;
                
            case 2:
                System.out.print("Nhập số lượng nhân viên dưới quyền: ");
                int soNhanVien = scanner.nextInt();
                nhanVienMoi = new TruongPhong(maSo, hoTen, soDienThoai, soNgayLamViec, soNhanVien);
                break;
                
            case 3:
                System.out.print("Nhập tỷ lệ cổ phần (%): ");
                double coPhan = scanner.nextDouble();
                nhanVienMoi = new GiamDoc(maSo, hoTen, soDienThoai, soNgayLamViec, coPhan);
                break;
                
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        
        if (nhanVienMoi != null) {
            this.themNhanVien(nhanVienMoi);
        }
    }
   
}


