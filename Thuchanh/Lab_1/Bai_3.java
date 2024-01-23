package Lab_1;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a;
        System.out.print("Cạnh khối lập phương:");
        a = nhap.nextInt();

        int TheTich = a*a*a;

        /*hoặc
    double TheTich = Math.pow(a,3);
    trong đó a là hệ số, 3 là số mũ
    */
        System.out.printf("Thể tích khối lập phương:%d",TheTich);

    }
}
