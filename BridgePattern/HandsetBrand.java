package BridgePattern;
//手机品牌抽象类
public abstract class HandsetBrand {
	protected HandsetSoft soft;
	public void setHandsetSoft(HandsetSoft soft) {
		this.soft=soft;
	}
	public abstract void run() ;
}
