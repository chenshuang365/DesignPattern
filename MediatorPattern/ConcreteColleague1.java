package MediatorPattern;
//����ͬ����ConcreteColleague1
public class ConcreteColleague1 extends Colleague {

	@Override
	public void receive(){
		// TODO �Զ����ɵķ������
		System.out.println("����ͬ����1�յ�����");
	}

	@Override
	public void send() {
		// TODO �Զ����ɵķ������
		System.out.println("����ͬ����1��������");
		mediator.relay(this);//�н���ת��

	}

}
