package ObserverPattern;

public class Client {
	public static void main(String[] args) {
		WechatServer server =new WechatServer();
		Observer userZhang =new User("张三");
		Observer userLi=new User("李四");
		Observer userWang =new User("王五");
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInfomation("hello world!");
		
		System.out.println("----------------");
		
		server.removeObserver(userZhang);
		server.setInfomation("hello China!");
	}
}
