package AbstractFactoryPattern;
//客户端调用工厂类，并生产电脑
public class CreatComputer {

	public static void main(String[] args) {
		ComputerFactory c=new ComputerFactory();
		c.creatComputer("Dell").start();

	}

}
