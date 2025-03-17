package Bai5;

public class Sach {
	private String maSach;
	 private String tenSach;
	 private String tacGia;
	 private long gia;
	 
	 public Sach() {
		 this.maSach = "";
		 this.tenSach = "";
		 this.tacGia = "";
		 this.gia = 0;
		 }
	public Sach(String maSach, String tenSach, String tacGia, long gia) {
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.gia = gia;
		 }
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getGiaSauGiam() {
		 return gia;
		 }
	public void xuat() {
		 System.out.println("Ma sach: " + maSach + ", Ten sach: " + tenSach + ", Tac gia : "
		+ tacGia + ", Gia : " + gia);
		 }




}
