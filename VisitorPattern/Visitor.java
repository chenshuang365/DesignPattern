package VisitorPattern;
//�����߽ӿ�
public interface Visitor {
	public void visit(HostManager manager);
	public void visit(HostOne one);
	public void visit(HostTwo two);
	public void visit(HostThree three);
}
