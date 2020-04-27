package AdapterPattern;

public class Client {
	public static void main(String[] args) {
		System.out.println("ÊÊÅäÆ÷Ä£Ê½²âÊÔ£º");
		Motor motor=(Motor) ReadXML.getObject();
		motor.drive();
	}
}
