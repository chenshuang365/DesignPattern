package ChainOfResposibilityPattern;
//客户端实现
public class Client {
	public static void main(String[] args) {
		Handler handler1=new ConcreteHandler1();
		Handler handler2=new ConcreteHandler2();
		handler1.setNext(handler2);
		handler1.handlerRequest("two");
	}
}
