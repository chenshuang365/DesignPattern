package StrategyPattern;
//������������
public class StrategyPattern {
	public interface Strategy{
		public void strategyMethod();
	} 
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
