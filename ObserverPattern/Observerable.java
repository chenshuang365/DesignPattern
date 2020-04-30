package ObserverPattern;
//定义一个观察者方法
public interface Observerable {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
