package shape;

import com.eisgroup.javaexam.shapes.Shape;

public class MyRectangle implements Shape {

	private double side1;
	
	private double side2;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side1*side2;
	}

}
