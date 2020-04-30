package ObserverPattern;

public class User implements Observer {
	private String name;
	private String message;
	public User(String name) {
		this.name=name;
	}
	@Override
	public void update(String message) {
		// TODO 自动生成的方法存根
		this.message=message;
		read();
	}
	public void read() {
		System.out.println(name+"收到推送消息"+message);
	}
}
