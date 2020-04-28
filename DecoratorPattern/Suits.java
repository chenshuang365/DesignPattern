package DecoratorPattern;
//定义具体装饰类-西装
public class Suits extends Finery {
	
	@Override
	public void show() {
		super.show();
		System.out.println("西装");
	}
}
