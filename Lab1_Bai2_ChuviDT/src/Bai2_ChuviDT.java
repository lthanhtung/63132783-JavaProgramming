import java.util.Scanner;

public class Bai2_ChuviDT {

	public static void main(String[] args) {
		Scanner nhapcanh = new Scanner(System.in);
		System.out.print("Nhập cạnh a:");
		Double CanhA = nhapcanh.nextDouble();
		System.out.print("Nhập cạnh b:");
		Double CanhB = nhapcanh.nextDouble();
		Double ChuVi = (CanhA + CanhB) *2;
		Double DienTich = CanhA * CanhB;
		System.out.println("Chu vi: "+ ChuVi);
		System.out.println("Diện Tích:"+ DienTich);
		if (CanhA < CanhB) {
			System.out.println("Cảnh nhỏ hình chữ nhật"+ CanhA);
		}else {
			System.out.println("Cảnh nhỏ hình chữ nhật"+ CanhB);
		}
		
		

	}

}
