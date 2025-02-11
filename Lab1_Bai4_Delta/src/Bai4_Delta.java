
import java.util.Scanner;

public class Bai4_Delta {

	public static void main(String[] args) {
		Scanner HeSo = new Scanner(System.in);
		System.out.print("Nhập hệ số a:");
		Double a = HeSo.nextDouble();
		while(a < 0) {
			System.out.print("a < 0! Vui lòng nhập lại:");
			a = HeSo.nextDouble();
		}
		System.out.print("Nhập hệ số b:");
		Double b = HeSo.nextDouble();
		System.out.print("Nhập hệ số c:");
		Double c = HeSo.nextDouble();
		Double delta = Math.pow(b, 2) - 4*a*c;
		System.out.println("Delta = " + delta);
		if(delta >=0) {
			System.out.println("Căn delta = " + Math.sqrt(delta));
		}
	
	}

}
