package Bai1;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1 = new Circle1(2.0,"blue");
		c1.getArea();
		c1.toString();
		System.out.println(c1.toString());
		
		Cylinder c2 = new Cylinder(2.0,3.0);
		c2.getVolume();
		c2.toString();
		System.out.println(c2.toString());
	}
}
