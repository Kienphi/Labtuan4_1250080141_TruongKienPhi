package Bai3;

public class Square extends Rectangle {
	public Square(){
		
	}
	public Square(double side){
		super(side, side);
	}
	public Square(double side, String color, boolean filled){
		super(side, side,color, filled);
	}
	public double getSide() {
		return super.getWidth();
	}

	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	@Override
	public String toString() {
		return "Square [color="+getColor()+", filled="+isFilled()+", getSide()=" + getSide() +", Area="+getArea()+", Perimeter="+getPerimeter()+"]";
	}
	

}
