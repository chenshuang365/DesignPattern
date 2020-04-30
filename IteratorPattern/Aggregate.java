package IteratorPattern;
//抽象聚合接口
import java.util.Iterator;

public interface Aggregate {
	public void add(Object obj);
	public void remove(Object obj);
	public Iterator getIterator();
}
