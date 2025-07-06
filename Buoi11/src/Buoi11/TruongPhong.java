package Buoi11;

public class TruongPhong extends NhanVien{
	private int soLuongNhanVienDuoiQuyen;
    private static final int LUONG_1_NGAY_TP = 200;
    
    
	public int getSoLuongNhanVienDuoiQuyen() {
		return soLuongNhanVienDuoiQuyen;
	}


	public void setSoLuongNhanVienDuoiQuyen(int soLuongNhanVienDuoiQuyen) {
		this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
	}
	
	public TruongPhong() {
		super();
	}
	
	public TruongPhong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, int soLuongNhanVienDuoiQuyen) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.soLuongNhanVienDuoiQuyen = soLuongNhanVienDuoiQuyen;
	}


	@Override
	public int tinhLuongThang() {
        return LUONG_1_NGAY * soNgayLamViec + 100 * soLuongNhanVienDuoiQuyen;
	}
	
	@Override
    public String toString() {
        return "TRƯỞNG PHÒNG - " + super.toString() + String.format(", Số nhân viên dưới quyền: %d", soLuongNhanVienDuoiQuyen);
    }

}
