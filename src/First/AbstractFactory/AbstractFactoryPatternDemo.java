package First.AbstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取工厂形状
		AbstractFactory abstractFactory=FactoryProduce.getFactory("SHAPE");
		// 获取形状为 Circle 的对象
		Shape shape1=abstractFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2=abstractFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3=abstractFactory.getShape("SQUARE");
		shape3.draw();
	}

}
