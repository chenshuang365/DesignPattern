package VisitorPattern;

public class HostTwo implements Host {

	@Override
	public void accept(Visitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
