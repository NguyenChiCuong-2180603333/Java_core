package BaiTap;

import java.util.Scanner;
import java.math.*;

public class BaiBuoi3 {

	public static void main(String[] args) {
		final int Hang_So = 5;
		double sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Tính chiều dài cạnh huyền của một tam giác vuông."
				+ "\n2. tính giá trị đơn thức P(x) = ax^n "
				+ "\n3. trình tính nhập vào số nguyên dương n với 2 ký số, tính và xuất tổng 2 ký số của n"
				+ "\n4. Tính giá trị trung bình của 5 số được nhập từ bàn phím "
				+ "\n5. Nhập vào độ C -> đổi sang độ F  "
				+ "\n6. tỉ giá VND-USD ");
		System.out.println("chọn số:");
		int number = scanner.nextInt();
		switch (number) {
		case 1: {
			System.out.println("Nhập cạnh x: ");
			Float x = scanner.nextFloat();
			System.out.println("Nhập cạnh y: ");
			Float y = scanner.nextFloat();		
			Double result = Math.sqrt(x*x + y*y);
			System.out.println("Cạnh huyền là: " + result);
		}
		break;
		case 2:{
			System.out.println("Nhập số thực a: ");
			float a = scanner.nextFloat();
			int n;
			Double X2 = (double) 8;
			do {
				System.out.println("Nhập số nguyên dương n: ");
				n = scanner.nextInt();
			}while(n < 0); 
			double xMuN = Math.pow(X2, n);
			double result2 = a*xMuN;
			
			System.out.println("Kết quả: " + result2);
			}
		break;
		case 3:{
			int n3;
			do {
			System.out.println("Nhập số nguyên dương ");
			n3 = scanner.nextInt();
			}while(n3 <= 10 || n3 >= 100);
			
			float soDau = n3/10;
			float soCuoi = n3%10;
			
			float result3 = soDau + soCuoi;
			System.out.println("Kết quả: " +result3);
		}
		break;
		case 4:{
			System.out.println("Nhập số thứ nhất: ");
			Double number1 = scanner.nextDouble();
			sum += number1;
			System.out.println("Nhập số thứ hai: ");
			Double number2 = scanner.nextDouble();
			sum += number2;
			System.out.println("Nhập số thứ ba: ");
			Double number3 = scanner.nextDouble();
			sum += number3;
			System.out.println("Nhập số thứ tư: ");
			Double number4 = scanner.nextDouble();
			sum += number4;
			System.out.println("Nhập số thứ năm: ");
			Double number5 = scanner.nextDouble();
			sum += number5;
			double avgSum = sum/(double) Hang_So;
			System.out.println("Kết quả trung bình: " +avgSum);
		}
		break;
		case 5: {
			System.out.println("Nhập độ C: ");
			double C5 = scanner.nextDouble();
			double F = C5*1.8+32;
			System.out.println("Độ F là: "+ F);
		}
		break;
		case 6: {
			System.out.println("Nhập số tiền USD: ");
			double USD = scanner.nextDouble();
			double VND = USD*23500;
			System.out.println("Đôỉ sang tiền Việt là: " + VND);
		}
		break;
		default:
			System.out.println("Chỉ nhập số 1 - 6");
		}

	}

}
