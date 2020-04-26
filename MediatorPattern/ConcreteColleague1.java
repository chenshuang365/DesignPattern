package MediatorPattern;
//集体同事类ConcreteColleague1
public class ConcreteColleague1 extends Colleague {

	@Override
	public void receive(){
		// TODO 自动生成的方法存根
		System.out.println("具体同事类1收到请求");
	}

	@Override
	public void send() {
		// TODO 自动生成的方法存根
		System.out.println("具体同事类1发出请求");
		mediator.relay(this);//中介者转发

	}

}
