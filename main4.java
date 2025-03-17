package Bai4;
import java.util.Scanner;
public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		HangDienMay hangdienmay = new HangDienMay();
		hangdienmay.nhap();
		hangdienmay.xuat();
		
		HangThucPham thucpham = new HangThucPham();
		thucpham.nhap();
		thucpham.xuat();
	}

}
