package Bai4;
import java.util.Scanner;
public class HangDienMay extends HangHoa {
	private int thoigianbaohanh;
	private int dienap;
	private int congsuat;
	
	public HangDienMay(){
		this.thoigianbaohanh = 0;
		this.dienap = 0;
		this.congsuat = 0;
	}
	
	public HangDienMay(String mahang, String tenhang, long dongia, int thoigianbaohanh, int dienap, int congsuat){
		super(mahang,tenhang,dongia);
		this.thoigianbaohanh = thoigianbaohanh;
		this.dienap = dienap;
		this.congsuat = congsuat;
	}
	
	public int getThoigianbaohanh() {
		return thoigianbaohanh;
	}

	public void setThoigianbaohanh(int thoigianbaohanh) {
		this.thoigianbaohanh = thoigianbaohanh;
	}

	public int getDienap() {
		return dienap;
	}

	public void setDienap(int dienap) {
		this.dienap = dienap;
	}

	public int getCongsuat() {
		return congsuat;
	}

	public void setCongsuat(int congsuat) {
		this.congsuat = congsuat;
	}

	public void nhap(){
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap ma hang: ");
		mahang = nhap.nextLine();
		System.out.print("Nhap ten hang: ");
		tenhang = nhap.nextLine();
		System.out.print("Nhap don gia: ");
		dongia = nhap.nextLong();
		System.out.print("Nhap thoi gian bao hanh: ");
		thoigianbaohanh = nhap.nextInt();
		System.out.print("Nhap dien ap: ");
		dienap = nhap.nextInt();
		System.out.print("Nhap cong suat: ");
		congsuat = nhap.nextInt();
	}
	public void xuat(){
		System.out.println("Ma hang: "+mahang+", Ten hang: "+tenhang+", Don gia: "+dongia+", thoi gian bao hanh: "+thoigianbaohanh+", dien ap: "+dienap+", cong suat: "+congsuat);
	}

}
