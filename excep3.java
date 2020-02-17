package Exception;

public class excep3 
{
	public static void main(String[] args) {
		
	
int a=10,b=0;
int c[]=new int[5];
try
{
	try
	{
	c[2]=100;
	System.out.println(c[7]);
	}
catch(ArrayIndexOutOfBoundsException aie)
{
	System.out.println(aie);
}

	System.out.println(a/b);
}
catch(ArithmeticException ai) 
{
	System.out.println(ai);
}
}
}