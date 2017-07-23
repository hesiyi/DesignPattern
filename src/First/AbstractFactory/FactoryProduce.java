package First.AbstractFactory;

public class FactoryProduce {

	public 	static AbstractFactory getFactory(String Shape){
		if(Shape.equals("SHAPE")){
			return new ShapeFactory();
		}
		return null;
	}
}
