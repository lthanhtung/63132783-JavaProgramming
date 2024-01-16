package tt;

import java.util.Scanner;

public class ChuongTrinhChinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NamSinh;
		String HoTen;
		
		Scanner Nhap = new Scanner(System.in); // Lệnh cho phép nhập từ bàn phím
		 System.out.println("Họ và tên");
		 HoTen = Nhap.nextLine();
		 System.out.print("Năm Sinh:");
		 NamSinh = Nhap.nextInt();
		 int Tuoi = 2024 - NamSinh + 1;
		 System.out.print("Tuổi:"+ Tuoi);
		  
	}

}
