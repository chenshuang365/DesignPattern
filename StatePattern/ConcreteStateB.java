package StatePattern;

public class ConcreteStateB extends State{
	public void Handle(Context context) {
		System.out.println("µ±Ç°×´Ì¬ÊÇB");
		context.setState(new ConcreteStateA());
	}
}
