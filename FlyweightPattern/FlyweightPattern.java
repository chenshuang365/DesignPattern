package FlyweightPattern;

public class FlyweightPattern{

	public static void main(String[] args){
		// TODO �Զ����ɵķ������
		FlyweightFactory factory=new FlyweightFactory();
		FlyweightFactory f1=(FlyweightFactory) factory.getFlyweight("a");
		FlyweightFactory f2=(FlyweightFactory) factory.getFlyweight("a");
		FlyweightFactory f3=(FlyweightFactory) factory.getFlyweight("b");
		FlyweightFactory f4=(FlyweightFactory) factory.getFlyweight("b");
		f1.operation(new UnsharedConcreteFlyweight("��һ�ε���a"));
		f2.operation(new UnsharedConcreteFlyweight("�ڶ��ε���a"));
		f3.operation(new UnsharedConcreteFlyweight("��һ�ε���b"));
		f1.operation(new UnsharedConcreteFlyweight("�ڶ��ε���b"));		
	}

}
