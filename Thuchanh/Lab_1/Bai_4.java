package Lab_1;

import java.util.Scanner;

public class Bai_4 {


    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a,b,c;
        do {
            System.out.print("Các hệ số của ptr bậc 2(a,b,c):");
            a = nhap.nextInt();
            b = nhap.nextInt();
            c = nhap.nextInt();
        }while (a == 0);
        double delta = Math.pow(b,2) - 4*a*c;
        System.out.print("Căn bậc 2 của delta:" + Math.sqrt(delta));


    }
}
