package Bai3;


public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape = new Shape("blue",false);
		shape.toString();
		System.out.println(shape.toString());
		
		Circle c = new Circle(2.0,"green",false);
		c.getArea();
		c.getPerimeter();
		System.out.println(c.toString());
		
		Rectangle r = new Rectangle(3.0,4.0,"yellow",false);
		r.getArea();
		r.getPerimeter();
		System.out.println(r.toString());
		
		Square s = new Square(2.5,"purple",true);
		s.getArea();
		s.getPerimeter();
		System.out.println(s.toString());


	}

}
