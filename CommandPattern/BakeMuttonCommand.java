package CommandPattern;

public class BakeMuttonCommand extends Command {
	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}
	@Override
	public void ExcuteCommand() {
		// TODO �Զ����ɵķ������
		receiver.BakeMutton();

	}

}
