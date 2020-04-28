package FlyweightPattern;

public class ConcreteFlyweight implements Flyweight {
	private String key;
	ConcreteFlyweight(String key){
		this.key=key;
		System.out.println("������Ԫ"+key+"������");
	}
	@Override
	public void operation(UnsharedConcreteFlyweight outState) {
		// TODO �Զ����ɵķ������
		System.out.println("������Ԫ"+key+"������");
		System.out.println("����Ԫ��Ϣ��"+outState.getInfo());
		
	}

}
