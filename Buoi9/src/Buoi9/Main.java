package Buoi9;

public class Main {

	public static void main(String[] args) {
		
		// câu 1:
		Student student = new Student();
		student.nhapThongTin();
		student.xuatThongTin();
		
		// câu 2:
		XeHoi xh = new XeHoi();
		xh.nhap();
		xh.hienThiThongTin();
		
		// câu 3:
		TroChoi tc = new TroChoi();
		tc.nhap();
		tc.batDau();
		tc.ketThuc();
		// câu 4:
		XeHoi2 xh2 = new XeHoi2();
		xh2.nhap();
		xh2.hienThiThongTin();
		
		XeMay xm = new XeMay();
		xm.nhap();
		xm.hienThiThongTin();
		
		// câu 5:
		
		DieuHoa dh = new DieuHoa();
		dh.nhap();
		dh.hienThiThongTin();
		dh.lamLanh();
		dh.cheDeTietKiem();
		
		MaySay ms = new MaySay();
		ms.nhap();
		ms.hienThiThongTin();
		ms.say();
	}

}
