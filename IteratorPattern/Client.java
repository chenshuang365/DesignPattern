package IteratorPattern;
//�ͻ��˲���
public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Aggregate ag=new ConcreteAggregate();
		ag.add("��ɽ��ѧ");
		ag.add("������ѧ");
		ag.add("�人��ѧ");
		System.out.println("�ۺϵ����ݣ�");
		Iterator it=(Iterator) ag.getIterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob.toString()+"\t");
		}
		Object ob=it.first();
		System.out.println("\nFirst:"+ob.toString());
	}

}
