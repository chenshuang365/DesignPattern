package InterpreterPattern;

public class Client {
	public static void main(String[] args) {
		Context bus=new Context();
		bus.freeRide("本地的老人");
		bus.freeRide("本地的年轻人");
		bus.freeRide("外地的妇女");
		bus.freeRide("外地的儿童");
	}
}
