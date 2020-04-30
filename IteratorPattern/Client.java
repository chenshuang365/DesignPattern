package IteratorPattern;
//客户端测试
public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Aggregate ag=new ConcreteAggregate();
		ag.add("中山大学");
		ag.add("长江大学");
		ag.add("武汉大学");
		System.out.println("聚合的内容：");
		Iterator it=(Iterator) ag.getIterator();
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob.toString()+"\t");
		}
		Object ob=it.first();
		System.out.println("\nFirst:"+ob.toString());
	}

}
