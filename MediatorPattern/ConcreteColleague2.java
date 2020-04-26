package MediatorPattern;

public class ConcreteColleague2 extends Colleague {

	@Override
	public void receive() {
		// TODO 自动生成的方法存根
		System.out.println("具体同事类2收到请求");
	}

	@Override
	public void send() {
		// TODO 自动生成的方法存根
		System.out.println("具体同事类2发出请求");
		mediator.relay(this);//中介者转发
	}

}
