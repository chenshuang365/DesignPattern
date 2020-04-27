package AbstractFactory;
//��������2
public class FactoryTwo extends CarFactory {

	@Override
	public ITire creatTire() {
		// TODO �Զ����ɵķ������
		return new SUVITire();
	}

	@Override
	public Engine creatEngine() {
		// TODO �Զ����ɵķ������
		return new ImportEngine();
	}

	@Override
	public Brake creatBrake() {
		// TODO �Զ����ɵķ������
		return new SeniorBrake();
	}

}
