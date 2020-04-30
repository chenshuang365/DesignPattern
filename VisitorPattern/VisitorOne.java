package VisitorPattern;
//访问者
public class VisitorOne implements Visitor {

	@Override
	public void visit(HostManager manager) {
		// TODO 自动生成的方法存根
		System.out.println("现在访问的是管家");
	}

	@Override
	public void visit(HostOne one) {
		// TODO 自动生成的方法存根
		System.out.println("现在访问的是Host1");
	}

	@Override
	public void visit(HostTwo two) {
		// TODO 自动生成的方法存根
		System.out.println("现在访问的是Host2");
	}

	@Override
	public void visit(HostThree three) {
		// TODO 自动生成的方法存根
		System.out.println("现在访问的是Host3");
	}
	
}
