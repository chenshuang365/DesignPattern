package BuilderPattern;
//具体建造者
public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		// TODO 自动生成的方法存根
		product.setPartA("建造PartA");
	}

	@Override
	public void buildPartB() {
		// TODO 自动生成的方法存根
		product.setPartB("建造PartB");
	}
	@Override
	public void buildPartC() {
		// TODO 自动生成的方法存根
		product.setPartC("建造PartC");
	}
}
