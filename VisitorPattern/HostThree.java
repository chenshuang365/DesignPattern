package VisitorPattern;

public class HostThree implements Host {

	@Override
	public void accept(Visitor visitor) {
		// TODO �Զ����ɵķ������
		visitor.visit(this);
	}

}
