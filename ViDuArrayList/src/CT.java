import java.util.ArrayList;
import java.util.Iterator;

public class CT {

	public static void main(String[] args) {
		// Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		//Tạo mới danh sách
		dsSanPham = new ArrayList<SanPham>();
		//Nhập 3 sản phẩm
		SanPham sp1 = new SanPham(1, "Cơm", "Đồ ăn", "c.jpg");
		SanPham sp2 = new SanPham(2, "Mỳ", "Đồ ăn nhanh", "m.jpg");
		SanPham sp3 = new SanPham(3, "Tiger", "Đồ uống", "ti.jpg");
		//Thêm sản phẩm vào danh sách
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		//Cách 1: Foreach
		for (SanPham x : dsSanPham) {
			System.out.println(x.toString());
		}
		System.out.println("-----------------------------------------------------------------------");
		//Cách 2: Truyền thống
		for (int i = 0; i < dsSanPham.size(); i++) {
//			System.out.println(dsSanPham.get(i).toString()); Cách ghi nhanh
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}
}
