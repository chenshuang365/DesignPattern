package DecoratorPattern;
//�ͻ��˴��룬���ṩװ��
public class Client {

	public static void main(String[] args) {
		//Jack�ķ�װ����
		Person jack =new Person("Jack");
		Suits a=new Suits();
		Tie b=new Tie();
		LeatherShoes c=new LeatherShoes();
		a.Decorate(jack);
		b.Decorate(a);
		c.Decorate(b);
		c.show();
		
		System.out.println("--------------");
		
		//Rose�ķ�װ����
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
