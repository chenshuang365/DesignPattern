package CommandPattern;

public class BakeChickenWingCommand extends Command {
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}
	@Override
	public void ExcuteCommand() {
		// TODO �Զ����ɵķ������
		receiver.BakeChickenWing();
	}

}
