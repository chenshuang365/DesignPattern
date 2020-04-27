package AbstractFactory;
//抽象汽车工厂类
public abstract class CarFactory {
	public abstract ITire creatTire();//生产轮胎
	public abstract Engine creatEngine();//生产发动机
	public abstract Brake creatBrake();
}
