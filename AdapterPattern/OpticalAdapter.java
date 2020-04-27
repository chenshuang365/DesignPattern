package AdapterPattern;
//光能适配器
public class OpticalAdapter implements Motor {
	private OpticalMotor omotor;
	public OpticalAdapter() {
		omotor =new OpticalMotor();
	}
	@Override
	public void drive() {
		// TODO 自动生成的方法存根
		omotor.opticalDrive();
	}

}
