package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {
	private List<Observer> list;
	private String message;
	public WechatServer() {
		list=new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO 自动生成的方法存根
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO 自动生成的方法存根
		if(!list.isEmpty()) {
			list.remove(o);
	}
	}
	@Override
	public void notifyObserver() {
		// TODO 自动生成的方法存根
		for(int i=0;i<list.size();i++) {
			Observer oserver=list.get(i);
			oserver.update(message);
	}
}
	public void setInfomation(String s) {
		this.message=s;
		System.out.println("微信服务更新消息： "+s);
		notifyObserver();
	}
}