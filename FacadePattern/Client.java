package FacadePattern;
//�ͻ��˵��û���������������
public class Client {
	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buyFund();
		System.out.println("--------------");
		fund.sellFund();
	}
}
