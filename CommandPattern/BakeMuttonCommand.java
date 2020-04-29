package CommandPattern;

public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}
	@Override
	public void ExcuteCommand() {
		// TODO 自动生成的方法存根
		receiver.BakeMutton();

	}

}
