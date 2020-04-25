package AbstractFactoryPattern;
//����һ�������࣬���ṩһ����������������
public class ComputerFactory {
	public static Computer creatComputer(String type) {
		Computer TypeComputer=null;
		switch(type) {
			case "Lenovo":
				TypeComputer=new LenovoComputer();
				break;
			case "Dell":
					TypeComputer=new DellComputer();
					break;
			case"Hp":
				TypeComputer =new HpComputer();
				break;
		}
				return TypeComputer;
			
		
		
	}
}
