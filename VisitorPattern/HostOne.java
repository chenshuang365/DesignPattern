package VisitorPattern;

public class HostOne implements Host {

	@Override
	public void accept(Visitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
