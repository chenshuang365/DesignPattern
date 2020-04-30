package IteratorPattern;
//具体聚合
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list=new ArrayList<Object>();
	@Override
	public void add(Object obj) {
		// TODO 自动生成的方法存根
		list.add(obj);
	}

	@Override
	public void remove(Object obj) {
		// TODO 自动生成的方法存根
		list.remove(obj);
	}
	
	public Iterator getIterator() {
		return (Iterator) (new ConcreteIterator(list));
	}

}
