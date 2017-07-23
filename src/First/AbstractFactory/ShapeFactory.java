package First.AbstractFactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		if(shape==null){
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
	
}
