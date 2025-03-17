package Bai1;

public class Cylinder extends Circle1 {
	private double height = 1.0;
	public Cylinder(){
		this.height = height ;
	}
	public Cylinder(double radius){
		super(radius);
	}
	public Cylinder(double radius,double height){
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume(){
		return getArea()*height;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", Volume=" + getVolume()
				+ "]";
	}
	
	
}
