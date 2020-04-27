package AbstractFactory;
//生产汽车2
public class FactoryTwo extends CarFactory {

	@Override
	public ITire creatTire() {
		// TODO 自动生成的方法存根
		return new SUVITire();
	}

	@Override
	public Engine creatEngine() {
		// TODO 自动生成的方法存根
		return new ImportEngine();
	}

	@Override
	public Brake creatBrake() {
		// TODO 自动生成的方法存根
		return new SeniorBrake();
	}

}
