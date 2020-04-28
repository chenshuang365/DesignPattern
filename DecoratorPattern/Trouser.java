package DecoratorPattern;
//定义具体装饰类-裤子
public class Trouser extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.println("裤子");
	}
}
