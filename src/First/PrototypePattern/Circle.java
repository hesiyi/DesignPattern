package First.PrototypePattern;

public class Circle extends Shape{

	public Circle() {
		type="CIRCLE";
	}
	@Override
	void draw() {
		 System.out.println("Inside Circle::draw() method.");
	}

}
