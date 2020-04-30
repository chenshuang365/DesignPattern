package MementoPattern;

public class Client {
	public static void main(String[] args) {
		Originator or=new Originator();
		Caretaker cr=new Caretaker();
		or.setState("S0");
		System.out.println("³õÊ¼×´Ì¬"+or.getState());
		cr.setMemento(or.creatMemento());
		or.setState("S1");
		System.out.println("ÐÂµÄ×´Ì¬"+or.getState());
		or.restoreMemento(cr.getMemento());
		System.out.println("»Ö¸´×´Ì¬"+or.getState());
	}
}
