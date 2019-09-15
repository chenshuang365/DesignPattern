
public class java3 {
	public static void main(String[]args )
	{
int a=99;
String s1="bottle";String s2="bottles";
for (;a>0;a--)
{if (a>1)
	System.out.println(a+s2+"of beer on the wall,"+a+s2 +"of beer.");
else if (a==1)
	System.out.println(a+s1+"of beer on the wall,"+a+s1 +"of beer.");
	System.out.println("Take one down." );
	System.out.println("Pass it down.");
	if (a-1>1)
	System.out.println(a-1+s2+"of beer on the wall.");
	else if (a-1==1)
		System.out.println(a-1+s1+"of beer on the wall.");
	else if (a-1==0)
		System.out.println("No more bottle of beer on the wall.");
	
}
	}
}

