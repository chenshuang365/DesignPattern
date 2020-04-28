package DecoratorPattern;
//定义具体装饰类-领带
public class Tie extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.println("领带");
	}
}
