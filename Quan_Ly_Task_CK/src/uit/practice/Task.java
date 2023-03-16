package uit.practice;

public class Task implements NhapXuat{

	
		private String maTask; 
		private String tenTask;
		private float gioThucHien;
		private String maNV;
	
		public String getMaTask() {
			return maTask;
		}
		public void setMaTask(String maTask) {
			this.maTask = maTask;
		}
		public String getTenTask() {
			return tenTask;
		}
		public void setTenTask(String tenTask) {
			this.tenTask = tenTask;
		}
		public float getGioThucHien() {
			return gioThucHien;
		}
		public void setGioThucHien(float gioThucHien) {
			this.gioThucHien = gioThucHien;
		}
		public String getMaNV() {
			return maNV;
		}
		public void setMaNV(String maNV) {
			this.maNV = maNV;
		}
		
	
		public Task() {
			this.maNV = "-1";
		}
		
		public Task(String maTask, String tenTask, float gioThucHien, String maNV) {
			this.maTask = maTask;
			this.tenTask = tenTask;
			this.gioThucHien = gioThucHien;
			this.maNV = maNV;
		}
		
		public Task(String maTask, String tenTask, float gioThucHien) {
			this.maTask = maTask;
			this.tenTask = tenTask;
			this.gioThucHien = gioThucHien;
		}
		@Override
		public void xuat() {
			System.out.println("Task - Mã: " + this.maTask + "\t Tên Task: " + this.tenTask + "\tGiờ thực hiện: " + this.gioThucHien);
			
		}
		
		
		
		

}
