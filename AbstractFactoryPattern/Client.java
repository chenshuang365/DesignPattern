package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		CarFactory FactoryOne=new FactoryOne();
		FactoryOne.creatTire().tire();
		FactoryOne.creatEngine().engine();
		FactoryOne.creatBrake().brake();
		//��������1�Ĺ���
		System.out.println("-------------------");
		
		CarFactory FactoryTwo=new FactoryTwo();
		FactoryTwo.creatTire().tire();
		FactoryTwo.creatEngine().engine();
		FactoryTwo.creatBrake().brake();
		//��������2�Ĺ���
	}

}
