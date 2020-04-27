package ProxyPattern;
//�����࣬����һ������ʹ�ô�����Է���ʵ�壬���ṩһ����Subject�Ľӿ���ͬ�Ľӿڣ� �����Ϳ����ô���������ʵ�塣
public class Proxy extends Subject{
	private RealSubject mRealSubject;

	@Override
	public void request() {
		if (mRealSubject == null) {
			mRealSubject = new RealSubject();
		}

		mRealSubject.request();
	}

}
