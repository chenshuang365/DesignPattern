package AdapterPattern;

public class Client {
	public static void main(String[] args) {
		System.out.println("������ģʽ���ԣ�");
		Motor motor=(Motor) ReadXML.getObject();
		motor.drive();
	}
}
