
public class SanPham {
	//Định nghĩa thuộc tính của đối tượng
	//private:
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP;
	//hàm khởi tạo
	public SanPham() { //hàm tạo không tham số
		// khỏi tạo các giá trị bạn đầu cho các thuộc tính
		
	}
//	public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {	
//		maSP = _maSP;
//		tenSP = _tenSP;
//		loaiSP = _loaiSP;
//		anhSP = _anhSP;
//	}
	
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {	
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	//Các getter và setter
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	//Phương thức toString

	@Override
	public String toString() {
		return "[mã SP=" + maSP + ", tên SP=" + tenSP + ", loai SP=" + loaiSP + ", anhSP=" + anhSP + "]";
	}
	
	
	
	
}
