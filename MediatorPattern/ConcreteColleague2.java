package MediatorPattern;

public class ConcreteColleague2 extends Colleague {

	@Override
	public void receive() {
		// TODO �Զ����ɵķ������
		System.out.println("����ͬ����2�յ�����");
	}

	@Override
	public void send() {
		// TODO �Զ����ɵķ������
		System.out.println("����ͬ����2��������");
		mediator.relay(this);//�н���ת��
	}

}
