package IteratorPattern;
//����ۺϽӿ�
import java.util.Iterator;

public interface Aggregate {
	public void add(Object obj);
	public void remove(Object obj);
	public Iterator getIterator();
}
