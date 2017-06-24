package shape;

import com.eisgroup.javaexam.shapes.Shape;
import com.eisgroup.javaexam.shapes.ShapeFactory;
import com.eisgroup.javaexam.shapes.tests.BaseShapeFactoryTest;

public class MyTest extends  BaseShapeFactoryTest implements ShapeFactory  {

	@Override
	protected ShapeFactory createShapeFactory() {
		// TODO Auto-generated method stub
		return new MyTest();
	}

	@Override
	public Shape createCircle(double a) {
		// TODO Auto-generated method stub
		return new MyCircle();
	}

	@Override
	public Shape createRectangle(double x, double y) {
		// TODO Auto-generated method stub
		return new MyRectangle();
	}

}
