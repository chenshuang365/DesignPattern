package CommandPattern;

public class BakeChickenWingCommand extends Command {
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}
	@Override
	public void ExcuteCommand() {
		// TODO 自动生成的方法存根
		receiver.BakeChickenWing();
	}

}
