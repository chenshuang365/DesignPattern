package AbstractFactoryPattern;

public class LenovoComputer extends Computer{
	@Override
	public void start() {
		System.out.println("生产联想电脑");//定义一个具体的产品类
	}
}
