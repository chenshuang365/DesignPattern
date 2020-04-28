package FacadePattern;
//客户端调用基金买入卖出方法
public class Client {
	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buyFund();
		System.out.println("--------------");
		fund.sellFund();
	}
}
