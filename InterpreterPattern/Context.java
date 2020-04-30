package InterpreterPattern;

public class Context {
	private String[] citys= {"����","���"};
	private String[] persons= {"����","��Ů","��ͯ"};
	private Expression cityPerson;
	public Context() {
		Expression city=new TerminalExpression(citys);
		Expression person=new TerminalExpression(persons);
		cityPerson=new AndExpression(city,person);
		
	}
	public void freeRide(String info) {
		boolean ok=cityPerson.interpret(info);
		if(ok) System.out.println("����"+info+"��������ѳ˳�");
		else System.out.println(info+"�㲻�������Ա���˳��۷���Ԫ");
	}
}
