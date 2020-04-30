package VisitorPattern;

public class HostOne implements Host {

	@Override
	public void accept(Visitor visitor) {
		// TODO 自动生成的方法存根
		visitor.visit(this);
	}

}
