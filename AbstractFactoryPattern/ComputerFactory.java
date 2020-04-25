package AbstractFactoryPattern;
//创建一个工厂类，并提供一个方法来生产电脑
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
