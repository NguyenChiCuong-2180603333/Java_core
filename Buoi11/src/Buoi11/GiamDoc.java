package Buoi11;

public class GiamDoc extends NhanVien{
	private double coPhanTrongCongTy;
    private static final int LUONG_1_NGAY_GD = 300;
    
	public double getCoPhanTrongCongTy() {
		return coPhanTrongCongTy;
	}

	public void setCoPhanTrongCongTy(double coPhanTrongCongTy) {
		this.coPhanTrongCongTy = coPhanTrongCongTy;
	}
	
	public GiamDoc() {
		super();
	}
	
	public GiamDoc(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, double coPhanTrongCongTy) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.coPhanTrongCongTy = coPhanTrongCongTy;
	}

	@Override
	public int tinhLuongThang() {
		return LUONG_1_NGAY_GD * soNgayLamViec;
	}
	
	@Override
    public String toString() {
        return "GIÁM ĐỐC - " + super.toString() + String.format(", Cổ phần trong công ty: %.2f%%", coPhanTrongCongTy);
    }

}
