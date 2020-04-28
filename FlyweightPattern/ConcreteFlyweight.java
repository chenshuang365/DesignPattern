package FlyweightPattern;

public class ConcreteFlyweight implements Flyweight {
	private String key;
	ConcreteFlyweight(String key){
		this.key=key;
		System.out.println("具体享元"+key+"被创建");
	}
	@Override
	public void operation(UnsharedConcreteFlyweight outState) {
		// TODO 自动生成的方法存根
		System.out.println("具体享元"+key+"被调用");
		System.out.println("非享元信息是"+outState.getInfo());
		
	}

}
