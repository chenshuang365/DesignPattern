package DecoratorPattern;
//具体装饰类-皮鞋
public class LeatherShoes extends Finery {

	@Override
	public void show() {
		super.show();
		System.out.println("皮鞋");
	}
}
