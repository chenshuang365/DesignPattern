package StatePattern;

public class ConcreteStateB extends State{
	public void Handle(Context context) {
		System.out.println("��ǰ״̬��B");
		context.setState(new ConcreteStateA());
	}
}
