package Lab_2;

import java.util.Scanner;

public class Bai_1 {
    public static void main() {
        double a,b;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập hệ số a:");
        a = nhap.nextDouble();
        System.out.print("Nhập hệ số b:");
        b = nhap.nextDouble();
        if (a == 0)
        {
           if (b ==0) System.out.print("phương trình có vô số nghiệm");
           else System.out.print("Phương trình vô nghiệm");

        }
        else System.out.print("Phương trình có nghiệm là:" + -b/a);

    }
}
