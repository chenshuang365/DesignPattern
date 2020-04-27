package BridgePattern;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HandsetBrand ab;
		//使用手机品牌A
		ab=new HandsetBrandA();
		System.out.println("A品牌手机：");
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();

		System.out.println("-------------");
		
		ab=new HandsetBrandB();
		System.out.println("B品牌手机：");
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
	}

}
