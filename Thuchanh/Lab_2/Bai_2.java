package Lab_2;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập hệ số a:");
        a = nhap.nextDouble();
        System.out.print("Nhập hệ số b:");
        b = nhap.nextDouble();
        System.out.print("Nhập hệ số c:");
        c = nhap.nextDouble();
        if (a == 0)
        {
            System.out.println("Đây là phương trình bậc nhất");
            System.out.print("Phương trình có nghiệm:" + -b/c);

        }
        else
        {
            double deltal = Math.pow(b,2) - 4*a*c;
            if (deltal < 0 ) System.out.print("phương trình vô nghiệm");
            else if (deltal == 0 ) System.out.print("phương trình có nghiệm kép:"+ -b/(2*a));
            else
            {
                System.out.println("phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = "+ (-b + Math.sqrt(deltal))/(2*a) );
                System.out.print("x2 = "+ (-b - Math.sqrt(deltal))/(2*a) );

            }


        }
    }
}
