package AbstractFactory;
//生产汽车1
public class FactoryOne extends CarFactory {

	@Override
	public ITire creatTire() {
		// TODO 自动生成的方法存根
		return new NormalTire();
	}

	@Override
	public Engine creatEngine() {
		// TODO 自动生成的方法存根
		return new DomesticEngine();
	}

	@Override
	public Brake creatBrake() {
		// TODO 自动生成的方法存根
		return new NormalBrake();
	}

}
