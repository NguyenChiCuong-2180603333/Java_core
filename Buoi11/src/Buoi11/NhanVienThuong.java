package Buoi11;

public class NhanVienThuong extends NhanVien{
	private String truongPhongQuanLy;

	
	public String getTruongPhongQuanLy() {
		return truongPhongQuanLy;
	}


	public void setTruongPhongQuanLy(String truongPhongQuanLy) {
		this.truongPhongQuanLy = truongPhongQuanLy;
	}
	public NhanVienThuong() {
	}
	
	public NhanVienThuong(String maSo, String hoTen, String soDienThoai, int soNgayLamViec,String truongPhongQuanLy) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.truongPhongQuanLy = truongPhongQuanLy;
	}

	@Override
	public int tinhLuongThang() {
		return LUONG_1_NGAY * soNgayLamViec;
	}
	
	@Override
    public String toString() {
        return "NHÂN VIÊN THƯỜNG - " + super.toString() + String.format(", Trưởng phòng quản lý: %s", 
                truongPhongQuanLy != null ? truongPhongQuanLy : "Chưa có");
    }

}
