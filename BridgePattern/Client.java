package BridgePattern;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HandsetBrand ab;
		//ʹ���ֻ�Ʒ��A
		ab=new HandsetBrandA();
		System.out.println("AƷ���ֻ���");
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();

		System.out.println("-------------");
		
		ab=new HandsetBrandB();
		System.out.println("BƷ���ֻ���");
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
	}

}
