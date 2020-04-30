package ObserverPattern;

public class User implements Observer {
	private String name;
	private String message;
	public User(String name) {
		this.name=name;
	}
	@Override
	public void update(String message) {
		// TODO �Զ����ɵķ������
		this.message=message;
		read();
	}
	public void read() {
		System.out.println(name+"�յ�������Ϣ"+message);
	}
}
