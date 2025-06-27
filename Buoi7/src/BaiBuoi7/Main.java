package BaiBuoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
List<Student> listStudents = new ArrayList<Student>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số lương sinh viên muốn nhập");
		int n = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<n;i++) {
			Student student = new Student();
			System.out.println("\n--- SINH VIÊN " + (i + 1) + " ---");
			student.nhapThongTin();
			listStudents.add(student);
		}
		
		System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
	    for(int i = 0; i < listStudents.size(); i++) {
	        System.out.println("\n--- SINH VIÊN " + (i + 1) + " ---");
	        listStudents.get(i).hienThiThongTin();
	    }
	}

}
