
public class CT {

	public static void main(String[] args) {
		//Tạo ra 2 sản phẩm (hardcode)
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Banh Mat", "Đồ ăn nhanh", "bm.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Nuoc 7up");
		sp1.setLoaiSP("Đồ uống");
		sp1.setAnhSP("7up");
		
		// In ra màn hình 
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSP();
		thongtinSP2 += "Tên SP2 là:" + sp2.getTenSP();
		System.out.println(thongtinSP1);
		System.out.print(thongtinSP2);
		
	}

}
