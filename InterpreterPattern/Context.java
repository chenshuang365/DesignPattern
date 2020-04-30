package InterpreterPattern;

public class Context {
	private String[] citys= {"本地","外地"};
	private String[] persons= {"老人","妇女","儿童"};
	private Expression cityPerson;
	public Context() {
		Expression city=new TerminalExpression(citys);
		Expression person=new TerminalExpression(persons);
		cityPerson=new AndExpression(city,person);
		
	}
	public void freeRide(String info) {
		boolean ok=cityPerson.interpret(info);
		if(ok) System.out.println("你是"+info+"，本次免费乘车");
		else System.out.println(info+"你不是免费人员，乘车扣费两元");
	}
}
