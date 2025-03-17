package Bai5;

public class SachVanHoc extends Sach {
	private int lanXuatBan;
	
	public SachVanHoc() {
		this.lanXuatBan=0;
		 }
	public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int
			lanXuatBan) {
		super(maSach, tenSach, tacGia,gia);
		this.lanXuatBan = lanXuatBan;
	}
	public int getLanXuatBan() {
		return lanXuatBan;
	}
	public void setLanXuatBan(int lanXuatBan) {
		this.lanXuatBan = lanXuatBan;
	}
	@Override
	 public long getGiaSauGiam() {
		if(getGia()>300000)
			return (long) (getGia()*0.8);
		else
			return getGia();
	 }
	public void xuat() {
		 System.out.println("Ma sach: " + getMaSach() + ", Ten sach: " + getTenSach() + ", Tac gia : "
		+ getTacGia() + ", Gia : " + getGiaSauGiam()+", Lan xuat ban: "+lanXuatBan);
		 }



}
