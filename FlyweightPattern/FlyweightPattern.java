package FlyweightPattern;

public class FlyweightPattern{

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		FlyweightFactory factory=new FlyweightFactory();
		FlyweightFactory f1=(FlyweightFactory) factory.getFlyweight("a");
		FlyweightFactory f2=(FlyweightFactory) factory.getFlyweight("a");
		FlyweightFactory f3=(FlyweightFactory) factory.getFlyweight("b");
		FlyweightFactory f4=(FlyweightFactory) factory.getFlyweight("b");
		f1.operation(new UnsharedConcreteFlyweight("第一次调用a"));
		f2.operation(new UnsharedConcreteFlyweight("第二次调用a"));
		f3.operation(new UnsharedConcreteFlyweight("第一次调用b"));
		f1.operation(new UnsharedConcreteFlyweight("第二次调用b"));		
	}

}
