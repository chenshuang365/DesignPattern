package DecoratorPattern;
//定义具体装饰类-T恤
public class TShirts extends Finery {
	
	@Override
	public void show() {
		super.show();
		System.out.println("T恤");
	} 
}
