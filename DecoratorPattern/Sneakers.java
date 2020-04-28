package DecoratorPattern;
//定义具体装饰类-球鞋
public class Sneakers extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.println("球鞋");
	}
}
