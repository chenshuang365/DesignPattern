package IteratorPattern;
//具体迭代器
import java.util.List;

public class ConcreteIterator implements Iterator {
	private List<Object> list=null;
	private int index=-1;
	public ConcreteIterator(List<Object> list) {
		this.list=list;
	}
	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		if(index<list.size()-1) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public Object first() {
		// TODO 自动生成的方法存根
		index=0;
		Object obj=list.get(index);
		return obj;
	}

	@Override
	public Object next() {
		// TODO 自动生成的方法存根
		Object obj=null;
		if(this.hasNext()) {
			obj=list.get(++index);
		}return obj;
	}

}
