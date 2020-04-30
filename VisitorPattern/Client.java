package VisitorPattern;

public class Client {
	public static void main(String[] args) {
		Host host = new HostManager();
		host.accept(new VisitorOne());
		
	}
}
