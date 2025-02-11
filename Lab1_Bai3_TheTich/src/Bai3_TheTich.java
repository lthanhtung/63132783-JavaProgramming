import java.util.Scanner;

public class Bai3_TheTich {

	public static void main(String[] args) {
		Scanner NhapCanh = new Scanner(System.in);
		System.out.print("Nhập cạnh:");
		Double Canh = NhapCanh.nextDouble();
		Double TheTich = Canh*Canh*Canh;
		System.out.println("Thể tích của khối có cạnh "+ Canh +" là:" + TheTich);

	}

}
