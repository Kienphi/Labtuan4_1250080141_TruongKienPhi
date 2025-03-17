package Bai5;

public class SachGiaoKhoa extends Sach {
	private int lop;
	private String nhaXuatBan;
	 
	 public SachGiaoKhoa() {
		 this.lop = 0;
		 this.nhaXuatBan = "";
		 }
	 public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, int
			 lop, String nhaXuatBan) {
		 super(maSach, tenSach, tacGia,gia);
		 this.lop =lop;
		 this.nhaXuatBan = nhaXuatBan;
			  }
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	@Override
	 public long getGiaSauGiam() {
	 if(nhaXuatBan=="Giao Duc")
		 return (long) (getGia()*0.9);
	 else 
		 return getGia();
	 }
	public void xuat() {
		 System.out.println("Ma sach: " + getMaSach() + ", Ten sach: " + getTenSach() + ", Tac gia : "
		+ getTacGia() + ", Gia : " + getGiaSauGiam()+", Nha xuat ban: "+nhaXuatBan);
		 }
}
