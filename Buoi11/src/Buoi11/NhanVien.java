package Buoi11;

	public abstract class NhanVien {
	protected String maSo;
    protected String hoTen;
    protected String soDienThoai;
    protected int soNgayLamViec;
    protected static final int LUONG_1_NGAY = 100;
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}
	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	public static int getLuong1Ngay() {
		return LUONG_1_NGAY;
	}
	
	public NhanVien() {
		
	}
	
	public NhanVien(String maSO, String hoTen, String soDienThoai, int soNgayLamViec) {
		this.maSo = maSO;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public abstract int tinhLuongThang();
	
	@Override
    public String toString() {
        return String.format("Mã số: %s, Họ tên: %s, SĐT: %s, Số ngày làm việc: %d, Lương tháng: %d",
                maSo, hoTen, soDienThoai, soNgayLamViec, tinhLuongThang());
    }

}
