package designPattern;


public class FactoryMethod{
	
	public static void main(String[] args) {
		
	}

}


// 工厂方法模式
abstract class Application{
	abstract Product createProduct();

	Product getObject(){
		Product product = createProduct();

		return product;
	}
}

class  ConcreateProductA extends Application{

	@Override
	Product createProduct() {
		return new ProductA();
	}

}
class  ConcreateProductB extends Application{

	@Override
	Product createProduct() {
		return new ProductB();
	}
}


// 开闭原则：open close原则, 单一职责原则

class SimpleFactory{

	public static Product createProduct(String type){
		if ("1".equals(type)) {
			return new ProductA();
		}
		
		if ("2".equals(type)) {
			return new ProductB();
		}
		return null;
	}

}

interface Product{
	public void method();
		
}

class ProductA implements Product{

	@Override
	public void method() {
		System.out.println("ProductA.method.executed.");
	}

}


class ProductB implements Product{

	@Override
	public void method() {
		System.out.println("ProductB.method.executed.");
	}

}





