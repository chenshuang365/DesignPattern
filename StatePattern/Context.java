package StatePattern;

public class Context {
	private State state;
	public Context() {
	this.state=new ConcreteStateA();
	}
	public void setState(State state) {
		this.state=state;
	}
	public State getState() {
		return(state);
	}
	public void Handle() {
		state.Handle(this);
	}
}
