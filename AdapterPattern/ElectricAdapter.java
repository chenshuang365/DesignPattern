package AdapterPattern;
//电能适配器
public class ElectricAdapter implements Motor {
	private ElectricMotor emotor;
	public ElectricAdapter() {
		emotor=new ElectricMotor();
	}
	@Override
	public void drive() {
		// TODO 自动生成的方法存根
		emotor.electricDrive();
	}

}
