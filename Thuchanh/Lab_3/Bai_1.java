import java.util.Scanner;

public class Bai_1 {
    public void KtraSNT(int n)
    {
        int dem = 0;
        for (int i = 1; i <= n;i++)
        {
            if (n%i == 0)   dem++;
        }
        if (dem == 2) System.out.println(n +" là số nguyên tố");
        else System.out.println(n +" không phải là số nguyên tố");
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.print("Nhập số cần kiểm tra:");
        n = nhap.nextInt();
        Bai_1 KtraSNT = new Bai_1();
       KtraSNT.KtraSNT(n);


    }
}
