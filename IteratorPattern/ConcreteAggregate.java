package IteratorPattern;
//����ۺ�
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list=new ArrayList<Object>();
	@Override
	public void add(Object obj) {
		// TODO �Զ����ɵķ������
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		// TODO �Զ����ɵķ������
		list.remove(obj);
	}
	
	public Iterator getIterator() {
		return (Iterator) (new ConcreteIterator(list));
	}

}
