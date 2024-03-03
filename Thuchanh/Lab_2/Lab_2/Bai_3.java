package Lab_2;
import java.util.Scanner;

public class Bai_3 {
    public static void main() {
        Scanner nhap = new Scanner(System.in);
        double SoDien, soTien;

        System.out.print("Nhập số điện đã sử dụng:");
        SoDien = nhap.nextDouble();
        if (SoDien < 50)
        {
            soTien = SoDien*1000;
        }
        else soTien = 50*1000 + (SoDien - 50)*1200;
        System.out.println("Số tiền phải trả:" + soTien);
    }
}
