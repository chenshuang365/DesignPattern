package PrototypePattern;

public class ConcretePrototype2 extends Prototype {

	public ConcretePrototype2(String id) {
		super(id);
	}
	@Override
	public Prototype Clone() {
		// TODO 自动生成的方法存根
		Prototype prototype=null;
		try {
			prototype =(Prototype)clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}

}
