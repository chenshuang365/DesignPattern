package ObserverPattern;

public class Client {
	public static void main(String[] args) {
		WechatServer server =new WechatServer();
		Observer userZhang =new User("����");
		Observer userLi=new User("����");
		Observer userWang =new User("����");
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("hello world!");
		
		System.out.println("----------------");
		
		server.removeObserver(userZhang);
		server.setInfomation("hello China!");
	}
}
