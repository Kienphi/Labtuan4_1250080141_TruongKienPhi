package Bai5;
import java.util.ArrayList;
import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	
		ArrayList<Sach> danhSachSach = new ArrayList<Sach>();
		
		SachVanHoc vanhoc = new SachVanHoc("VH001",  "Truyen Kieu","Nguyen Du",400000,5);
		SachGiaoKhoa giaokhoa = new SachGiaoKhoa("GK001","Toan 	10","Hoang Xuan", 250000,10,"Giao Duc");
		
		danhSachSach.add(vanhoc);
		danhSachSach.add(giaokhoa);
		
		 System.out.println("\nThong tin cac quyen sach sau khi giam gia :");
		 for (Sach sach : danhSachSach) {
		 sach.xuat();
		 System.out.println("Gia sau giam: " + sach.getGiaSauGiam());
		 }

		 Sach sachGiaMax = danhSachSach.get(0);
		 for (Sach sach : danhSachSach) {
		 if (sach.getGiaSauGiam() > sachGiaMax.getGiaSauGiam()) {
		 sachGiaMax = sach;
		 }
		 }
		 System.out.println("\nSach co gia lởn nhat sau khi giam: ");
		 sachGiaMax.xuat();
		 System.out.println("Gia sau gia m: " + sachGiaMax.getGiaSauGiam());


	}

}
