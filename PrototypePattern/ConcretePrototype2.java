package PrototypePattern;

public class ConcretePrototype2 extends Prototype {

	public ConcretePrototype2(String id) {
		super(id);
	}
	@Override
	public Prototype Clone() {
		// TODO �Զ����ɵķ������
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
