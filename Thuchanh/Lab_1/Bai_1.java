package Lab_1;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String hoten;
        double Dtb;
        hoten = nhap.nextLine();
        System.out.print("Họ tên sinh viên:" + hoten);
        Dtb = nhap.nextDouble();
        
        System.out.print("Điểm trung bình:" + Dtb );

        System.out.printf("\nHọ tên sinh viên: %s \n Điểm trung bình sinh viên: %.2f",hoten,Dtb);

    }
}
