package Lab_1;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int dai;
        int rong;
        System.out.print("Chiều dài hcn:");
        dai = nhap.nextInt();
        System.out.print("Chiều rộng hcn:");
        rong = nhap.nextInt();

        int Chuvi = (dai + rong) *2;
        System.out.println("Chu vi hcn:" + Chuvi);

        int DienTich = dai * rong;
        System.out.println("Diện tích hcn:" + DienTich);

        int CanhNhoNhat = Math.min(dai,rong);
        System.out.printf("Cạnh nhỏ nhất là:%d",CanhNhoNhat);

    }
}
