package BuilderPattern;
//���彨����
public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		// TODO �Զ����ɵķ������
		product.setPartA("����PartA");
	}

	@Override
	public void buildPartB() {
		// TODO �Զ����ɵķ������
		product.setPartB("����PartB");
	}
	@Override
	public void buildPartC() {
		// TODO �Զ����ɵķ������
		product.setPartC("����PartC");
	}
}
