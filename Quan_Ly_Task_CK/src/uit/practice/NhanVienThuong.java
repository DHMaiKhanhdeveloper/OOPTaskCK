package uit.practice;

public class NhanVienThuong extends NhanSu{
	final int LUONG_NGAY = 200;
	final int PHU_CAP_1 = 300;
	final int PHU_CAP_2 = 1000;
	public NhanVienThuong() {
		super();
	}
	
	public NhanVienThuong(String maNV, String tenNV, String namSinh, String email, String soDienThoai,String maPhongBan,
			float soNgayLamViec) {
		super(maNV, tenNV, namSinh, email, soDienThoai, maPhongBan, soNgayLamViec);
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		
	}

}
