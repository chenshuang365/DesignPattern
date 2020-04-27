package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CarFactory FactoryOne=new FactoryOne();
		FactoryOne.creatTire().tire();
		FactoryOne.creatEngine().engine();
		FactoryOne.creatBrake().brake();
		//生产汽车1的工厂
		System.out.println("-------------------");
		
		CarFactory FactoryTwo=new FactoryTwo();
		FactoryTwo.creatTire().tire();
		FactoryTwo.creatEngine().engine();
		FactoryTwo.creatBrake().brake();
		//生产汽车2的工厂
	}

}
