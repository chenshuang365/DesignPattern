package AbstractFactoryPattern;
//�ͻ��˵��ù����࣬����������
public class CreatComputer {

	public static void main(String[] args) {
		ComputerFactory c=new ComputerFactory();
		c.creatComputer("Dell").start();

	}

}
