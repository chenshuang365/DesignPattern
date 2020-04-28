package DecoratorPattern;
//定义装饰类，让具体装饰类继承，提供show方法
public class Finery extends Person {
	protected Person component;
	public void Decorate(Person component) {
		this.component=component;
	}
	
	@Override
	public void show() {
		if (component !=null) {
			component.show();
		}
	}
}
