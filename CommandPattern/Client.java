package CommandPattern;

public class Client {

	public static void main(String[] args) {
		Barbecuer boy=new Barbecuer();
		Command bakeMuttonCommand1=new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2=new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1=new BakeChickenWingCommand(boy);
		Waiter girl=new Waiter();
		girl.SetOrder(bakeChickenWingCommand1);
		girl.Notify();
		girl.SetOrder(bakeMuttonCommand1);
		girl.Notify();
		girl.SetOrder(bakeMuttonCommand2);
		girl.Notify();
		
	}

}
