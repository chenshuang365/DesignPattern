package SingletonDesignPattern;

public class Singleton {
	private static Singleton mInstance;
	private static final Object mLock = new Object();

	private Singleton() {
	}

	public static Singleton getInstance() {
		// ˫����
		if (mInstance == null) {
			// ����
			synchronized (mLock) {
				if (mInstance == null) {
					mInstance = new Singleton();
				}
			}
		}

		return mInstance;
	}
}
