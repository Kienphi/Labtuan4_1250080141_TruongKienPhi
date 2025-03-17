package Bai4;
import java.util.Scanner;
public class HangHoa {
	protected String mahang;
	protected String tenhang;
	protected long dongia;
	
	public HangHoa(){
		this.mahang = "";
		this.tenhang = "";
		this.dongia = 0;
	}
	public HangHoa(String mahang, String tenhang, long dongia){
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.dongia = dongia;
	}
	
	public String getMahang() {
		return mahang;
	}
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public long getDongia() {
		return dongia;
	}
	public void setDongia(long dongia) {
		this.dongia = dongia;
	}
	public void nhap(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap ma hang: ");
		mahang = nhap.nextLine();
		System.out.print("Nhap ten hang: ");
		tenhang = nhap.nextLine();
		System.out.print("Nhap don gia: ");
		dongia = nhap.nextLong();
	}
	public void xuat(){
		System.out.println("Ma hang: "+mahang+", Ten hang: "+tenhang+", Don gia: "+dongia);
	}

}
