package VisitorPattern;
//������
public class VisitorOne implements Visitor {

	@Override
	public void visit(HostManager manager) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڷ��ʵ��ǹܼ�");
	}

	@Override
	public void visit(HostOne one) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڷ��ʵ���Host1");
	}

	@Override
	public void visit(HostTwo two) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڷ��ʵ���Host2");
	}

	@Override
	public void visit(HostThree three) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڷ��ʵ���Host3");
	}
	
}
