package StatePattern;

public class ConcreteStateA extends State{
	public void Handle(Context context) {
		System.out.println("µ±Ç°×´Ì¬ÊÇA");
		context.setState(new ConcreteStateB());
	}
}

