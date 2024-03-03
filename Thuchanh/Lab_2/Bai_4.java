package Lab_2;
import java.util.Scanner;

public class Bai_4 {

    public void Menu(int Chon)
    {
        switch (Chon)
        {
            case 1: {
                Bai_1.main();
                break;
            }
            case 2:
            {
                Bai_2.main();
                break;
            }
            case 3:
            {
                Bai_3.main();
                break;
            }
            case 4:
            {
                break;
            }

        }
    }
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int Chon;
        do {
            System.out.printf
            (
                    "\n1.Giải phương trình bậc 1\n" +
                    "2.Giải phương trình bậc 2\n" +
                    "3.Tính tiền điện\n" +
                    "4.Kết thúc chương trình\n" +
                    "=>Chọn chức năng:"

            );
            Chon = nhap.nextInt();
            Bai_4 menu = new Bai_4();
            menu.Menu(Chon);
        }while (Chon < 4);




    }





}
