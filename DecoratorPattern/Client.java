package DecoratorPattern;
//客户端代码，并提供装饰
public class Client {

	public static void main(String[] args) {
		//Jack的服装修饰
		Person jack =new Person("Jack");
		Suits a=new Suits();
		Tie b=new Tie();
		LeatherShoes c=new LeatherShoes();
		a.Decorate(jack);
		b.Decorate(a);
		c.Decorate(b);
		c.show();
		
		System.out.println("--------------");
		
		//Rose的服装修饰
		Person Rose=new Person("Rose");
		TShirts x=new TShirts();
		Trouser y=new Trouser();
		Sneakers z=new Sneakers();
		x.Decorate(Rose);
		y.Decorate(x);
		z.Decorate(y);
		z.show();
		
	}

}
