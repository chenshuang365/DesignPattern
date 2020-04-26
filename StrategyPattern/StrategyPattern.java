package StrategyPattern;
//定义抽象决策类
public class StrategyPattern {
	public interface Strategy{
		public void strategyMethod();
	} 
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Context c=new Context();
		Strategy s=new ConcreteStrategyA();
		c.setStrategy(s);
		c.stratergyMethod();
		System.out.println("-----------------");
		s=new ConcreteStrategyB();
		c.setStrategy(s);
		c.stratergyMethod();
	}

}
