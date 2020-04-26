package PrototypePattern;

public class Client {

	public static void main(String[] args) {
		ConcretePrototype1 c1=new ConcretePrototype1("clark");
		ConcretePrototype1 p1=(ConcretePrototype1) c1.Clone();
		String str1=String.format("id:%s",p1.getID());
		System.out.println(str1);
		
		ConcretePrototype1 c2=new ConcretePrototype1("clark");
		ConcretePrototype1 p2=(ConcretePrototype1) c2.Clone();
		String str2=String.format("id:%s",p2.getID());
		System.out.println(str2);
	}

}
