package StatePattern;

public class ConcreteStateA extends State{
	public void Handle(Context context) {
		System.out.println("��ǰ״̬��A");
		context.setState(new ConcreteStateB());
	}
}

