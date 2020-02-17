package Exception;

public class excep4 
{
static String s;
public static void main(String[] args) 
{
	try
	{
	System.out.println(s.length());
	}
	catch(NullPointerException ai)
	{
		System.out.println(ai);
	}
}
}
