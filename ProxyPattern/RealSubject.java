package ProxyPattern;
//����Proxy���������ʵʵ��
public class RealSubject extends Subject{
	@Override
	public void request() {
		System.out.println("��ʵ����");
	}
}
