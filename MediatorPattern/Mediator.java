package MediatorPattern;
//定义一个抽象中介者
public abstract class Mediator {
	public abstract void register(Colleague colleague);
	public abstract void relay(Colleague c1);//转发
}
