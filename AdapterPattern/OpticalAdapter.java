package AdapterPattern;
//����������
public class OpticalAdapter implements Motor {
	private OpticalMotor omotor;
	public OpticalAdapter() {
		omotor =new OpticalMotor();
	}
	@Override
	public void drive() {
		// TODO �Զ����ɵķ������
		omotor.opticalDrive();
	}

}
