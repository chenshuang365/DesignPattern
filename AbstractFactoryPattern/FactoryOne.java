package AbstractFactory;
//��������1
public class FactoryOne extends CarFactory {

	@Override
	public ITire creatTire() {
		// TODO �Զ����ɵķ������
		return new NormalTire();
	}

	@Override
	public Engine creatEngine() {
		// TODO �Զ����ɵķ������
		return new DomesticEngine();
	}

	@Override
	public Brake creatBrake() {
		// TODO �Զ����ɵķ������
		return new NormalBrake();
	}

}
