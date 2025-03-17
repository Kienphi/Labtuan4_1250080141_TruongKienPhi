package Bai4;
import java.util.Scanner;
public class HangThucPham extends HangHoa {
	private String ngaysanxuat;
	private String ngayhethan;
	
	public HangThucPham(){
		this.ngayhethan=" ";
		this.ngaysanxuat=" ";
	}
	public HangThucPham(String mahang, String tenhang, long dongia, String ngaysanxuat, String ngayhethan){
		super(mahang,tenhang,dongia);
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
	}
	
	public String getNgaysanxuat() {
		return ngaysanxuat;
	}
	public void setNgaysanxuat(String ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}
	public String getNgayhethan() {
		return ngayhethan;
	}
	public void setNgayhethan(String ngayhethan) {
		this.ngayhethan = ngayhethan;
	}
	public void nhap(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap ma hang: ");
		mahang = nhap.nextLine();
		System.out.print("Nhap ten hang: ");
		tenhang = nhap.nextLine();
		System.out.print("Nhap don gia: ");
		dongia = nhap.nextLong();
		nhap.nextLine();
		System.out.print("Nhap ngay san xuat: ");
		ngaysanxuat = nhap.nextLine();
		System.out.print("Nhap ngay het han: ");
		ngayhethan = nhap.nextLine();
	}
	public void xuat(){
		System.out.println("Ma hang: "+mahang+", Ten hang: "+tenhang+", Don gia: "+dongia+", ngay san xuat: "+ngaysanxuat+", ngay het han: "+ngayhethan);
	}


}
